package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		
		  		//Launch the browser
				ChromeDriver driver = new ChromeDriver();
				//Loading the URL
				driver.get("http://leaftaps.com/opentaps/");
				//Maximize the browser
				driver.manage().window().maximize();
				//UserName
				driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
				//Password
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				//Login button
				driver.findElement(By.className("decorativeSubmit")).click();
				//CRMSFA link
				driver.findElement(By.linkText("CRM/SFA")).click();
				//Accounts tab
				driver.findElement(By.linkText("Accounts")).click();
				//Create Accounts tab
				driver.findElement(By.linkText("Create Account")).click();
				//Account name
				driver.findElement(By.id("accountName")).sendKeys("Demotester01");
				//Description
				driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester1");
				
				//Industry Drop-down
				//Find the element
				WebElement sourceDropdown1 = driver.findElement(By.name("industryEnumId"));
				//Instantiate the select class
				Select dd1 = new Select(sourceDropdown1);
				//select the value
				dd1.selectByValue("IND_SOFTWARE");
				
				//Ownership Drop-down
				//Find the element
				WebElement sourceDropdown2 = driver.findElement(By.name("ownershipEnumId"));
				//Instantiate the select class
				Select dd2 = new Select(sourceDropdown2);
				//select the value
				dd2.selectByVisibleText("S-Corporation");
				
				//Source Drop-down
				//Find the element
				WebElement sourceDropdown3 = driver.findElement(By.id("dataSourceId"));
				//Instantiate the select class
				Select dd3 = new Select(sourceDropdown3);
				//select the value
				dd3.selectByValue("LEAD_EMPLOYEE");
				
				//Marketing Campaign Drop-down
				//Find the element
				WebElement sourceDropdown4 = driver.findElement(By.id("marketingCampaignId"));
				//Instantiate the select class
				Select dd4 = new Select(sourceDropdown4);
				//select the value
				dd4.selectByIndex(6);
				
				//State/Province Drop-down
				//Find the element
				WebElement sourceDropdown5 = driver.findElement(By.id("generalStateProvinceGeoId"));
				//Instantiate the select class
				Select dd5 = new Select(sourceDropdown5);
				//select the value
				dd5.selectByValue("TX");
				
				//Click Create Account Button
				driver.findElement(By.className("smallSubmit")).click();
				
				//Verify Account name
				WebElement element = driver.findElement(By.xpath("(//span[@class='tabletext'])[3]"));
				System.out.println(element.getText());
				
				//Close the driver
				driver.close();
				
				
				
				

	}

}
