public class Fries implements OrderItem {

    private String description;
    private int quantity;
    private double price;

    public Fries(String description, double price) {
        this.description = description;
        this.price = price;
        this.quantity = 1;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Double getPrice() {
        return price * quantity;
    }

    public String getDescription() {
        return description;
    }

}