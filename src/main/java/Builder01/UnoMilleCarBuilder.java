package Builder01;

public class UnoMilleCarBuilder implements CarBuilder {

	private Car unoMilleCar = new Car();

	@Override
	public void reset() {
		unoMilleCar = new Car();
	}
	
	@Override
	public void buildEngine() {
		unoMilleCar.setEngine("Engine fire 1.0");
	}

	@Override
	public void buildBodywork() {
		unoMilleCar.setBodywork("Light bodywork");;
	}

	@Override
	public void buildWheels() {
		unoMilleCar.setWhells("13\" wheels");;
	}

	@Override
	public void buildSeats() {
		unoMilleCar.setSeats("Simple seats");;
	}
	
	public Car createUnoMilleCar() {
		Car newUnoMilleCar = unoMilleCar;
		reset();
		return newUnoMilleCar;
	}
	
}
