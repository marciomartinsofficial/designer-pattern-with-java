package FactoryMethod;

public class ButtonWindows implements Button {

	@Override
	public void render() {
		System.out.println("Button Windows render");
	}

	@Override
	public void onClick() {
		System.out.println("OnClick Windows render");
	}

}
