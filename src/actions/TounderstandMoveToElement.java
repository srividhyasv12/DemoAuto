package actions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TounderstandMoveToElement {
public static void main(String[] args) throws InterruptedException, IOException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajes\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		//object os ACTION CLASS
		Actions action=new Actions(driver);
		
		driver.get("https://www.levi.in/sale-1");
	
		WebElement product =driver.findElement(By.xpath("(//img[contains(@alt,\"Men's Brand\")])[1]"));
action.moveToElement(product).perform();
Thread.sleep(2000);
driver.findElement(By.id("quickviewbutton")).click();
Thread.sleep(5000);
driver.quit();

}
}