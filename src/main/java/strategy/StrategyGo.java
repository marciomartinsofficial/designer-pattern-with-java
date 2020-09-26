package strategy;

public class StrategyGo {

	public static void main(String args[]) {
		
		AnimalMaster animalMaster1 = new AnimalMaster(new Dog(), "thief");
		AnimalMaster animalMaster2 = new AnimalMaster(new Rooster(), "worm");
		
		animalMaster1.commandoAttack();
		animalMaster2.commandoAttack();
		animalMaster1.commandoAttack();
		animalMaster1.commandoAttack();
		animalMaster2.commandoAttack();
		animalMaster1.commandoAttack();
		animalMaster1.commandoAttack();
		animalMaster2.commandoAttack();
		
	}
	
}
