package JavaProgram.DecisionMakingStatement;

public class Account {

	public static void main(String[] args) {
		double bal = 10000.00;
		double withdrawAmt = 5000.00;
		
		if(bal<=10000) {
			System.out.println("Sufficient Balance");
			
		    System.out.println("Withdrawal successful");
		    
		    bal = bal-withdrawAmt;
		    System.out.println("Remaining balance: "+bal);
			}
		else {
			System.out.println("Withdrawal is failed");
		}
	}

}
