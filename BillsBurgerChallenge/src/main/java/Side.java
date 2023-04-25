public class Side extends Items {


    public Side(String type, int price) {
        this.type = type;
        setPrice(price);
    }

    public String getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price < 1) throw new IllegalArgumentException("Price can't be below 1");
        this.price = price;
    }
}
