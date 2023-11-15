package dropdown;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiselectDropDown {
public static void main(String[] args) throws InterruptedException, IOException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajes\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		
		driver.get("file:///C:/Users/rajes/Documents/selenium/DropDownDemo.html");
		WebElement multiselect = driver.findElement(By.id("subject"));
		
		//select object of select class
		Select selectoption=new Select(multiselect);
		//check
		System.out.println(selectoption.isMultiple());
	//selectbyindex
		selectoption.selectByIndex(3);//================selenium
		Thread.sleep(2000);
		//select by value
		selectoption.selectByValue("2");//===================sql
		Thread.sleep(2000);
		//selectbyvisibletext
		selectoption.selectByVisibleText("Python");
		Thread.sleep(2000);
		
		
		//System.out.println(selectoption.getFirstSelectedOption().getText());//=============ans:sql
		
		selectoption.deselectByValue("2");
		Thread.sleep(5000);
driver.quit();
		
}}	