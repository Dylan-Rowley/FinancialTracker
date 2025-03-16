package rowley.dylan.financetracker.income.api;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import rowley.dylan.financetracker.income.api.adapter.IncomeRequestAdapter;
import rowley.dylan.financetracker.income.service.custom.CustomIncomeService;
import rowley.dylan.financetracker.income.service.fixed.FixedIncomeService;
import rowley.dylan.financetracker.income.service.fixed.commands.CreateFixedIncomeCommand;
import rowley.dylan.financetracker.income.service.fixed.results.CreateFixedIncomeResult;
import rowley.dylan.oas.api.IncomeApi;
import rowley.dylan.oas.model.CreateCustomIncomeRequestDTO;
import rowley.dylan.oas.model.CreateCustomIncomeResponseDTO;
import rowley.dylan.oas.model.CreateFixedIncomeRequestDTO;
import rowley.dylan.oas.model.CreateFixedIncomeResponseDTO;

@RestController
@RequiredArgsConstructor
public class IncomeController implements IncomeApi {

  private final IncomeRequestAdapter incomeAdapter;
  private final FixedIncomeService fixedIncomeService;
  private final CustomIncomeService customIncomeService;


  @Override
  public ResponseEntity<CreateFixedIncomeResponseDTO> createFixedIncome(
      CreateFixedIncomeRequestDTO requestDTO) {
    CreateFixedIncomeCommand command = this.incomeAdapter.createFixedIncomeRequestToCommand(requestDTO);
    CreateFixedIncomeResult incomeResult = this.fixedIncomeService.createFixedIncome(command);
    CreateFixedIncomeResponseDTO responseDTO = this.incomeAdapter.createFixedIncomeResultToResponse(incomeResult);
    return ResponseEntity.ok(responseDTO);
  }

  @Override
  public ResponseEntity<CreateCustomIncomeResponseDTO> createCustomIncome(
      CreateCustomIncomeRequestDTO createCustomIncomeRequestDTO) {

    return IncomeApi.super.createCustomIncome(createCustomIncomeRequestDTO);
  }


}
