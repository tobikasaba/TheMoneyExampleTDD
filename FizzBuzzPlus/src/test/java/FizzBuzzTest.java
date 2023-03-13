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

    @Test
    void containsFizz() {
        Assertions.assertEquals("Fizz", fizzBuzz.print(52));
    }

    @Test
    void printTwo() {
        Assertions.assertEquals("2", fizzBuzz.print(2));
    }

    @Test
    void containsBuzz() {
        Assertions.assertEquals("Buzz", fizzBuzz.print(31));
    }

    @Test
    void containsFizzBuzz() {
        int[] values = {51, 15};
        for (int i : values)
            Assertions.assertEquals("FizzBuzz", fizzBuzz.print(i));
    }

    @Test
    void printAll() {
        fizzBuzz.printAll();
    }
}