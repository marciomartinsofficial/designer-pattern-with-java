package FactoryMethod;

public class DialogWindows extends Dialog {

	@Override
	public Button createButton() {
		return new ButtonWindows();
	}

}
