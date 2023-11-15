package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wooden {
	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajes\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.woodenstreet.com/");
	Thread.sleep(2000);
	
List<WebElement> navBarelements = driver.findElements(By.xpath("//nav[@class='menu']/ul/li/a"));
	for(WebElement ele:navBarelements) {
		System.out.println(ele.getText());


}
	}
}