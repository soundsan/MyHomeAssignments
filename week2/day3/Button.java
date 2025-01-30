package week2.day3;

public class Button extends WebElement {
	  public void submit() {
		  System.out.println("Button is clicked");
	  }

	public static void main(String[] args) {
		Button button = new Button();
		button.submit();
		button.click();
		System.out.println(button.setText("Text from sub class:Button"));

	}

}
