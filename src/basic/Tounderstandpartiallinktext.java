package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tounderstandpartiallinktext {
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajes\\Downloads\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	Thread.sleep(3000);
	driver.get("https://demowebshop.tricentis.com/ ");
	Thread.sleep(3000);
	driver.findElement(By.partialLinkText("Books")).click();//jewellery
	Thread.sleep(3000);

}
}