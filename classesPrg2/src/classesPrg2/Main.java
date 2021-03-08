package classesPrg2;
class Account{
	private double bal=0;
	void debit( double amt) {
		if(amt>0 && amt<=bal)
		{
			bal-=amt;
		}
	}
	public void credit(double amt)
	{
		if(amt>0) {
			bal+=amt;
		}
	}
	public void showbalance() {
		System.out.println("current balance is="+bal);
	}
	
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a1=new Account();
		a1.credit(2000);
		a1.debit(500);
		a1.showbalance();
		a1.credit(-1000);
		a1.showbalance();
	}

}
