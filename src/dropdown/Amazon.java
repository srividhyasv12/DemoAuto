package dropdown;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon {
public static void main(String[] args) throws InterruptedException, IOException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajes\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in/");
		WebElement searchbox=driver.findElement(By.id("searchDropdownBox"));
		Select search=new Select(searchbox);
search.selectByVisibleText("Music");
List<WebElement> selectedopt = search.getAllSelectedOptions();
for(WebElement options:selectedopt) {
System.out.println(options.getText());

}
System.out.println("==============================");

List<WebElement> alloptions = search.getOptions();
for(WebElement options:alloptions) {
System.out.println(options.getText());
}
Thread.sleep(5000);
driver.quit();



}
}