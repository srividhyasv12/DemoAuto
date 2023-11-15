package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TounderstandMaxizimize {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajes\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//maximize scree so we can see search bar
		driver.manage().window().maximize();
		driver.get("https://skillrary.com/");
		Thread.sleep(2000);
		
		//fullscree exit by esc
		driver.manage().window().fullscreen();
driver.manage().window().maximize();
		


}}
//driver.manage().window().maximize();