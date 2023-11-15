package java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alpha {
public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajes\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
	
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		for(;;) {
			try {
				
			
			driver.findElement(By.id("loginclose1")).click();
			break;
			}catch(Exception e) {
				Thread.sleep(3000);
				
			}}
		//List<WebElement> navBarelements = driver.findElements(By.xpath("//nav[@class='menu']/ul/li/a)[4]"));


}

}



