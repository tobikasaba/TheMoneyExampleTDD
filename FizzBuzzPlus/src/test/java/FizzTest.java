import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class FizzTest {
//    List<Integer> oneToHundredTest = new ArrayList<>();

    @Test
    void testRangeOfNumbers() {
        List<Integer> oneToHundredTest = new ArrayList<>();
        FizzClass oneToHundred = new FizzClass();
        int startingNumber = 1;
        int endNumber = 100;
        for (int i = startingNumber; i < endNumber; i++) {
            oneToHundredTest.add(i);
        }
        Assertions.assertEquals(oneToHundredTest, oneToHundred.numberRange(startingNumber, endNumber));
    }
}
