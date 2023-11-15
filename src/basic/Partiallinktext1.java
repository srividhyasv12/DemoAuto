package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Partiallinktext1 {
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajes\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//Thread.sleep(3000);
		///driver.get("https://www.amazon.ae/ ");
		//Thread.sleep(3000);
		//driver.findElement(By.partialLinkText("Mobile Phones")).click();
		//Thread.sleep(3000);
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
		driver.findElement(By.id("Phone number, username or email address")).sendKeys("sri");
		Thread.sleep(3000);
		driver.findElement(By.id("Password")).sendKeys("sri");
		//driver.findElement(By.partialLinkText("Mobile Phones")).click();
		Thread.sleep(3000);

	}
	}


