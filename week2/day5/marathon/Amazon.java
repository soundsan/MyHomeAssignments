package week2.day5.marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		//Launch the Browser
		ChromeDriver driver = new ChromeDriver();
		//Load the URL()
		driver.get("https://www.amazon.in/");
		//Maximize the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		//Type 'Bags for boys' in Search box
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Bags for Boys",Keys.ENTER);
		//Print the total no.of results
		String total = driver.findElement(By.xpath("//span[contains(text(),'1-48 ')]")).getText();
		System.out.println("Total no.of results:"+total);
		//Select the first two brands
		driver.findElement(By.xpath("(//span[text()='Brands']/following::span[text()='Safari'])")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[text()='Brands']/following::span[text()='American Tourister'])")).click();
		Thread.sleep(5000);
		//Choose New Arrivals
		driver.findElement(By.xpath("//span[text()='Sort by:']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[text()='Newest Arrivals'])")).click();
		Thread.sleep(2000);
		//Print the first resulting bag info
		String bagInfo = driver.findElement(By.xpath("(//h2[@class='a-size-mini s-line-clamp-1']/span[text()='Safari'])")).getText();
		System.out.println("The brand is:"+bagInfo);
		String price =driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
		System.out.println("The discount price is:"+price);
		Thread.sleep(5000);
		//Close window
		//driver.close();
	}

}