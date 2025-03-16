package rowley.dylan.financetracker.income.service.fixed.commands;

import rowley.dylan.financetracker.shared.IncomeType;
import rowley.dylan.financetracker.shared.Occurrence;

public record CreateFixedIncomeCommand(
    String incomeName,
    Occurrence occurrence,
    IncomeType incomeType,
    Double value
) {

}
