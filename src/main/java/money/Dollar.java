package money;

// バリューオブジェクト：コンストラクタで設定したインスタンス変数の値が変わらない
// バリューオブジェクトを使えば別名参照問題を防ぐことができる
// フィールドをprivateにしておくことで間違った代入を防ぐことができる
// ファクトリメソッドを採用する
public class Dollar extends Money {

  Dollar(int amount) {
    this.amount = amount;
  }

  Money times(int multiplier) {
    return new Dollar(this.amount * multiplier);
  }
}
