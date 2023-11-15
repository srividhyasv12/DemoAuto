package basic;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetCurrentUrl {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajes\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		//togetcurrenturl
				driver.get("https://www.amazon.in/");
				System.out.println(driver.getCurrentUrl());
				driver.quit();
									
				
				
				

	
	}



}
