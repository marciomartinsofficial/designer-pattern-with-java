package strategy01;

public class Main {

	public static void main(String[] args) {
		Integer numKilometers = Integer.parseInt(args[0]);
		TypeFreight typeFreight = TypeFreight.valueOf(args[1]);
		Freight freight = typeFreight.instance();
		System.out.println(freight.calculate(numKilometers));
	}

}
