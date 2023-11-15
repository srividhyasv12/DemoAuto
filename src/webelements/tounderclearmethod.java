package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tounderclearmethod {

public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajes\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
	
		driver.get("http://vtiger-demo.it-solutions4you.com/");
		Thread.sleep(3000);
		WebElement username =driver.findElement(By.id("username"));
		username.clear();
		username.sendKeys("srividhyarajeshkumar");
		WebElement password =driver.findElement(By.id("password"));
		password.clear();
		password.sendKeys("srividhyarajeshkumar");
		
}
}