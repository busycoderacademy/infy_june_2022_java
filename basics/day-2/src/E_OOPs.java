class Account {
	private int id;
	private String name;
	private double balance;
	
	private static String bankName="SBI";
	
	//we can have static method to access static data
	
	public static String getBankName() {
		return bankName;
	}
	public Account() {}
	
	public Account(int id, String name, double balance) {
		this.id=id;
		this.name=name;
		this.balance=balance;
	}
	
	public void printAccDetails() {
		System.out.println("Id: "+ id+" name: "+ name+" balance: "+  balance);
	}
	
	//getter : used to get the values and setter: used to set the values
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getBalance() {
		return balance;
	}
	
	//setter
	public void setBalance(double newBalance) {
		this.balance=newBalance;
	}
	//it is a concept of overriding
	
//	public String toString() {
//		return  "Id: "+ id+" name: "+ name+" balance: "+  balance;
//	}
}
public class E_OOPs {
	
	public static void main(String[] args) {
		Account account=new Account(121, "raja", 390);
	
		account.printAccDetails();
		
		//what if i want to access id and name outside the account class?
		
		System.out.println(account.getId());
		System.out.println(account.getName());
		System.out.println(account.getBalance());
		
		System.out.println(Account.getBankName());
		
	}

}
