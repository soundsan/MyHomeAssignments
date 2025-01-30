package week2.day3;

public class RadioButton extends Button {
	public void selectRadioButton() {
		System.out.println("Radio button selected");
	}

	public static void main(String[] args) {
		RadioButton radiobutton = new RadioButton();
		radiobutton.selectRadioButton();
		radiobutton.submit();
		radiobutton.click();
		System.out.println(radiobutton.setText("Text from subclass:RadioButton"));
	}

}
