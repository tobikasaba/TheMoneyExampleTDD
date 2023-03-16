public class Burger {
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
        } else {
            this.price = price;
        }
    }


}
