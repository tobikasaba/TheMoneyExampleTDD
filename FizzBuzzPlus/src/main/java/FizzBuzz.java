public class FizzBuzz {

    public FizzBuzz() {
    }

    public String print(int number) {
        StringBuilder result = new StringBuilder();
        if (number % 5 == 0 || Integer.toString(number).contains("5")) {
            result.append("Fizz");
        }
        if (number % 3 == 0 || Integer.toString(number).contains("3")) {
            result.append("Buzz");
        }
        if (result.length() == 0) {
            result.append(number);
        }
        return result.toString();
    }

    public void printAll() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(print(i));
        }
    }
}
