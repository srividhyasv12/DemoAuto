package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TounderstandBooleanmethods {
public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajes\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://demowebshop.tricentis.com/register ");
		Thread.sleep(2000);
		WebElement radiobutton = driver.findElement(By.id("gender-female"));
		//before selecting
		System.out.println(radiobutton.isSelected());//faalse
		//select the gender
		radiobutton.click();
		//after selecting
		System.out.println(radiobutton.isSelected());
		System.out.println(radiobutton.isDisplayed());
		
		Thread.sleep(2000);
		driver.quit();
}}
