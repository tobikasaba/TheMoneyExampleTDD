public class FizzBuzz {

    public FizzBuzz() {
    }

    public String print(int number) {
        if (number % 5 == 0) {
            return "Fizz";
        } else if (number % 3 == 0) {
            return "Buzz";
        }
        return "1";
    }
}
