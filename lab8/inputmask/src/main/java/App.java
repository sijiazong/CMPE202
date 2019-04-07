/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

/**
 *  Main App Class for Displaying Screen.
 */
public class App {

    private Screen screen;
    private CreditCardNum num;
    private CreditCardExp exp;
    private CreditCardCVC cvc;
    private CardNumDecorator cnd;
    private CardExpDecorator ced;
    private int count;

    public App() {

        screen = new Screen();
        num = new CreditCardNum();
        exp = new CreditCardExp();
        cvc = new CreditCardCVC();
        cnd = new CardNumDecorator(num);
        ced = new CardExpDecorator(exp);

        screen.addSubComponent(cnd);
        screen.addSubComponent(ced);
        screen.addSubComponent(cvc);

        count = 0;

    }

    public String display() {
        String output = "";
        output += "========================================\n";
        output += screen.name() + "\n";
        output += "========================================\n";
        output += "\n\n\n\n";
        output += screen.display() + "\n";
        output += "\n\n\n\n";
        output += "========================================\n";
        return output;
    }

    public void key(String ch) {
        if (ch.length() == 1)
        {
            if (Character.isDigit(ch.charAt(0)))
            {
                if (count < 23)
                {
                    count++;
                    screen.key(ch, count);
                }
            }
        }
    }
}

