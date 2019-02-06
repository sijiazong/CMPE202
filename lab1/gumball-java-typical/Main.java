

public class Main {

    public static void main(String[] args) {
        //test Gumball Machine 1, 5 gumball, 50 cents cost, only accept Quarters.
        GumballMachine gumballMachine1 = new GumballMachine(5,50,true);

        System.out.println("Testing gumball model 2 "+ gumballMachine1);

        gumballMachine1.insertCoin( 25 );
        gumballMachine1.turnCrank();
        gumballMachine1.insertCoin( 25 );
        gumballMachine1.turnCrank();
        
        //test Gumball Machine 2, 5 gumball, 50 cents cost, accept all coins.
        GumballMachine gumballMachine2 = new GumballMachine(5,50,false);
        System.out.println("Testing gumball model 3 "+ gumballMachine2);

        gumballMachine2.insertCoin( 10 );
        gumballMachine2.turnCrank();
        gumballMachine2.insertCoin( 15 );
        gumballMachine2.insertCoin( 10 );
        gumballMachine2.insertCoin( 5 );
        gumballMachine2.insertCoin( 25 );
        gumballMachine2.turnCrank();

        //System.out.println(gumballMachine2);
    }
}
