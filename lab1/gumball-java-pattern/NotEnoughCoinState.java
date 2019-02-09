

public class NotEnoughCoinState implements State {
    GumballMachine gumballMachine;
 
    public NotEnoughCoinState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
	public void insertCoin(int coin) {
		System.out.println("You just inserted " + coin +" cents");
		gumballMachine.totalCoins += coin;
		System.out.println("Total: " + gumballMachine.totalCoins +" cents");
		if(gumballMachine.totalCoins >= gumballMachine.getCost()) {
			gumballMachine.setState(gumballMachine.getEnoughCoinState());
		}
	}
 
	public void ejectCoin() {
    	if(gumballMachine.totalCoins != 0){
    		System.out.println("All coins have been ejected. Total Coins Ejected: " + gumballMachine.totalCoins + " cents");
    	}
    	else{
			System.out.println("You haven't insert any coin yet.");
		}
	}
 
	public void turnCrank() {
		System.out.println("You turned, but coin is not enough");
	 }
 
	public void dispense() {
		System.out.println("You need to pay first");
	} 
 
	public String toString() {
		return "waiting for coin";
	}
}
