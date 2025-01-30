package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		//Launch the Browser
		ChromeDriver driver = new ChromeDriver();
		//Load the URL()
		driver.get("http://leaftaps.com/opentaps/");
		//Maximize the window
		driver.manage().window().maximize();
		//UserName
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		//Password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//Login Button
		driver.findElement(By.className("decorativeSubmit")).click();
		//CRMSFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();
		//Leads Tab
		driver.findElement(By.linkText("Leads")).click();
		//Create Leads
		driver.findElement(By.linkText("Create Lead")).click();
		//CompanyName
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Sakvinyl");
		//FirstName
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Nandhini");
		//LastName
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Gokul");
		//FirstName(local)
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Nivi");
		//Description
		driver.findElement(By.name("description")).sendKeys("Automation Testing");
		//Department
		driver.findElement(By.name("departmentName")).sendKeys("Selenium Automation Tester2");
		//E-mail Address
		driver.findElement(By.name("primaryEmail")).sendKeys("sampletest@testleaf.com");
		
		//State or Province Drop-down
		//Find the element
		WebElement sourceDropdown1 = driver.findElement(By.name("generalStateProvinceGeoId"));
		//Instantiate the select class
		Select dd1 = new Select(sourceDropdown1);
		//select the value
		dd1.selectByVisibleText("New York");
		
		//Create Lead Button
		driver.findElement(By.className("smallSubmit")).click();
		//Edit Button
		driver.findElement(By.className("subMenuButton")).click();
		//Clear the Description
		driver.findElement(By.name("description")).clear();
		//Important Note
		driver.findElement(By.name("importantNote")).sendKeys("Remainder for Automation Testing");
		//Click Leads again
		driver.findElement(By.className("smallSubmit")).click();
		//Update Button
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
	    //Title of Resulting page
		System.out.println(driver.getTitle());
		//Close the driver
		driver.close();
	}
}
