package Builder01;

public class Client {

	public static void main(String[] args) {
		DirectorCarBuilder directorCarBuilder = new DirectorCarBuilder();
		Car unoMilleCar = directorCarBuilder.createUnoMilleCar();
		Car pageroCar = directorCarBuilder.createPageroCar();
	}

}
