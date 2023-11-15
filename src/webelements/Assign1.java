package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign1 {
public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajes\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
	
		driver.get("https://www.meesho.com/search?q=sunglasses");
Thread.sleep(2000);
driver.findElement(By.xpath("//p[text()='Fancy Unique Men Sunglasses']/..//h5[text()='173']")).click();

Thread.sleep(2000);

}}
