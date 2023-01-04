package FactoryMethod;

public class DialogLinux extends Dialog {

	@Override
	public Button createButton() {
		return new ButtonLinux();
	}

}
