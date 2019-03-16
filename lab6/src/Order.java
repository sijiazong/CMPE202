import java.util.ArrayList;
import java.util.List;


public class Order {

    private String date;
    private String time;
    private List<OrderItem> items;
    private int orderNumber;
    private double subtotal;

    public Order(String date, String time, int orderNumber) {
        this.subtotal = 0;
        this.date = date;
        this.time = time;
        this.orderNumber = orderNumber;
        this.items = new ArrayList<>();
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public double getSubtotal() {
        return Math.round(subtotal * 100.0) / 100.0;
    }

    public double getTax() {
        double tax = (this.subtotal * 0.09);
        return Math.round(tax * 100.0) / 100.0;
    }

    public double getTotal() {
        double total = (this.getTax() + this.getSubtotal());
        return Math.round(total * 100.0) / 100.0;
    }

    public void addItem(OrderItem item) {
        items.add(item);
        subtotal += item.getPrice();
    }
}