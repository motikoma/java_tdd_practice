package fizzbuzz;

public class FizzBuzz {
  public String convert(int num) {
    if (num % 15 == 0){
      return "fizzbuzz";
    }
    if (num % 3 == 0) {
      return "fizz";
    }
    if (num % 5 == 0){
        return "buzz";
    }
    return String.valueOf(num);
    }
}
