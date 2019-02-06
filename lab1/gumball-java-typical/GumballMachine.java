
public class GumballMachine
{

    private int num_gumballs;
    private int cost;
    private int total_coins;
    private boolean only_accept_quarter;

    public GumballMachine( int size, int cost, boolean only_accept_quarter)
    {
        // initialise instance variables
        this.num_gumballs = size;
     //   this.has_quarter = false;
        this.cost = cost;
        this.total_coins = 0;
        this.only_accept_quarter = only_accept_quarter;
    }

    public void insertCoin(int coin)
    {
        if (only_accept_quarter && (coin!=25) )
        {
            System.out.println("Invalid Coin! Please insert only quarters.");
        }
        else
        {
            if(isCoinValid(coin))
            {
                total_coins = total_coins + coin;
                System.out.println("You have inserted " + this.total_coins +" cents.");
            }
            else
            {
                System.out.println("Please insert valid coins.");
            }
        }
    }
    
    //Function to test if the coin is valid for the machine.
    //Valid coins are considered to be value of only coins of the United States dollar in circulation.
    public boolean isCoinValid(int coin)
    {
        if (coin == 1)//Penny
        return true;
        if (coin == 5)//Nikel
        return true;
        if (coin == 10)//Dime
        return true;
        if (coin == 25)//Quarter
        return true;
        if (coin == 50)//Half Dollar
        return true;
        else 
        return false;
    }
    
    public boolean enoughCoin()
    {
        if(total_coins == cost)
            return true;
        else
            return false;
    }
    
    public void turnCrank()
    {
        if ( this.enoughCoin())
        {
            if ( this.num_gumballs > 0 )
            {
                this.num_gumballs-- ;
                this.total_coins = 0 ;
                System.out.println( "Thanks for your coins. Gumball Ejected!" ) ;
            }
            else
            {
                System.out.println( "No More Gumballs!  Sorry, can't return your coins." ) ;
            }
        }
        else 
        {
            System.out.println( "Not enough Coins, please insert more coins." ) ;
        }        
    }
}
