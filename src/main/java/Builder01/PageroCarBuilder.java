package Builder01;

public class PageroCarBuilder implements CarBuilder {

	private Car pageroCar = new Car();

	@Override
	public void reset() {
		pageroCar = new Car();
	}
	
	@Override
	public void buildEngine() {
		pageroCar.setEngine("Engine Big 3.0");
	}

	@Override
	public void buildBodywork() {
		pageroCar.setBodywork("Hard bodywork");;
	}

	@Override
	public void buildWheels() {
		pageroCar.setWhells("17\" wheels");;
	}

	@Override
	public void buildSeats() {
		pageroCar.setSeats("Especial seats");;
	}
	
	public Car createPageroCar() {
		Car newPageroCar = pageroCar;
		reset();
		return newPageroCar;
	}
	
}
