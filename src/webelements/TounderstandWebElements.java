package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TounderstandWebElements {
public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajes\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		WebElement login = driver.findElement(By.xpath("//div[text()= 'Log in']"));
		System.out.println(login.isEnabled());

		driver.findElement(By.id("loginButton")).click();

		driver.findElement(By.id("loginButton")).click();
		
	
}}



