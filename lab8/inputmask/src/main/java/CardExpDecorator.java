public class CardExpDecorator extends DisplayDecorator {
    public CardExpDecorator(IDisplayComponent component) {
        super(component);
    }

    public String display() {
        String date = component.display();
        if (date.equals(""))
            return "[MM/YY]  ";

        StringBuilder out = new StringBuilder();
        out.append("[     ]  ");
        for (int i = 0; i < date.length(); i++) {
            if (i == 0) {
                out.setCharAt(i + 1, date.charAt(i));
            } else if (i == 1) {
                out.setCharAt(i + 1, date.charAt(i));
                out.setCharAt(i + 2, '/');
            } else {
                out.setCharAt(i + 2, date.charAt(i));
            }
        }
        return out.toString();
    }
}