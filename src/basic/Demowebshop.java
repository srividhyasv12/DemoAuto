package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demowebshop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajes\\eclipse-workspace\\selenium\\driver\\chromedriver (1).exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://demowebshop.tricentis.com/register");
		Thread.sleep(3000);
		driver.findElement(By.id("gender-female")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("FirstName")).sendKeys("sri");
		//to pass the value to username textfield
		driver.findElement(By.id("LastName")).sendKeys("sri");
		//to pass the value to password textfiels
		driver.findElement(By.name("Email")).sendKeys("srisri169@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.name("Password")).sendKeys("sanjausharu");
		Thread.sleep(3000);
		driver.findElement(By.name("ConfirmPassword")).sendKeys("sanjausharu");
		Thread.sleep(3000);
		
		//click on login button
		driver.findElement(By.id("register-button")).click();
		
		Thread.sleep(5000);
		driver.quit();
		

}}
