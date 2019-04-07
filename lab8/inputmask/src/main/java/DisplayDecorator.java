public class DisplayDecorator implements IDisplayComponent, IKeyEventHandler {

    protected IDisplayComponent component;

    DisplayDecorator(IDisplayComponent component) {
        this.component = component;
    }

    public String display() {
        return component.display();
    }

    public void addSubComponent(IDisplayComponent c) {
        //do nothing
    }

    public void setNext(IKeyEventHandler next) {
        IKeyEventHandler c = (IKeyEventHandler) component;
        c.setNext(next);
    }

    public void key(String ch, int cnt) {
        IKeyEventHandler c = (IKeyEventHandler) component;
        c.key(ch, cnt);
    }
}
