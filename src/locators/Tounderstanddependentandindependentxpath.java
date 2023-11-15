package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tounderstanddependentandindependentxpath {
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajes\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
	
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
driver.findElement(By.partialLinkText("GIFT CARDS")).click();
Thread.sleep(3000);
 driver.findElement(By.xpath("//a[text()='$100 Physical Gift Card']/../..//input[@value='Add to cart']")).click();
 Thread.sleep(6000);
 driver.quit();
}
}