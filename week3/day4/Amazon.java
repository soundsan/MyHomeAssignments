package week3.day4;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver = new ChromeDriver();
		//Load the URL()
		driver.get("https://www.amazon.in/");
		//Maximize the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Thread.sleep(2000);
		
		//Search for 'OnePlus 9 pro'
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("OnePlus 9 pro",Keys.ENTER);
		
		//Get the price of the first product
		String priceFirstProduct = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
		System.out.println("The price of first product is:"+priceFirstProduct);
		
		//Number of customer ratings for the first displayed product
		String customerRatings = driver.findElement(By.xpath("//span[@class='a-size-base s-underline-text']")).getText();
		System.out.println("Number of customer ratings for first displayed product is:"+customerRatings);
		
		//Click the first text link of the first image
		driver.findElement(By.xpath("(//div[@class='puisg-col-inner']/div/div/a)[1]")).click();
		
		//Switch the driver focus to child window
		Set<String> allWindows = driver.getWindowHandles();
		
		List<String> listOfAllWindows = new ArrayList<String>(allWindows);
		System.out.println("Address of both parent and child window is:"+listOfAllWindows);
		
		driver.switchTo().window(listOfAllWindows.get(1));
		
		//Screenshot of the product displayed
		File source = driver.getScreenshotAs(OutputType.FILE);
		File destination = new File("./Screenshot/Amazon.png");
		FileUtils.copyFile(source, destination);	
		
		//Thread.sleep(2000);
		//To move to 'Add to Cart' button and click using Actions
		Actions moveToElement = new Actions(driver);
		WebElement move = driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])[2]"));
		
		//Wait and click 'Add to Cart'
		WebDriverWait waitClick = new WebDriverWait(driver,Duration.ofSeconds(30));
		waitClick.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@id='add-to-cart-button'])[2]")));
		moveToElement.scrollToElement(move).perform();
		
		//Get the cart SubTotal and verify if it is Correct
		waitClick.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='attach-accessory-cart-subtotal']")));
		String cartSubtotal = driver.findElement(By.xpath("//span[@id='attach-accessory-cart-subtotal']")).getText();
		System.out.println("Cart subtotal is:"+cartSubtotal);
		
		//Compare the values of Price of FirstMobile and cart Total
		if(priceFirstProduct.equals(cartSubtotal)) {
			System.out.println("cart Subtotal:"+cartSubtotal);
		}
		//Close browser
		driver.close();
	}

}
