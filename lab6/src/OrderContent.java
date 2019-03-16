public class OrderContent {

    private PrintingStrategy printingStrategy;

    public OrderContent(PrintingStrategy ps) {
        this.printingStrategy = ps;
    }

    void executeStrategy(Order order) {

        printingStrategy.printOrder(order);
    }
}
