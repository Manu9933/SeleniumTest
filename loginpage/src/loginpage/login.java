package loginpage;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class login {
	
	
	public static void main(String[]org) throws Exception{
			
	System.setProperty("webdriver.chrome.driver","C:\\Manisha\\drivers\\chrome\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	//hrl
	driver.get("http://www.google.com");
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com");
	//login 
	driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("8668840881");
	driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("Manisha@9933");
	driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button")).click();
	//Search
	//driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div")).click();
	//driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input")).sendKeys("Mobile");
	
	
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Mobile");
	driver.findElement(By.xpath("//*[@id=\'container\']/div/div[1]/div[1]/div[2]/div[2]/form/div/button/svg/g/path[2]")).click();
	
	//scroll down
	//JavascriptExecutor js=(JavascriptExecutor) driver;
	//WebElement POCO =driver.findElement(By.xpath("//*[@id=\'container\']/div/div[3]/div[1]/div[2]/div[3]/div/div[3]/div/a[2]"));
	//js.executeScript("arguments[0].scrollIntoView();", POCO );
	//POCO .click();
	
	//click on selected mobile
	

	//driver.close();
	}
}
