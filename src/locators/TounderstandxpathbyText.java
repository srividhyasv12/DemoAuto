package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TounderstandxpathbyText {
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajes\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
	
		driver.get("https://www.instagram.com/");
		Thread.sleep(6000);
		
		driver.findElement(By.name("username")).sendKeys("srifsgdhfjgjghg");
		Thread.sleep(3000);
		
		driver.findElement(By.name("Password")).sendKeys("sriahhhah");
		Thread.sleep(3000);
		
driver.findElement(By.xpath("//div[text()='log in']")).click();
}

	
}