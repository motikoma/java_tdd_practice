


// Todo
// - [ ] 単価から商品の価格を求める
// - [ ] 税込金額を求める

class Goods {
    private String goodsName;
    private int price;

    public Goods(String goodsName, int price) {
        this.goodsName = goodsName;
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }

    public int getTaxIncludedPrice() {
        return this.price * 110 / 100;
    }
}
