package popup;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Calenderpopup {
	public static void main(String[] args) throws InterruptedException {
		
		//current date
		LocalDateTime date = LocalDateTime.now().plusMonths(3).plusDays(9);
		//to extract month from current date
		String month = date.getMonth().toString();
		//converting month  as in the web page
		month=month.charAt(0)+month.substring(1, 3).toLowerCase();
		int day = date.getDayOfMonth();
		int year=date.getYear();
		System.out.println(month+"    "+day+"  "+year);
		
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajes\\Downloads\\chromedriver.exe");
	ChromeOptions settings=new ChromeOptions();
	settings.addArguments("--disable-notifications");
	WebDriver driver=new ChromeDriver(settings);
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	
	
	driver.get("https://in.via.com/");
	driver.findElement(By.id("departure")).click();
	for(;;) {
		try {
			driver.findElement(By.xpath("//span[text()='"+month+"']/../..//span[text()='"+year+"']/../..//div[text()='"+day+"']")).click();
		break;
		}catch(Exception e) {;
			driver.findElement(By.xpath("//span[contains(@class,'next-month')]")).click();
		}
	}
	
}}

	

