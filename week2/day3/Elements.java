package week2.day3;

public class Elements extends Button {

	public static void main(String[] args) {
		Elements element = new Elements();
		element.submit();
		element.click();
		System.out.println(element.setText("Text from subclass:Elements"));

	}

}
