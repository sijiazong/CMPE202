public class EnoughCoinState implements State {
    GumballMachine gumballMachine;
 
    public EnoughCoinState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
  
    public void insertCoin(int coin) {
        System.out.println("You already inserted enough coin, please turn crank.");
    }
 
    public void ejectCoin() {
        System.out.println("All coins have been ejected. Total Coins Ejected: " + gumballMachine.totalCoins + " cents");
        gumballMachine.setState(gumballMachine.getNotEnoughCoinState());
    }
 
    public void turnCrank() {
        System.out.println("You turned...");
        gumballMachine.setState(gumballMachine.getSoldState());
        gumballMachine.totalCoins -= gumballMachine.getCost();
    }

    public void dispense() {
        System.out.println("No gumball dispensed");
    }
 
    public String toString() {
        return "waiting for turn of crank";
    }
}
