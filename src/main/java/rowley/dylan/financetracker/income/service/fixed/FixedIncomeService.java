package rowley.dylan.financetracker.income.service.fixed;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import rowley.dylan.financetracker.income.service.fixed.commands.CreateFixedIncomeCommand;
import rowley.dylan.financetracker.income.service.fixed.results.CreateFixedIncomeResult;


@Service
@RequiredArgsConstructor
public class FixedIncomeService {

  private final FixedIncomeServiceAdapter fixedIncomeServiceAdapter;

  public CreateFixedIncomeResult createFixedIncome(CreateFixedIncomeCommand command) {
    return null;
  }
}
