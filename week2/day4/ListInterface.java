package week2.day4;

import org.openqa.selenium.chrome.ChromeDriver;

public class ListInterface {

	public static void main(String[] args) {
		//Launch the Browser
		ChromeDriver driver = new ChromeDriver();
		//Load the URL()
		driver.get("https://www.amazon.in/");
		//Maximize the window
		driver.manage().window().maximize();
		//Search phone
	}

}
