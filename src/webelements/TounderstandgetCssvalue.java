package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TounderstandgetCssvalue {
public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajes\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(4000);
		WebElement errormsg = driver.findElement(By.xpath("//span[contains(text(),'invalid')]"));
		//System.out.println(errormsg.getCssValue("color"));
		System.out.println(errormsg.getCssValue("font-family"));
		Thread.sleep(2000);
		driver.quit();
}
}