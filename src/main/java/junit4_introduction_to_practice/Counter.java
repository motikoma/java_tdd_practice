package junit4_introduction_to_practice;

public class Counter {
    int count = 0;

    public int getCount() {
        return count;
    }

    public int increment() {
        return ++count;
    }
}
