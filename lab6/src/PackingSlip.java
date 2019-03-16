import java.util.List;

public class PackingSlip implements PrintingStrategy {
    public void printOrder(Order order) {
        System.out.println("Order Number " + order.getOrderNumber());
        System.out.println(order.getDate() + "    " + order.getTime());
        System.out.println("FIVE GUYS");

        for (OrderItem item : order.getItems()) {
            System.out.println(item.getQuantity() + "\t" + item.getDescription());
            if (item instanceof Burger) {
                List<Topping> toppings = ((Burger) item).getToppings();
                for (Topping t : toppings) {
                    if (t.getPosition().equals("TOP")) {
                        System.out.println(t.getDescription());
                    }
                }
                for (Topping t : toppings) {
                    if (t.getPosition().equals("MIDDLE")) {
                        System.out.println("->|" + t.getDescription());
                    }
                }
                for (Topping t : toppings) {
                    if (t.getPosition().equals("BOTTOM")) {
                        System.out.println("{{{{ " + t.getDescription() + " }}}}");
                    }
                }
            }
            System.out.println();
        }
    }
}
