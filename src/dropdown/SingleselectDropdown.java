package dropdown;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleselectDropdown {
public static void main(String[] args) throws InterruptedException, IOException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajes\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		
		driver.get("file:///C:/Users/rajes/Documents/selenium/DropDownDemo.html");
		WebElement dropDown= driver.findElement(By.id("duration"));
		Select selectOpt=new Select(dropDown);
		selectOpt.selectByIndex(2);
		Thread.sleep(2000);

	selectOpt.selectByValue("40");
	Thread.sleep(5000);
	List<WebElement> alloptions = selectOpt.getOptions();
	for(WebElement options:alloptions) {
	System.out.println(options.getText());

	
	
	
	
	//List<WebElement> dropdownelements = driver.findElements(By.id("subject"));
	//for(WebElement ele:dropdownelements) {
		//System.out.println(ele.getText());
	


}}
}