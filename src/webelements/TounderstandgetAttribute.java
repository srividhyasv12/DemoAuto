package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TounderstandgetAttribute {
public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajes\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.myntra.com/");
		Thread.sleep(2000);
		WebElement searchBar =driver.findElement(By.xpath("//input[contains(@placeholder,'search for')]"));
		System.out.println(searchBar.getAttribute("placeholder"));
		// OR    System.out.println(searchBar.getAttribute("placeholder"));
		Thread.sleep(3000);
		driver.quit();
}}


