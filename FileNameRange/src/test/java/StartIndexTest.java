import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class StartIndexTest {

    @Test
    void checkTheFirstIndexOfTheFileNameIsZero() {
        FileName indexIsZero = new FileName();
        Assertions.assertEquals(0,
                indexIsZero.firstIndex("hiker.cpp"));
    }

    @Test
    void checkTheSecondIndexMatches() {
        FileName lastIndex = new FileName();
        Assertions.assertEquals(5,
                lastIndex.secondIndex("hiker.cpp"));
    }

    @Test
    void testTheIndexesInTheArray() {
        FileName indexArray = new FileName();
        int[] testIndexArray = {0, 5};
        Assertions.assertEquals(Arrays.toString(testIndexArray), indexArray.addIndexToArray());
    }


    @Test
    void fileNameContainingKeyWords() {
        FileName startingIndex = new FileName();
        Assertions.assertEquals(5,
                startingIndex.specialIndex("fizz.buzz-tests.js"));
    }
}
