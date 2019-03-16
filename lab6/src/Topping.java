public class Topping implements OrderItem {
    private String description;
    private String position;

    public Topping(String description, String position) {
        this.description = description;
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public String getDescription() {
        return description;
    }

    public Integer getQuantity() {
        return null;
    }

    public Double getPrice() {
        return null;
    }

}
