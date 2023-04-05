import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MealOrderTest {
    Burger cheeseburger = new Burger("Cheeseburger", 20);
    Drink wine = new Drink("Wine", 100);
    Side fries = new Side("Fries", 5);

    DeluxeBurger doubleCheeseburger = new DeluxeBurger("Double Cheeseburger");

    @Test
    void burgerType() {
        assertEquals("Cheeseburger", cheeseburger.getType());
    }

    @Test
    void burgerPrice() {
        cheeseburger.setPrice(1);
        assertEquals(1, cheeseburger.getPrice());
    }

    @Test
    void doesBurgerPriceBelowOneThrowIllegalArgumentException() {
        IllegalArgumentException priceBelowZero = assertThrows(IllegalArgumentException.class, () -> cheeseburger.setPrice(0));
        assertEquals(priceBelowZero.getMessage(), "Price can't be below 1");
    }

    @Test
    void burgerToppings() {
        cheeseburger.setToppings(3);
        assertEquals(3, cheeseburger.getToppings());
    }

    @Test
    void maximumOfThreeToppings() {
        IllegalArgumentException maximumToppings = assertThrows(IllegalArgumentException.class, () -> cheeseburger.setToppings(4));
        assertEquals(maximumToppings.getMessage(), "Maximum of 3 toppings allowed and negative values are invalid");
    }

    @Test
    void drinkType() {
        assertEquals("Wine", wine.getType());
    }

    @Test
    void canSetTheSize() {
        assertEquals(100, wine.getSize());
        wine.setSize(150);
        assertEquals(150, wine.getSize());
    }

    @Test
    void wineHasToBeAtLeastOneHundred() {
        try {
            new Drink("Red Wine", 99);
        } catch (IllegalArgumentException e) {
            System.out.printf(e.getMessage());
        }
    }


    @Test
    void doesDrinkSizeBelowOneHundredThrowIllegalArgumentException() {
        IllegalArgumentException drinkSizeBelowHundred = assertThrows(IllegalArgumentException.class, () -> wine.setSize(99));
        assertEquals(drinkSizeBelowHundred.getMessage(), "Drinks cant be less that 100 ml");
    }

    @Test
    void drinkPrice() {
        assertEquals(150, wine.getPrice());
    }

    @Test
    void sideType() {
        assertEquals("Fries", fries.getType());
    }

    @Test
    void sidePrice() {
        assertEquals(5, fries.getPrice());
    }

    @Test
    void doesSidePriceBelowOneThrowIllegalArgumentException() {
        IllegalArgumentException priceBelowZero = assertThrows(IllegalArgumentException.class, () -> fries.setPrice(0));
        assertEquals(priceBelowZero.getMessage(), "Price can't be below 1");
    }

    @Test
    void deluxeBurgerType() {
        assertEquals("Double Cheeseburger", doubleCheeseburger.getType());
    }

    @Test
    void deluxeBurgerPrice() {
        assertEquals(30, doubleCheeseburger.getPrice());
    }

    @Test
    void deluxeBurgerToppings() {
        doubleCheeseburger.setToppings(3, 5);
        assertEquals(3, doubleCheeseburger.getToppings());
    }

    @Test
    void settingToppingsOfTheDeluxeBurger() {
        doubleCheeseburger.setToppings(3);
        assertEquals(3, doubleCheeseburger.getToppings());
    }

    @Test
    void maximumOfFiveToppingsForDeluxeBurger() {
        IllegalArgumentException maximumToppings = assertThrows(IllegalArgumentException.class, () -> doubleCheeseburger.setToppings(-1, 5));
        assertEquals(maximumToppings.getMessage(), "Maximum of 5 toppings allowed and negative values are invalid");
    }

//    @Test
//    void mealOrderBurger() {
//        assertEquals("Cheeseburger", "");
//    }
}
