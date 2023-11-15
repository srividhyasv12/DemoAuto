package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TogetcurrentpageSource {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajes\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		//togetcurrenturl
				driver.get("https://www.amazon.in/");
				System.out.println(driver.getCurrentUrl());
				System.out.println(driver.getPageSource());
				driver.quit();
									
				
				
				


}
}
