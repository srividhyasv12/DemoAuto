package jsexecuter;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandScrolling {
public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajes\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		driver.get("https://www.google.com/doodles?q=games");
		
		for(;;) {
			try {
				
			
			driver.findElement(By.linkText("Doodle Snow Games – Day 10")).click();
			break;
			}catch(Exception e) {
				
				 js.executeScript("window.scrollBy(0,200)");
			}}
		
		
		
		
		
		
		
}}
