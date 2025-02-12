package week3.day4;

import java.time.Duration;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebTableInteraction {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		//Load the URL()
		driver.get("https://erail.in/");
		//Maximize the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//input[@id='txtStationFrom']")).clear();
		//Enter "MAS" as the "From" station
		driver.findElement(By.xpath("//input[@id='txtStationFrom']")).sendKeys("MAS");
		driver.findElement(By.xpath("//div[text()='Mgr Chennai Ctr']")).click();
		
		driver.findElement(By.xpath("//input[@id='txtStationTo']")).clear();
		//Enter "MDU" as the "To" station
		driver.findElement(By.xpath("//input[@id='txtStationTo']")).sendKeys("MDU");
		driver.findElement(By.xpath("//div[text()='Madurai Jn']")).click();
		
		//UnCheck the "Sort on Date" CheckBox
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement sortDateCheckbox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='chkSelectDateOnly']")));
		sortDateCheckbox.click();
		driver.findElement(By.xpath("//input[@id='buttonFromTo']")).click();
		
		//Retrieve the train names from the web table
		WebElement table = driver.findElement(By.xpath("//div[@id='divTrainsList']/table[1]"));
		
		List<WebElement> trainNamesColumnData = table.findElements(By.xpath("//div[@id='divTrainsList']/table[1]/tbody/tr[\"+i+\"]/td[2]"));
		
		Set<String> trainNameWithoutDuplicate=new LinkedHashSet<String>();
		System.out.println("Train names: ");
		
		//Verify if there are any duplicate train names in the web table
 		for(int i = 0; i < trainNamesColumnData.size(); i++) {
			String trainName = trainNamesColumnData.get(i).getText();
			trainNameWithoutDuplicate.add(trainName);
 		}
		
 		System.out.println(trainNameWithoutDuplicate);
 		
	}

}
