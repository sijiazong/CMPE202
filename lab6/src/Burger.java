import java.util.ArrayList;
import java.util.List;

public class Burger implements OrderItem {

    private String description;
    private int quantity;
    private double price;
    private List<Topping> toppings;

    public Burger(String description, double price) {
        this.toppings = new ArrayList<>();
        this.description = description;
        this.price = price;
        this.quantity = 1;
    }

    public String getDescription() {
        return description;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Double getPrice() {
        return price * quantity;
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public void addTopping(Topping t) {
        toppings.add(t);
    }
}
