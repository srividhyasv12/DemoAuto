package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tounderstandxpathbyattributes {
public static void main(String[] args) throws InterruptedException {

		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajes\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
	
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(6000);
		
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Thread.sleep(3000);

		String errormsg = driver.findElement(By.xpath("//span[contains(text(),'unsuccessful')]'")).getText();
		System.out.println(errormsg);
		Thread.sleep(3000);
		driver.quit();
		
}
}