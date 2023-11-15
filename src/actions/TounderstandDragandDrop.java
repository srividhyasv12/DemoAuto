package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TounderstandDragandDrop {
public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajes\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		Actions action=new Actions(driver);
		
		
	driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
	Thread.sleep(5000);
	//switchcontrol to frame
	WebElement framename = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));//iframe control
	driver.switchTo().frame(framename);
WebElement src1 =driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));//source 1 image
WebElement src2 =driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));//source image 2
WebElement src3 =driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));//souce image 3
WebElement src4 =driver.findElement(By.xpath("//img[@alt='On top of Kozi kopka']"));//source image 4

Thread.sleep(2000);
WebElement target = driver.findElement(By.id("trash"));//trash
action.dragAndDrop(src1, target).perform();Thread.sleep(2000);
action.clickAndHold(src2).moveToElement(target).perform();
action.clickAndHold(src3).release(target).perform();Thread.sleep(2000);
action.dragAndDrop(src4, target).perform();

Thread.sleep(8000);
driver.quit();
}}
