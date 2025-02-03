package week3.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertInteractions {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/alert.xhtml");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Click on Prompt Box Alert
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		//Switch to the Alert and type a message
		Alert promptAlert = driver.switchTo().alert();
		promptAlert.sendKeys("Soundarya");
		String textInPrompt = promptAlert.getText();
		System.out.println("Text present inside alert box:"+textInPrompt);
		promptAlert.dismiss();
		
		String text = driver.findElement(By.xpath("//span[@id='confirm_result']")).getText();
		System.out.println("Text after dismissing the Alert box:"+text);
		
		driver.close();

	}

}
