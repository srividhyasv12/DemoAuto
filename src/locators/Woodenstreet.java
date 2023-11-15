package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Woodenstreet {
public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajes\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
	
		driver.get("https://www.woodenstreet.com/");
Thread.sleep(2000);

for(;;) {
	try {
		
	
	driver.findElement(By.id("loginclose1")).click();
	break;
	}catch(Exception e) {
		Thread.sleep(3000);
		
	}}
driver.findElement(By.xpath("(//nav[@class='menu']/ul/li/a)[4]")).click();
	Thread.sleep(3000);
			driver.findElement(By.partialLinkText("Bar Cabinets")).click();
			Thread.sleep(2000);
			driver.findElement(By.partialLinkText("Montana Bar Cabinet (Honey Finish)")).click();
			Thread.sleep(2000);
			String cost = driver.findElement(By.xpath("//span[contains(@class,'offerprice')]")).getText();
			System.out.println(cost);
			Thread.sleep(3000);
		}
}
