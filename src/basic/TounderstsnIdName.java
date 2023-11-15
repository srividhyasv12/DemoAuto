package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TounderstsnIdName {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajes\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		//to pass the value to username textfield
		driver.findElement(By.id("username")).sendKeys("admin");
		//to pass the value to password textfiels
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		Thread.sleep(3000);
		//click on login button
		driver.findElement(By.id("loginbutton")).click();
		
		Thread.sleep(5000);
		driver.quit();
		
		
	
}}
