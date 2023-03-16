public class Burger {
    private int price;
    private String type;
    public Burger(String type, int price) {
        this.type = type;
        this.price = price;
    }

    public String burgerType(String type) {
        return type;
    }

    public int burgerPrice(int price) {
        return price;
    }
}
