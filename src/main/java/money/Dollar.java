package money;

import java.util.Objects;

// バリューオブジェクト：コンストラクタで設定したインスタンス変数の値が変わらない
// バリューオブジェクトを使えば別名参照問題を防ぐことができる
// フィールドをprivateにしておくことで間違った代入を防ぐことができる
public class Dollar {

  private int amount;

  Dollar(int amount) {
    this.amount = amount;
  }

  Dollar times(int multiplier) {
    return new Dollar(this.amount * multiplier);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Dollar dollar = (Dollar) o;
    return amount == dollar.amount;
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount);
  }
}
