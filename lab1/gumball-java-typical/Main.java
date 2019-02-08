/* CMPE 202 Lab 1 Part1
 * Test Part for Lab 1 Part 1
 * @author (Sijia Zong) 
 */

public class Main {

    public static void main(String[] args) {
        //test Gumball Machine 1, 5 gumball, 25 cents cost, only accept Quarters.
        GumballMachine gumballMachine1 = new GumballMachine(5,25,true);

        System.out.println("Testing gumball model 1 "+ gumballMachine1);

        //test invalid coin
        gumballMachine1.insertCoin( 10 );
        gumballMachine1.turnCrank();
        
        //test valid coin
        gumballMachine1.insertCoin( 25 );
        gumballMachine1.turnCrank();
        
        //test Gumball Machine 2, 5 gumball, 50 cents cost, only accept Quarters.
        GumballMachine gumballMachine2 = new GumballMachine(5,50,true);
        System.out.println("Testing gumball model 2 "+ gumballMachine2);

        gumballMachine2.insertCoin( 25 );
        gumballMachine2.turnCrank();
        gumballMachine2.insertCoin( 25 );
        gumballMachine2.turnCrank();

        //test Gumball Machine 3, 5 gumball, 50 cents cost, accept all valid coins.
        GumballMachine gumballMachine3 = new GumballMachine(5,50,false);

        System.out.println("Testing gumball model 3 "+ gumballMachine3);

        gumballMachine3.insertCoin( 10 );
        gumballMachine3.turnCrank();
        gumballMachine3.insertCoin( 10 );
        gumballMachine3.insertCoin( 5 );
        gumballMachine3.insertCoin( 25 );
        gumballMachine3.turnCrank();
    }
}
