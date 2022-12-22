package Builder01;

public class DirectorCarBuilder {

	public Car createUnoMilleCar() {
		UnoMilleCarBuilder unoMilleCarBuilder = new UnoMilleCarBuilder();
		build(unoMilleCarBuilder);
		Car newUnoMilleCar = unoMilleCarBuilder.createUnoMilleCar();
		return newUnoMilleCar;
	}
	
	private void build(CarBuilder carBuilder) {
		carBuilder.buildEngine();
		carBuilder.buildBodywork();
		carBuilder.buildWheels();
		carBuilder.buildSeats();
	}
	
}
