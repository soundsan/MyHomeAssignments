package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateFacebook {

	public static void main(String[] args) {
		
		//Launch the browser
		ChromeDriver driver = new ChromeDriver();
		//Loading the URL
		driver.get("https://en-gb.facebook.com");
		//Maximize the browser
		driver.manage().window().maximize();
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Create New Account Button
		driver.findElement(By.linkText("Create new account")).click();
		//Enter FirstName
		driver.findElement(By.name("firstname")).sendKeys("Soundarya");
		//Enter SurName
		driver.findElement(By.name("lastname")).sendKeys("Gowtham");
		//E-mail Address
		driver.findElement(By.name("reg_email__")).sendKeys("demo@testleaf.com");
		//New Password
		driver.findElement(By.id("password_step_input")).sendKeys("flower");
		
		//Date of Birth Drop-down
		//Day
		//Find the element
		WebElement sourceDropdown1 = driver.findElement(By.id("day"));
		//Instantiate the select class
		Select dd1 = new Select(sourceDropdown1);
		//select the value
		dd1.selectByValue("6");
		
		//Month
		//Find the element
		WebElement sourceDropdown2 = driver.findElement(By.id("month"));
		//Instantiate the select class
		Select dd2 = new Select(sourceDropdown2);
		//select the value
		dd2.selectByVisibleText("Nov");
		
		//Year
		//Find the element
		WebElement sourceDropdown3 = driver.findElement(By.id("year"));
		//Instantiate the select class
		Select dd3 = new Select(sourceDropdown3);
		//select the value
		dd3.selectByVisibleText("1996");
		
		//Radio Button in Gender
		driver.findElement(By.xpath("//label[contains(text(),'Female')]")).click();
		
		//Close the browser
		driver.close();
		}

}
