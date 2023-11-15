package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajes\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		//navigate through amazon application
		driver.get("https://www.amazon.in/");
		String title= driver.getTitle();
		System.out.println(driver.getTitle());
		
		//window id
		String windowid = driver.getWindowHandle();
		System.out.println(windowid);
		
		//maximize
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		
		//getsize
		System.out.println(driver.manage().window().getSize());
		
		//refresh
		driver.navigate().refresh();
		Thread.sleep(4000);
		
		//quit
		driver.quit();


}
}