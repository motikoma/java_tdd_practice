package junit4IntroductionToPractice;

public class Calculator {

    public int divide(int x, int y) {
        if(y == 0) throw new IllegalArgumentException("Cannot divide by zero");
        return x / y;
    }
}
