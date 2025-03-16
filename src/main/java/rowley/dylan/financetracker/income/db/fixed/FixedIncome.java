package rowley.dylan.financetracker.income.db.fixed;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import rowley.dylan.financetracker.shared.IncomeType;
import rowley.dylan.financetracker.shared.Occurrence;

@Entity
@Getter
public class FixedIncome {

  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private String id;
  private String incomeName;
  private String occurrence;
  private String incomeType;
  private Double value;

  public FixedIncome() {}

  public FixedIncome(String incomeName, String occurrence, String incomeType,
      Double value) {
    this.incomeName = incomeName;
    this.occurrence = occurrence;
    this.incomeType = incomeType;
    this.value = value;
  }

}
