public class Drink extends Items {

    private double size;

    public Drink(String type, double size) {
        super();
        this.type = type;
        setSize(size);
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return size * 1.5;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        if (size < 100) throw new IllegalArgumentException("Drinks cant be less that 100 ml");
        this.size = size;
    }

}
