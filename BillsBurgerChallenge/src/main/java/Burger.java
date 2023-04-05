public class Burger {
    protected int toppings;
    private int price;
    private String type;

    public Burger(String type, int price) {
        this.type = type;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price < 1) {
            throw new IllegalArgumentException("Price can't be below 1");
        }
        this.price = price;
    }

    public int getToppings() {
        return toppings;
    }

    public void setToppings(int toppings) {
        if (toppings > 3 || toppings < 0) {
            throw new IllegalArgumentException("Maximum of 3 toppings allowed and negative values are invalid");
        }
        this.toppings = toppings;
    }
}
