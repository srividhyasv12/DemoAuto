package frames;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnderstandFrame {
public static void main(String[] args) throws InterruptedException, IOException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajes\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		
		driver.get("https://www.dream11.com/ ");
		//to switch the control to the frame using id
		//driver.switchTo().frame("send-sms-iframe");
		
		//switch rhe control usingWEBELEMENT
		 WebElement frame=driver.findElement(By.xpath("//iframe[@title='Iframe Example']"));
		 driver.switchTo().frame(frame);	
		 
		 
				
		//enter the data to text field
		driver.findElement(By.id("regEmail")).sendKeys("911234567812");
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();
		 driver.findElement(By.linkText("Fantasy Cricket")).click();

		
		Thread.sleep(5000);
		driver.quit();


}
}