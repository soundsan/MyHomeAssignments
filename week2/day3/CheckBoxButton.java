package week2.day3;

public class CheckBoxButton extends Button {
	public void clickCheckbutton() {
		System.out.println("Button is clicked");
	}
	

	public static void main(String[] args) {
		CheckBoxButton buttonoptions = new CheckBoxButton();
		buttonoptions.clickCheckbutton();
		buttonoptions.submit();
		buttonoptions.click();
		System.out.println(buttonoptions.setText("Text from subclass:CheckBoxButton"));

	}

}
