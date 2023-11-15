package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandCssSelector {
	public static void main(String[] args) throws Throwable {
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajes\\Downloads\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demowebshop.tricentis.com/ ");
	Thread.sleep(3000);
	List<WebElement> allEle = driver.findElements(By.cssSelector("*"));
	System.out.println(allEle.size());
	
	for(WebElement ele:allEle) {
		System.out.println(ele.getText());
	}
	driver.quit();

}}

