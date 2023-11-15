package basic;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TocloseparticularWindow {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajes\\Downloads\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	
	//tocloseparticular window buffet with another child one using OR
			driver.get("file:///C:/Users/rajes/Documents/selenium/MultipleWindow%20(1).html");
			
			driver.findElement(By.xpath("//input[@value=\"Open Food Sites\"]")).click();
			Thread.sleep(3000);
			
			Set<String> allwindowid= driver.getWindowHandles();
			
			for(String windowid: allwindowid) {
				driver.switchTo().window(windowid);
				if(driver.getTitle().contains("buffet") || driver.getTitle().contains("Olive")){
					driver.close();
					
				}
			}
			
			

}
}

