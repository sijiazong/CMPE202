import java.text.DecimalFormat;
import java.util.Iterator;

public class CustomBurger extends Composite
{
    PriceDecorator decorator = null ;
    
    public CustomBurger ( String d )
    {
        super(d) ;
    }
    
    public void setDecorator( PriceDecorator p )
    {
        this.decorator = p ;
    }
    
    public void printDescription() {
        DecimalFormat fmt = new DecimalFormat("0.00");
        System.out.println( " " + description + " " + fmt.format(decorator.getPrice()) );
  /*        Iterator it = this.components.iterator();
        while(it.hasNext()) {
            Component obj = (Component)it.next();
            obj.printDescription();
        }
         */
        for (Component obj  : components)
        {
            obj.printDescription();
        }
        
    }
}

       