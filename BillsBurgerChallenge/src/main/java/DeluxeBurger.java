public class DeluxeBurger {

    private String type;
    private int toppings;

    public DeluxeBurger(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public int getToppings() {
        return toppings;
    }

    public void setToppings(int toppings) {
        if (toppings > 5 || toppings < 0) {
            throw new IllegalArgumentException("Maximum of 5 toppings allowed and negative values are invalid");
        } else {
            this.toppings = toppings;
        }
    }

    public int getPrice() {
        return 30;
    }
}
