package jsexecuter;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandScrollTo {
public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajes\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		
	driver.get("https://www.zomato.com/");
	/*js.executeScript("window.scrollBy(0,350)");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,350)");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,350)");
		Thread.sleep(3000);*/
		
		js.executeScript("window.scrollTo(0,350)");
		Thread.sleep(3000);
		js.executeScript("window.scrollTo(0,350)");
		Thread.sleep(3000);
		js.executeScript("window.scrollTo(0,350)");
		Thread.sleep(3000);
		
}}
