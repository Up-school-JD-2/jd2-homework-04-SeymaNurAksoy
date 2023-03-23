package musicApp;

public class User {
	
	public Basket basket;
	public String userFullName;
	
	
	public User(Basket basket, String userFullName) {
		super();
		this.basket = basket;
		this.userFullName = userFullName;
	}

	public void addUser(User user) {
		
		System.out.println("Kullanıcı Eklendi--> "+ user.userFullName);
	}

}
