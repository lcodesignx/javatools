package builderDesignPattern;

public class TestUser {

	public static void main(String[] args) {
		// Create user object using builder class
		User user1 = new User.UserBuilder("Albert", "Einstein")
				.age(36)
				.phone("123456789")
				.address("Fake address 1234")
				.build();
		
		System.out.println(user1);
		
		User user2 = new User.UserBuilder("Nikola", "Tesla").build();
		
		System.out.println(user2);
	}

}
