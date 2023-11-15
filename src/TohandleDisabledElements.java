import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TohandleDisabledElements {
public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajes\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		JavascriptExecutor js=(JavascriptExecutor) driver;
	driver.get("https://demoapp.skillrary.com/");	
	WebElement disabledElement = driver.findElement(By.xpath("//input[@class='form-control']"));
	//to pass value to disabled element
	js.executeScript("arguments[1].value='hloooo'", disabledElement);
	
	
	WebElement mailbutton = driver.findElement(By.xpath("//i[@class='fa fa-envelope']"));
	js.executeScript("arguments[0].click()", mailbutton);
	
}
}