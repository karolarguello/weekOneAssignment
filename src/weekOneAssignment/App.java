package weekOneAssignment;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int itemPrice = 34;
		int moneyinWallet	= 243;
		double numberFriends = 20.00;
		double age = 45.00;
		String firstName = "Nancy";
		String lastName = "Philips";
		char middleInitial = 'T';

		System.out.println("Item's Price is: " + itemPrice);
		System.out.println("Ammount of Monney in Wallet is: " + moneyinWallet);
		System.out.println("Number of Friends is: " + numberFriends);
		System.out.println("Person's Age is: " + age);
		System.out.println("Person's Frist Name is: " + firstName);
		System.out.println("Person's Last Name is: " + lastName);
		System.out.println("Person's Middle Initial is: " + middleInitial);
		
		moneyinWallet = moneyinWallet - itemPrice;
		System.out.println("New money in the wallet is: " + moneyinWallet); //New money in wallet
		
		numberFriends = age / numberFriends;
		System.out.println("Number of Friends made based on age: " + numberFriends); //number of Friends made base on age
		
		String fullName = firstName + " " + middleInitial + " " + lastName;
		System.out.println( "Nancy's full name is: " + fullName); // Full Name
		
		
	}

}
