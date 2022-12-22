package Builder01;

public class DirectorCarBuilder {

	private void build(CarBuilder carBuilder) {
		carBuilder.buildEngine();
		carBuilder.buildBodywork();
		carBuilder.buildWheels();
		carBuilder.buildSeats();
	}
	
	public Car createUnoMilleCar() {
		UnoMilleCarBuilder unoMilleCarBuilder = new UnoMilleCarBuilder();
		build(unoMilleCarBuilder);
		Car newUnoMilleCar = unoMilleCarBuilder.createUnoMilleCar();
		return newUnoMilleCar;
	}
	
	public Car createPageroCar() {
		PageroCarBuilder pageroCarBuilder = new PageroCarBuilder();
		build(pageroCarBuilder);
		Car newPageroCar = pageroCarBuilder.createPageroCar();
		return newPageroCar;
	}
	
}
