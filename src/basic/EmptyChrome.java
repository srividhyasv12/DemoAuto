package basic;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmptyChrome {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\selenium\\driver\\chromedriver (1).exe");
		WebDriver driver=new ChromeDriver();
		
	//getwindowhandles
		driver.get("https://www.shoppersstack.com/products_page/115");
		String parentwindowid = driver.getWindowHandle();
		Thread.sleep(12000);
		
		
		driver.findElement(By.id("compare")).click();
		Thread.sleep(3000);
		
		Set<String> allwindowid= driver.getWindowHandles();
		allwindowid.remove(parentwindowid);
		
		for(String windowid: allwindowid) {
			
			driver.switchTo().window(windowid);
			driver.close();
		}
		
	}

}
