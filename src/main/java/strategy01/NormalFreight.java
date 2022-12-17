package strategy01;

public class NormalFreight implements Freight {

	@Override
	public double calculate(Integer numKilometers) {
		return numKilometers * 1.2D;
	}


}
