package popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TounderstandFileUploadpopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajes\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		Actions action = new Actions(driver);
		
		//usename:password@url
		driver.get("https://www.naukri.com/registration/createAccount? ");
		//associate with input tag
		driver.findElement(By.id("resumeupload")).sendKeys("\"C:\\Users\\rajes\\Documents\\selenium\\se.PNG\"");
		

	}

}
