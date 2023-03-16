import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MealOrderTest {
    Burger burger = new Burger("Cheeseburger", 20);

    @Test
    void burgerType() {
        String cheeseburger = burger.burgerType("Cheeseburger");
        Assertions.assertEquals("Cheeseburger", cheeseburger);
    }

    @Test
    void burgerPrice() {
        int cheeseburger = burger.burgerPrice(20);
        Assertions.assertEquals(20, cheeseburger);
    }

}
