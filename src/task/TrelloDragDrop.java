package task;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TrelloDragDrop {
public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajes\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		Actions action=new Actions(driver);
		
		
	driver.get("https://trello.com/b/HWTtTrSl/to-do");
	Thread.sleep(5000);
	WebElement todo =driver.findElement(By.xpath("To Do"));
	WebElement src1 =driver.findElement(By.xpath(""));//source 1 image
}
}
