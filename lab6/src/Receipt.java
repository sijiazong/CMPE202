import java.util.List;

public class Receipt implements PrintingStrategy {
    public void printOrder(Order order) {
        System.out.println("FIVE GUYS\n" +
                "BURGERS AND FRIES\n" +
                "STORE # CA-1294\n" +
                "5353 ALMANDEN EXPY N60\n" +
                "SAN JOSE, CA 95118\n" +
                "(P) 408-264-9300\n");
        System.out.println(order.getDate() + "    " + order.getTime());
        System.out.println("FIVE GUYS");
        System.out.println("Order Number " + order.getOrderNumber());

        for (OrderItem item : order.getItems()) {
            System.out.println(item.getQuantity() + "\t" + item.getDescription() + "\t\t" + item.getPrice());
            if (item instanceof Burger) {
                List<Topping> toppings = ((Burger) item).getToppings();
                for (Topping t : toppings) {
                    switch (t.getPosition()) {
                        case "BOTTOM":
                            System.out.println("{{{{ " + t.getDescription() + " }}}}");
                            break;
                        case "MIDDLE":
                            System.out.println("->|" + t.getDescription());
                            break;
                        case "TOP":
                            System.out.println(t.getDescription());
                            break;
                        default:
                            System.out.println(t.getDescription());
                            break;
                    }
                }
            }
            System.out.println();
        }
        System.out.println("Sub. Total:\t\t:" + order.getSubtotal());
        System.out.println("Tax:\t\t:" + order.getTax());
        System.out.println("Total:\t\t:" + order.getTotal());
    }
}
