package strategy;

// Context
public class AnimalMaster {

	private Animal animal;
	private String target;
	
	public AnimalMaster(Animal animal, String target) {
		this.animal = animal;
		this.target = target;
	}
	
	public void commandoAttack() {
		System.out.println(animal.attack(target));
	}
	
}
