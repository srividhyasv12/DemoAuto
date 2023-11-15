package actions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssignHealthandglow {
public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajes\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		Actions action=new Actions(driver);
		
		
	driver.get("https://healthandglow.com/ ");
	Thread.sleep(5000);
	WebElement homecare=driver.findElement(By.xpath("//span[text()='Home Care'])[1]"));
	action.moveToElement(homecare).perform();
List<WebElement> options = driver.findElements(By.xpath("//div[containd(@class,'MuiGrid-spacing')])[1]/div/div"));

for(WebElement opt:options)
{
	System.out.println(opt.getText());
}
driver.findElement(By.xpath("h6[text()=''"))
Thread.sleep(6000);driver.quit();
}


}