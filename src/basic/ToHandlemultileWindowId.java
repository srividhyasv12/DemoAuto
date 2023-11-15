package basic;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandlemultileWindowId {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajes\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		//getwindowhandles
				driver.get("file:///C:/Users/rajes/Documents/selenium/MultipleWindow%20(1).html");
				
				driver.findElement(By.xpath("//input[@value=\"Open Food Sites\"]")).click();
				Thread.sleep(12000);
				
				Set<String> allwindowid= driver.getWindowHandles();
				//diplay the number of windowid
				System.out.println(allwindowid.size());
				//displayall windowid
				for(String windowid: allwindowid) {
					System.out.println(windowid);
				}
				
				

}
}