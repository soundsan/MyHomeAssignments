package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
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
				//Find Leads
				driver.findElement(By.linkText("Find Leads")).click();
				//Phone tab
				//driver.findElement(By.xpath("//span[contains(text(),'Phone')]")).click();
				//Enter phone number
				driver.findElement(By.name("id")).sendKeys("10046");
				Thread.sleep(2000);
				//Find Leads Button
				driver.findElement(By.xpath("//button[contains(text(), 'Find Leads')]")).click();
				//Capture the Lead ID
				Thread.sleep(5000);
				driver.findElement(By.xpath("//a[contains(text),'10046')]")).click();
				//Clicking First Result Lead
				driver.findElement(By.className("x-grid3-cell-inner x-grid3-col-partyId")).click();
				Thread.sleep(5000);
				//Delete Button
				driver.findElement(By.xpath("//a[contains(text(),'Delete')]")).click();
				//Click Find Leads again
				driver.findElement(By.linkText("Find Leads")).click();
				//Captured Lead ID
				driver.findElement(By.name("id")).sendKeys("10046");
				//Find Leads Button
				driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
				//Verifying Deletion
				Thread.sleep(5000);
				String message = driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
				boolean isRecord = message.equals("No records to Display");
				System.out.println("Record not found is "+isRecord);
				//Close Browser
				//driver.close();
		}

}
