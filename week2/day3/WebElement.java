package week2.day3;

public class WebElement {
	
	public void click() {
		System.out.println("Click the Button");
	}
	public String setText(String text) {
		return text;
	}

	public static void main(String[] args) {
		WebElement element = new WebElement();
		element.click();
		System.out.println(element.setText("Text from Parent class"));

	}

}
