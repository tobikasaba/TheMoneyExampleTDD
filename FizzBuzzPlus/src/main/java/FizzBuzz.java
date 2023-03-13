public class FizzBuzz {

    public FizzBuzz() {
    }

    public String print(int number) {
        if (number % 5 == 0 || Integer.toString(number).contains("5")) {
            return "Fizz";
        } else if (number % 3 == 0 || Integer.toString(number).contains("3")) {
            return "Buzz";
        }
        return Integer.toString(number);
    }
}
