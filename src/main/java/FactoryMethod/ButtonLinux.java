package FactoryMethod;

public class ButtonLinux implements Button {

	@Override
	public void render() {
		System.out.println("Button Linux render");
	}

	@Override
	public void onClick() {
		System.out.println("OnClick Linux render");
	}

}
