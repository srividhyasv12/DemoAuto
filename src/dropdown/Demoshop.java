package dropdown;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demoshop {
public static void main(String[] args) throws InterruptedException, IOException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajes\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		
		driver.get("https://demoapp.skillrary.com/");
		WebElement listbox=driver.findElement(By.id("cars"));
		Select selectopt=new Select(listbox);
		selectopt.selectByIndex(0);
		selectopt.selectByValue("199");
		//selectopt.selectByVisibleText("More Than INR 500 ( 55 ) ");
		List<WebElement> selectedopt = selectopt.getAllSelectedOptions();
		for(WebElement options:selectedopt) {
		System.out.println(options.getText());

		}
		Thread.sleep(5000);
		driver.quit();
}}
