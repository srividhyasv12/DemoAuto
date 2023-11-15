package screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebDriver;



public class ScreenshotofWebPage {
public static void main(String[] args) throws InterruptedException, IOException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajes\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//create a ref of takescreenshot
		//WebDriver ts =driver;
		
		TakesScreenshot ts =(TakesScreenshot) driver;
		driver.get("https://www.coca-cola.com/in/en/brands/maaza");

		
	    //Create a file
		File destination= new File("./errorshots/image1.png");
		
		//capturing the screenshot
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		
		//copy the screenshot to thefile
		FileHandler.copy(src,destination);
		Thread.sleep(3000);
		
		driver.quit();

}}
