package week3.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		//Load the URL()
		driver.get("https://leafground.com/checkbox.xhtml");
		//Maximize the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Thread.sleep(2000);
		
		//Click on Basic CheckBox 
		driver.findElement(By.id("j_idt87:j_idt89")).click();
		//Verify Message is displayed
		boolean selectBasic = driver.findElement(By.id("j_idt87:j_idt89")).isEnabled();
		System.out.println("Basic Checkbox status:"+selectBasic);
		
		//Click on Notification CheckBox 
		driver.findElement(By.id("j_idt87:j_idt91")).click();
		//Verify Message is displayed
		boolean selectNotification = driver.findElement(By.id("j_idt87:j_idt91")).isEnabled();
		System.out.println("Notification Checkbox:"+selectNotification);
		
		//setTimoeout(function(){debugger},5000;
		
		//Click on favorite Language
		driver.findElement(By.xpath("//label[text()='Java']")).click();
		
		//Tri-State CheckBox
		driver.findElement(By.id("j_idt87:ajaxTriState")).click();
		
		//Verify which Tri-State option has been chosen
		WebElement element1 = driver.findElement(By.xpath("//span[text()='State has been changed.']/following::p"));
		String text = element1.getText();
		System.out.println("Tri-State option: "+text);
		
		//Click on Toggle Switch
		driver.findElement(By.className("ui-toggleswitch-slider")).click();
		//Verify that the expected message is displayed. 
		String switchToggle = driver.findElement(By.xpath("//span[@class='ui-growl-title']")).getText();
		System.out.println("Toggle Switch status is:"+switchToggle);
		
		//Verify CheckBox is Disabled
		boolean enabled = driver.findElement(By.id("j_idt87:j_idt102_input")).isEnabled();
		System.out.println("Checkbox is enable: "+enabled);
		
		//Select Multiple options on Page
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-triangle-1-s']")).click();
		//Perform any additional actions or verifications required. 
		//Search the text 
		driver.findElement(By.xpath("//input[contains(@class,'ui-inputfield ui-inputtext')]")).sendKeys("Amsterdam");
		//Select Amsterdam
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='j_idt87:multiple_panel']/div[2]/ul[1]/li[9]/div[1]/div[2]")).click();
		//Close the DropDown
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-close']")).click();
		String dropdownText = driver.findElement(By.xpath("//span[text()='Amsterdam']")).getText();
		System.out.println("Dropdown Selection: "+dropdownText);
		
		//Close browser
		driver.close();
	}

}
