package week3.day3;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

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
		//Contacts Button
		driver.findElement(By.linkText("Contacts")).click();
		//Click on Merge Contacts
		driver.findElement(By.linkText("Merge Contacts")).click();
		//Click on the widget of 'From Contact'
		driver.findElement(By.xpath("(//table[@id='widget_ComboBox_partyIdFrom']/following::a)[1]")).click();
		
		
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windowList = new ArrayList<String>(windowHandles);
		//Switch the driver focus to Child Window
		driver.switchTo().window(windowList.get(1));
		driver.manage().window().maximize();
		
		//Click on first resulting contact
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
		//Switching to Parent Window
		driver.switchTo().window(windowList.get(0));
		//Click on the widget of 'To Contact'
		driver.findElement(By.xpath("(//table[@id='widget_ComboBox_partyIdFrom']/following::a)[2]")).click();
		
		Set<String> allWindowHandles = driver.getWindowHandles();
		List<String> allWindowList = new ArrayList<String>(allWindowHandles);
		//Switching to Parent Window
		driver.switchTo().window(allWindowList.get(1));
		driver.manage().window().maximize();
		
		//Click on second resulting contact
		driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']/following::a)[1]")).click();
		driver.switchTo().window(allWindowList.get(0));
		//Click on Merge Button
		driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();
		//Accept the Alert
		driver.switchTo().alert().accept();
		//Verify the Title of the page
		String title = driver.getTitle();
		System.out.println("Title of the Page is:"+title);
		//Close browser
		driver.close();
		
	}

}
