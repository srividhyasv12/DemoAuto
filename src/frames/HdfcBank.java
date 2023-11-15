package frames;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HdfcBank {
public static void main(String[] args) throws InterruptedException, IOException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajes\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		
		driver.get("https://netbanking.hdfcbank.com/netbanking/ ");
		driver.switchTo().frame(0);
		driver.findElement(By.name("fldLoginUserId")).sendKeys("911234567812");
		
		Thread.sleep(2000);
		 driver.findElement(By.linkText("Credit Card only? Login here")).click();
		 Thread.sleep(3000);
		 driver.quit();
}}
