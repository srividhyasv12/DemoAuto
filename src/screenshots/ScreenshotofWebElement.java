package screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotofWebElement {
public static void main(String[] args) throws InterruptedException, IOException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajes\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.coca-cola.com/in/en/brands/thums-up");
		WebElement thumsup = driver.findElement(By.xpath("//img[@alt=\"Thums up logo\"]"));
		
		 //Create a file
		File destination= new File("./errorshots/image2.png");
		
		//capturing the screenshot
		File src = thumsup.getScreenshotAs(OutputType.FILE);
		
		
		//copy the screenshot to thefile
		FileHandler.copy(src,destination);
		Thread.sleep(3000);
		
		driver.quit();
		
		
		
		
		

		
}}
