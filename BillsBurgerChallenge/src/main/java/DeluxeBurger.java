public class DeluxeBurger extends Burger {

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
        setToppings(toppings, 5);
    }

    public void setToppings(int toppings, int maxToppings) {
        if (toppings > maxToppings || toppings < 0) {
            throw new IllegalArgumentException
                    (String.format("Maximum of %d toppings allowed and " +
                            "negative values are invalid", maxToppings));
        }
        this.toppings = toppings;

    }

    @Override
    public int getPrice() {
        return super.getPrice();
    }
}
