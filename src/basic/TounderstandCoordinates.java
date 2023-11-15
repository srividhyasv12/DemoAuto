package basic;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TounderstandCoordinates {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajes\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://skillrary.com/");
		
		System.out.println(driver.manage().window().getPosition());
		System.out.println(driver.manage().window().getSize());
		
		Thread.sleep(4000);
		driver.quit();
		
		
		driver.manage().window().setPosition(new Point(8,9));
		driver.manage().window().setSize(new Dimension(800, 450));
		
		Thread.sleep(3000);
		//driver.quit();
		
		
		
		
		
		

}
}