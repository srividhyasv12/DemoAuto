package popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Confirmationpopup {
public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajes\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		Actions action = new Actions(driver);
		
		
		driver.get("https://licindia.in/ ");
		WebElement otherservices= driver.findElement(By.xpath("//a[@title='Other Online Services']"));
		action.moveToElement(otherservices).perform();
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Merchant Portal")).click();
		Thread.sleep(3000);
		
		
		Alert confirmationpopup = driver.switchTo().alert();
		System.out.println(confirmationpopup.getText());
		//confirmationpopup.dismiss();
		//OR
		confirmationpopup.accept();
		
		

}}
