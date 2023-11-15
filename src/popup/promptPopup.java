package popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class promptPopup {
public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajes\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		//Actions action = new Actions(driver);
		
		
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		Thread.sleep(3000);
		//switch the control to frame
		driver.switchTo().frame("iframeResult");
		//clickon tryit button
		driver.findElement(By.linkText("//button[text()='Try it'']")).click();
		//switch the control;
	Alert promptpopup=driver.switchTo().alert();
	Thread.sleep(3000);
	promptpopup.sendKeys("SRIVIDHYA");
	Thread.sleep(3000);
	//click on ok button
	promptpopup.accept();
	//capture the msg
	WebElement msg = driver.findElement(By.id("demo"));
	//to print the msg
	System.out.println(msg.getText());
	
	
		
}}
