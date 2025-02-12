package week3.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundButtonInteraction {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		//Load the URL()
		driver.get("https://leafground.com/button.xhtml");
		//Maximize the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Thread.sleep(2000);
		
		//Click on Button with text Click and Confirm Title
		driver.findElement(By.id("j_idt88:j_idt90")).click();
		
		//Verify the title of the page is 'DashBoard'
		String titleOfPage = driver.getTitle();
		System.out.println("Title of page is:"+titleOfPage);
		
		//Navigate back to Page
		driver.navigate().back();
		
		//Check button with text 'Confirm if the button is disabled'
		boolean disableStatus = driver.findElement(By.id("j_idt88:j_idt90")).isEnabled();
		System.out.println("Button disable status is:"+disableStatus);
		
		//Position of the button with the text 'Submit'
		Point locationofSubmitButton = driver.findElement(By.xpath("//span[text()='Submit']")).getLocation();
		System.out.println("Location of Submit Button is:"+locationofSubmitButton);
		
		//Background color of the button with the text 'Find the Save button color'
		String cssValueSaveButton = driver.findElement(By.xpath("//span[text()='Save']")).getCssValue("color");
		System.out.println("Background color of button is:"+cssValueSaveButton);
		
		//Height and width of the button with the text 'Find the height and width of this button'
		Dimension sizeOfButton = driver.findElement(By.xpath("(//span[text()='Submit'])[2]")).getSize();
		System.out.println("Dimension of button is:"+sizeOfButton);
		
		//Close Browser
		driver.close();
	}

}
