package shain;

public class Shacho {
    private Shain shain;
    private final String arg;

    public Shacho(String arg) {
        this.arg = arg;
    }

    public void orderStandUp() {
        if(this.arg == "Tanto") {
            this.shain = new Tanto();
        }
        if(this.arg == "Shunin") {
            this.shain = new Shunin();
        }
        if(this.arg == "Bucho") {
            this.shain = new Bucho();
        }

        System.out.println(shain.standUp());

        throw new RuntimeException("Unknown shain");
    }
}
