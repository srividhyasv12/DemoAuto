package dataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToreadDatafromPropertyFile {
public static void main(String[] args) throws IOException, InterruptedException {
	//read data from the variable
	
 FileInputStream fis=new FileInputStream("./testdata/actitime.properties");
	Properties prop=new Properties();
	
	//read data from property file
	prop.load(fis);
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajes\\Downloads\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	
	
	//fetching the url
	String testurl = (String) prop.get("url");
	driver.get(testurl);
	//username
	String username=(String) prop.get("username");
	driver.findElement(By.id("username")).sendKeys(username);
	//pass password
	driver.findElement(By.name("pwd")).sendKeys((String) prop.get("password"));
	Thread.sleep(4000);
	driver.findElement(By.id("loginButton")).click();
	
	
	
	
	
}
}
