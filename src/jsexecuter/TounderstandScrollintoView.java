package jsexecuter;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TounderstandScrollintoView {
public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajes\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		
	//driver.get("https://polarbear.co.in/");
	//WebElement ele = driver.findElement(By.xpath("//span[contains(text(),'congratulations ')]"));
	//js.executeScript("arguments[0].scrollIntoView(false)", ele);
	
	
	driver.get("https://polarbear.co.in/");
	WebElement ele = driver.findElement(By.xpath("//span[contains(text(),'Congratulations ')]"));
	js.executeScript("arguments[0].scrollIntoView(false)", ele);
	Thread.sleep(3000);
}}