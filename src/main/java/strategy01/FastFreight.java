package strategy01;

public class FastFreight implements Freight {

	@Override
	public double calculate(Integer numKilometers) {
		return numKilometers * 1.5D;
	}

}
