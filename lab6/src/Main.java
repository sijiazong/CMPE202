public class Main {

    public static void main(String[] args) {
        Order order = new Order("12/12/2016", "1:46:54 PM", 45);

        Burger burger = new Burger("LBB", 5.59);
        burger.addTopping(new Topping("BACON", "BOTTOM"));
        burger.addTopping(new Topping("LETTUCE", "TOP"));
        burger.addTopping(new Topping("TOMATO", "TOP"));
        burger.addTopping(new Topping("G ONION", "MIDDLE"));
        burger.addTopping(new Topping("JALA Grilled", "MIDDLE"));

        Fries fries = new Fries("LTL CAJ", 2.79);

        order.addItem(burger);
        order.addItem(fries);

        System.out.println("Receipt:\n");
        OrderContent orderContent = new OrderContent(new Receipt());
        orderContent.executeStrategy(order);

        System.out.println("\nPacking Slip:\n");
        orderContent = new OrderContent(new PackingSlip());
        orderContent.executeStrategy(order);
    }
}
