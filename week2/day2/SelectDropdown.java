package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {

	public static void main(String[] args) {
		//Launch the browser
		ChromeDriver driver = new ChromeDriver();
		//Loading the url
		driver.get("http://leaftaps.com/opentaps/");
		//Maximize the browser
		driver.manage().window().maximize();
		//Enter the username
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		//Enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//Click on login button
		driver.findElement(By.className("decorativeSubmit")).click();
		//Click on CRMSFA link
		driver.findElement(By.linkText("CRM/SFA")).click();
		//Click on Leads 
		driver.findElement(By.linkText("Leads")).click();
		//Click on Create Lead
		driver.findElement(By.linkText("Create Lead")).click();
		//Enter First name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Soundarya");
		//Enter lastname
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Gowtham");
		//Enter Company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		
		
		//Find the element
		WebElement sourceDropdown1 = driver.findElement(By.id("createLeadForm_dataSourceId"));
		//Instantiate the select class
		Select dd1 = new Select(sourceDropdown1);
		//select the value
		dd1.selectByValue("LEAD_PARTNER");
		
		//Finding Industry element 
		WebElement sourceDropdown2 = driver.findElement(By.id("createLeadForm_industryEnumId"));
		//Instantiate the class
		Select dd2 = new Select(sourceDropdown2);
		//select the value
		dd2.selectByValue("IND_GEN_SERVICES");
		//Click Create Lead Button
		driver.findElement(By.name("submitButton")).click();
		

	}

}
