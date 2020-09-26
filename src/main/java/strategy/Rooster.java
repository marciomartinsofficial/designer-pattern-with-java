package strategy;

//Concrete strategy
public class Rooster implements Animal {

	public String attack(String target) {
		return "To peck " + target + "!!!";
	}
	
}
