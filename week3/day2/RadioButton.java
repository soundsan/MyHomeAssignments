package week3.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		//Load the URL()
		driver.get("https://leafground.com/radio.xhtml");
		//Maximize the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Thread.sleep(2000);
		
		//Select 'Your most favorite browser' from the radio buttons
		driver.findElement(By.xpath("//label[text()='Chrome']")).click();
		
		//Click on a radio button, then click on the same radio button again to verify that it becomes 'unselected'
		driver.findElement(By.xpath("//label[text()='Chennai']")).click();
		driver.findElement(By.xpath("//label[text()='Chennai']")).click();
		boolean selected = driver.findElement(By.xpath("//label[text()='Chennai']")).isSelected();
		System.out.println("Button Selected: "+selected);
		
		//Identify the radio button that is initially selected by default.
		 WebElement chrome = driver.findElement(By.xpath("(//input[@id='j_idt87:console2:0'])"));
		 boolean selectChrome = chrome.isSelected();
		 WebElement firefox = driver.findElement(By.xpath("(//input[@id='j_idt87:console2:1'])"));
		 boolean selectFirefox = firefox.isSelected();
		 WebElement safari = driver.findElement(By.xpath("(//input[@id='j_idt87:console2:2'])"));
		 boolean selectSafari = safari.isSelected();
		 WebElement edge = driver.findElement(By.xpath("(//input[@id='j_idt87:console2:3'])"));
		 boolean selectEdge = edge.isSelected();
		 
		 if (chrome.isSelected()) {
				System.out.println("Chrome: "+selectChrome);
				}
			else if  (firefox.isSelected()){
					System.out.println("Firefox: "+selectFirefox);
					}
			else if  (safari.isSelected()){                                          
						System.out.println("Safari: "+selectSafari);
						}
			else if  (edge.isSelected()){
							System.out.println("Edge: "+selectEdge);
				}else 
				{
				System.out.println("No button is selected by default");
			}
		 
		//Check and select the age group (21-40 Years) if not already selected
		WebElement ageGroup = driver.findElement(By.xpath("//input[@id='j_idt87:age:1']"));
		boolean age= ageGroup.isSelected();
		
		if (age==false) {
		ageGroup.click();
		}
		else {
			System.out.println("(21-40 Years) already selected");
		}
		
		//Close the browser
		driver.close();
		
	}
}
