package week2.day5.marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookTicketPvr {

	public static void main(String[] args) throws InterruptedException {
		//Launch the Browser
		ChromeDriver driver = new ChromeDriver();
		//Load the URL()
		driver.get("https://www.pvrcinemas.com/");
		//Maximize the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Choose location
		driver.findElement(By.xpath("(//span[@class='cities-placed'])[2]")).click();
		Thread.sleep(5000);
		//Search for city 'Chennai'
		driver.findElement(By.xpath("(//div[@class='cities-overlay cities-active'])[6]")).click();
		//Select Cinema from Quick Book
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//span[@class='cinemas-inactive'])")).click();
		//Select Cinema Drop-down
		driver.findElement(By.xpath("(//div[@class='p-dropdown-trigger'])[2]")).click();
		//Select Cinema
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//span[text()='INOX The Marina Mall, OMR, Chennai'])")).click();
		//Select Date as Tomorrow
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//ul[@class='p-dropdown-items']/li[3])")).click();
		//Select Movie
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//ul[@class='p-dropdown-items']/li[2])")).click();
		//Select Show Time
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//ul[@class='p-dropdown-items']/li[4])")).click();
		//Click on Book Button
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//span[@class='p-button-label p-c'])[5]")).click();
		//Click Accept on Terms and Conditions
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Accept']")).click();
		//Click Available seat
		Thread.sleep(5000);
		WebElement selectSeats = driver.findElement(By.xpath("((//div[@class='seat-flow-custom-scroll']/tr[@class='seats-row'])[4]//span[@id='CL.CLUB|J:20'])"));
		boolean checkSeats = selectSeats.isEnabled();
		
		if(checkSeats == true) {
			selectSeats.click();
			System.out.println("Seat Selected");
		}
		
		//Click Proceed Button
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		
		//Seat Info under Book Summary
		String seatInfo = driver.findElement(By.xpath("//div[@class='ticket-value']")).getText();
		System.out.println("Seat Info :"+seatInfo);
		//Grand Total under Book Summary
		String grandTotal = driver.findElement(By.xpath("//div[@class='grand-tota col-md-3']/h6[1]")).getText();
		System.out.println("Grand Total :"+grandTotal);
		//Click Proceed Button
		driver.findElement(By.xpath("//div[@class='register-btn col-md-3']/button")).click();
		Thread.sleep(5000);
		//Close popup
		driver.findElement(By.xpath("(//i[@class='pi pi-times'])[2]")).click();
		Thread.sleep(3000);
		//Get Title name
		String title = driver.getTitle();
		System.out.println("Title of Page :"+title);
		//Close window
		//driver.close();
	}

}
