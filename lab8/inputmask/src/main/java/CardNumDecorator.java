public class CardNumDecorator extends DisplayDecorator {
    public CardNumDecorator(IDisplayComponent component) {
        super(component);
    }

    public String display() {
        String number = component.display();
        if (number.equals(""))
            return "[4444 4444 4444 4444]  ";

        StringBuilder out = new StringBuilder();
        out.append("[                   ]  ");
        for (int i = 0; i < number.length(); i++) {
            if (i<4) {
                out.setCharAt(i+1, number.charAt(i));
            } else if (i<8) {
                out.setCharAt(i+2, number.charAt(i));
            } else if (i<12) {
                out.setCharAt(i+3, number.charAt(i));
            } else {
                out.setCharAt(i+4, number.charAt(i));
            }
        }
        return out.toString();
    }
}