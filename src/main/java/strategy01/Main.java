package strategy01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("How many quilometers? ");
			Integer numKilometers = scanner.nextInt();
			System.out.println("Type of freight? ");
			TypeFreight typeFreight = TypeFreight.valueOf(scanner.next());
			
			Freight freight = typeFreight.instance();
			System.out.println(freight.calculate(numKilometers));
		}
	}

}
