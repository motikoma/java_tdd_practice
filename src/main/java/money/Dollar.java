package money;

// バリューオブジェクト：コンストラクタで設定したインスタンス変数の値が変わらない
// バリューオブジェクトを使えば別名参照問題を防ぐことができる
// フィールドをprivateにしておくことで間違った代入を防ぐことができる
// ファクトリメソッドを採用する
class Dollar extends Money {
  Dollar(int amount, String currency) {
    super(amount, currency);
  }

  Money times(int multiplier) {
    return Money.dollar(this.amount * multiplier);
  }
}
