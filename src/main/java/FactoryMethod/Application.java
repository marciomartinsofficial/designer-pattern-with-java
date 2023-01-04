package FactoryMethod;

import java.util.Random;

public class Application {

	public static void main(String[] args) {
		
		Dialog dialog;
		
		int operatingSystem = new Random().nextInt() % 2 == 0 ? 1 : 2;
		
		if (operatingSystem == 1) {
			dialog = new DialogWindows();
		} else if (operatingSystem == 2) {
			dialog = new DialogLinux();
		} else {
			throw new RuntimeException("Impossible solve...");
		}
		
		dialog.render();
	}

}
