package money;

import java.util.Objects;

class Money implements Expression {
  protected int amount;
  protected String currency;

  Money(int amount, String currency) {
    this.amount = amount;
    this.currency = currency;
  }

  String currency() {
    return currency;
  }
  ;

  Money times(int multiplier) {
    return new Money(this.amount * multiplier, currency);
  }

  Expression plus(Money addend) {
    return new Money(amount + addend.amount, currency);
  }

  static Money dollar(int amount) {
    return new Money(amount, "USD");
  }
  ;

  static Money franc(int amount) {
    return new Money(amount, "CHF");
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Money money = (Money) o;
    return amount == money.amount && currency.equals(money.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount);
  }

  @Override
  public String toString() {
    return "Money{" + "amount=" + amount + ", currency='" + currency + '\'' + '}';
  }
}
