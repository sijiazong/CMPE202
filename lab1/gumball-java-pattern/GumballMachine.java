/* CMPE 202 Lab 1 Part1
 * @author (Sijia Zong)
 */

public class GumballMachine {

    State soldOutState;
    State notEnoughCoinState;
    State enoughCoinState;
    State soldState;

    State state = soldOutState;
    int count = 0;
    int totalCoins = 0;

    private int cost;
    private boolean quarterOnly;

    public GumballMachine(int numberGumballs, int cost, boolean quarterOnly) {
        soldOutState = new SoldOutState(this);
        notEnoughCoinState = new NotEnoughCoinState(this);
        enoughCoinState = new EnoughCoinState(this);
        soldState = new SoldState(this);

        this.count = numberGumballs;
        if (numberGumballs > 0) {
            state = notEnoughCoinState;
        }

        this.cost = cost;
        this.totalCoins = 0;
        this.quarterOnly = quarterOnly;
    }

    public void insertCoin(int coin) {
        if(isCoinValid(quarterOnly, coin)){
            state.insertCoin(coin);
        }
        else{
            System.out.println("Coin not accepted, invalid coin.");
        }
    }

    public void ejectCoin() {
        state.ejectCoin();
        totalCoins = 0;
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    void setState(State state) {
        this.state = state;
    }

    void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (count != 0) {
            count = count - 1;
        }
    }

    int getCount() {
        return count;
    }

    int getCost() {
        return cost;
    }

    void refill(int count) {
        this.count += count;
        state = notEnoughCoinState;
    }

    public State getState() {
        return state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNotEnoughCoinState() {
        return notEnoughCoinState;
    }

    public State getEnoughCoinState() {
        return enoughCoinState;
    }

    public State getSoldState() {
        return soldState;
    }

    boolean isCoinValid(boolean quarterOnly, int coin){
        if(quarterOnly) {
            if (coin == 25) return true;
            else return false;
        }
        else {
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
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nMighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #2004");
        result.append("\nInventory: " + count + " gumball");
        if (count != 1) {
            result.append("s");
        }
        result.append("\nPrice: " + cost + " cents/Gumball");
        if (quarterOnly) {
            result.append("\nPlease insert only quarters.");
        }
        result.append("\n");
        result.append("Machine is " + state + "\n");
        return result.toString();
    }
}
