import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class SelectionTest {

    @Test
    void isEqual(){
        assertEquals(Selection.of(0,1), Selection.of(0,1));
    }

    @Test
    void isNotEqual(){
        assertNotEquals(Selection.of(0,1), Selection.of(0,0));
    }
}