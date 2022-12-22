package Builder01;

public class DirectorCarBuilder {

	public UnoMilleCar createUnoMilleCar() {
		UnoMilleCarBuilder unoMilleCarBuilder = new UnoMilleCarBuilder();
		build(unoMilleCarBuilder);
		UnoMilleCar newUnoMilleCar = unoMilleCarBuilder.createUnoMilleCar();
		return newUnoMilleCar;
	}
	
	private void build(CarBuilder carBuilder) {
		carBuilder.buildEngine();
		carBuilder.buildBodywork();
		carBuilder.buildWheels();
		carBuilder.buildSeats();
	}
	
}
