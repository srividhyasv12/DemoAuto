package popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ToavoidnotificationPopup {
	
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajes\\Downloads\\chromedriver.exe");
	
	ChromeOptions disable=new ChromeOptions();
	disable.addArguments("--disable-notifications");
	WebDriver driver=new ChromeDriver(disable);
	
	
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	
	
	driver.get("https://www.yatra.com/");
	Thread.sleep(4000);
}}
