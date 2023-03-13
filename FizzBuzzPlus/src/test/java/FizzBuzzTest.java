import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {

    FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    void printOne() {
        Assertions.assertEquals("1", fizzBuzz.print(1));
    }

    @Test
    void printFizz() {
        Assertions.assertEquals("Fizz", fizzBuzz.print(5));
    }

    @Test
    void printBuzz() {
        Assertions.assertEquals("Buzz", fizzBuzz.print(3));
    }
}