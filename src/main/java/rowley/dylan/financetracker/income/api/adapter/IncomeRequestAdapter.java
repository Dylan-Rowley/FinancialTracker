package rowley.dylan.financetracker.income.api.adapter;

import org.springframework.stereotype.Component;
import rowley.dylan.financetracker.income.service.commands.CreateCustomIncomeCommand;
import rowley.dylan.financetracker.income.service.commands.CreateFixedIncomeCommand;
import rowley.dylan.financetracker.income.service.results.CreateFixedIncomeResult;
import rowley.dylan.financetracker.shared.IncomeType;
import rowley.dylan.financetracker.shared.Occurrence;
import rowley.dylan.oas.model.CreateCustomIncomeRequestDTO;
import rowley.dylan.oas.model.CreateFixedIncomeRequestDTO;
import rowley.dylan.oas.model.CreateFixedIncomeResponseDTO;

@Component
public class IncomeRequestAdapter {

  public CreateFixedIncomeCommand createFixedIncomeRequestToCommand(CreateFixedIncomeRequestDTO dto) {
    return new CreateFixedIncomeCommand(
        dto.getIncomeName(),
        Occurrence.valueOf(dto.getIncomeOccurrence().name()),
        IncomeType.valueOf(dto.getIncomeType().name()),
        dto.getIncomeValue()
    );
  }

  public CreateCustomIncomeCommand createCustomIncomeRequestToCommand(
      CreateCustomIncomeRequestDTO dto) {
    return null;
  }

  public CreateFixedIncomeResponseDTO createFixedIncomeResultToResponse(CreateFixedIncomeResult incomeResult) {
    return null;
  }
}
