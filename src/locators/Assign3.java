package locators;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign3 {
public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajes\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
	
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(6000);
		
		//capture the parent window id
		String parentwindowid = driver.getWindowHandle();
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		Thread.sleep(3000);
		
		//capture the window id of all browsers
		Set<String> allwindowid = driver.getWindowHandles();
		
		//remove the the parent window id
		allwindowid.remove(allwindowid);
		
		//switch  control child window
		for(String windowid:allwindowid) {
			driver.switchTo().window(windowid);
		}
		
		driver.findElement(By.linkText("Try Free")).click();
		Thread.sleep(3000);
		
		
		
		//driver.findElement(By.partialLinkText("Try Free")).click();//

	
		

}}
