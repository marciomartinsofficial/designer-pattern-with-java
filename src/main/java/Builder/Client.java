package Builder;

public class Client {

	public static void main(String[] args) {
		PersonBuilder personBuilder = new PersonBuilder();
		
		Person personMike = personBuilder
				.setAge(20)
				.setHeight(1.8d)
				.setWeight(88.2d)
				.setNickName("Nice Boy")
				.createPerson("Mike");
		
		Person personKelly = personBuilder
				.setAge(22)
				.setHeight(1.72d)
				.setWeight(69.2d)
				.setNickName("Fast Gril")
				.createPerson("Kelly");
		
		System.out.println("Hello! I am " + personMike.getName());
		System.out.println("Hi! I am " + personKelly.getName());
	}

}
