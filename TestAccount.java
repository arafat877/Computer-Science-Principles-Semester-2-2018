
public class TestAccount {

	public static void main(String[] args) {
		Account account = new Account("4292", "My Account", 219481);
		
		System.out.println(account);
		
		account.debit(2319);
		
		System.out.println("New Account Balance: " + account);
		
		account.transferTo(account, 2319);
		
		System.out.println("New Account Balance: " + account);

	}

}
