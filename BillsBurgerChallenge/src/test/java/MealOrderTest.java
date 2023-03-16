import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MealOrderTest {
    Burger cheeseburger = new Burger("Cheeseburger", 20);

    @Test
    void burgerType() {
        assertEquals("Cheeseburger", cheeseburger.getType());
    }

    @Test
    void burgerPrice() {
        assertEquals(20, cheeseburger.getPrice());
    }

    @Test
    void doesPriceBelowOneThrowIllegalArgumentException() {
/*
        IllegalArgumentException priceBelowZero = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            cheeseburger.setPrice(0);
        });
 */
        IllegalArgumentException priceBelowZero = Assertions.assertThrows(IllegalArgumentException.class,
                () -> cheeseburger.setPrice(0));
        assertEquals(priceBelowZero.getMessage(), "Price can't be below 1");
    }
}
