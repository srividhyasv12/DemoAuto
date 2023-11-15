package jsexecuter;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleHiddenElement {
public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajes\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		JavascriptExecutor js=(JavascriptExecutor) driver;
	driver.get("https://www.myntra.com/watches?rawQuery=watches");
			
	WebElement watch = driver.findElement(By.xpath("//h3[text()='Armani Exchange']/..//h4[text()='Men Analogue Watch']/../../..//span[text()='wishlist']"));
	js.executeScript("arguments[0].click()", watch);
}}
