package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignTenJune {
public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajes\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		Thread.sleep(3000);
		//switch the control toframe using name
		driver.switchTo().frame("login_page");
		Thread.sleep(3000);
		driver.findElement(By.linkText("CONTINUE")).click();
		Thread.sleep(3000);
		//switch control to the popup
		Alert alertpopup = driver.switchTo().alert();
		Thread.sleep(3000);
		//capture the text of the popup
System.out.println(alertpopup.getText());
Thread.sleep(3000);
//click onok button
alertpopup.accept();

Thread.sleep(2000);
driver.quit();

}}
