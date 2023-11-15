package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tounderstandenum {
public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajes\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
	
		//driver.get("https://www.myntra.com/");
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[contains(@placeholder,'search for')]")).sendKeys("watches",Keys.ENTER);
		
		
		
		
		

		
		driver.get("https://www.noon.com/uae-en/");
		Thread.sleep(2000);
		driver.findElement(By.id("searchBar")).sendKeys("watches",Keys.ENTER);

}}
