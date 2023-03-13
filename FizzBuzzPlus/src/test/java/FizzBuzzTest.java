import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {

    @Test
    void printOne() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String fizzBuzzOutput = fizzBuzz.print(1);
        Assertions.assertEquals("1", fizzBuzzOutput);
    }

    @Test
    void printFizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String fizzPrint = fizzBuzz.print(5);
        Assertions.assertEquals("Fizz", fizzPrint);
    }
}