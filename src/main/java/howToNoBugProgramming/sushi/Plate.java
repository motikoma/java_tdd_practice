package howToNoBugProgramming.sushi;

public class Plate {

    private final Type type;
    private int lap;

    enum Type {
        RED(100),
        BLUE(300),
        YELLOW(450);

        private final int price;

        Type(int price) {
            this.price = price;
        }

        int getPrice() {
            return price;
        }
    };

    private Plate(Type type, int lap) {
        this.type = type;
        this.lap = lap;
    }

    public int getPrice() {
        if(this.type == Type.RED) {
            return getDiscountPrice(Type.RED.getPrice(), this.lap);
        }
        if(this.type == Type.BLUE) {
            return getDiscountPrice(Type.BLUE.getPrice(), this.lap);
        }
        if(this.type == Type.YELLOW) {
            return getDiscountPrice(Type.YELLOW.getPrice(), this.lap);
        }
        return 0;
    }

    public static Plate createRedPlate(int lap) {
        return new Plate(Type.RED, lap);
    }

    public static Plate createBluePlate(int lap) {
        return new Plate(Type.BLUE, lap);
    }

    public static Plate createYellowPlate(int lap) {
        return new Plate(Type.YELLOW, lap);
    }

    private int getDiscountPrice(int price, int lap) {
        if(lap >= 1 && lap <= 4) {
            return price;
        }
        if(lap >= 5 && lap <= 9) {
            return (int) Math.round(price - (price * 0.1));
        }
        if(lap >= 10) {
            return (int) Math.round(price - (price * 0.2));
        }
        throw new IllegalArgumentException("lapには1以上の整数を入力してください");
    }
}
