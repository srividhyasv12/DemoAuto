package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tounderstandsubmit {
public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajes\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
	
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(3000);
		driver.findElement(By.id("loginbutton")).submit();

}
}