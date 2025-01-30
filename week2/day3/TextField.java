package week2.day3;

public class TextField extends WebElement {
	public String getText(String text) {
		System.out.println("Text from WebElement");
		return text;
	}

	public static void main(String[] args) {
		TextField fields = new TextField();
		fields.getText(null);
		fields.click();
		System.out.println(fields.setText("Text from subclass:TextField"));

	}

}
