package musicApp;

public class User {
	
	private Basket basket;
	private String userFullName;
	
	
	public User(Basket basket, String userFullName) {
		super();
		this.basket = basket;
		this.userFullName = userFullName;
	}

	public void addUser(User user) {
		
		System.out.println("Kullanıcı Eklendi--> "+ user.userFullName);
	}

	public Basket getBasket() {
		return basket;
	}

	public void setBasket(Basket basket) {
		this.basket = basket;
	}

	public String getUserFullName() {
		return userFullName;
	}

	public void setUserFullName(String userFullName) {
		this.userFullName = userFullName;
	}
	
	

}
