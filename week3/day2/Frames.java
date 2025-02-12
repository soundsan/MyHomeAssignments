package week3.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		//Load the URL()
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		//Maximize the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Outer frame
		driver.switchTo().frame("iframeResult");
		//button
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		//Print the text
		System.out.println(driver.findElement(By.id("demo")).getText());
		driver.switchTo().defaultContent();
		

	}

}
