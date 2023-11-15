package synchoronization;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait {
public static void main(String[] args) throws InterruptedException, IOException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajes\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		WebDriverWait wait=new WebDriverWait(driver, 3);
		
		
		driver.get("https://www.shoppersstack.com/products_page/114");
driver.findElement(By.id("Check Delivery")).sendKeys("609001");
		
		//WebElement checkbutton = driver.findElement(By.id("Check"));




		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("Check"))));
		driver.findElement(By.id("Check")).click();
		
		
		

}

}
