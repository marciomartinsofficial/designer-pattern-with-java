package strategy;

// Concrete strategy
public class Dog implements Animal {
	
	public String attack(String target) {
		return "To bite " + target + "!!!";
	}
	
}
