package actions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TounderstandClickAndHold {
public static void main(String[] args) throws InterruptedException, IOException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajes\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		Actions action=new Actions(driver);
		
		
driver.get("https://yonobusiness.sbi/login/yonobusinesslogin");
driver.findElement(By.id("password")).sendKeys("testion@123");

Thread.sleep(4000);
action.moveByOffset(1636, 372).clickAndHold().perform();

Thread.sleep(6000);
driver.quit();

}
}