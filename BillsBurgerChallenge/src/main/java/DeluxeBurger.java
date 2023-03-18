public class DeluxeBurger extends Burger {
    private int toppings;

    public DeluxeBurger(String type) {
        super(type, 30);
    }


    @Override
    public String getType() {
        return super.getType();
    }

    @Override
    public int getToppings() {
        return toppings;
    }

    @Override
    public void setToppings(int toppings) {
        if (toppings > 5 || toppings < 0) {
            throw new IllegalArgumentException("Maximum of 5 toppings allowed and negative values are invalid");
        } else {
            this.toppings = toppings;
        }
    }

    @Override
    public int getPrice() {
        return super.getPrice();
    }
}
