package loginpage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipcard {
	public static void main(String[]org) throws Exception{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Manisha\\drivers\\45\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
	
		//url
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		//login 
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("8668840881");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("Manisha@9933");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button")).click();
		//Search
		Thread.sleep(5000);
		driver.findElement(By.name("q")).sendKeys("laptop");
		driver.findElement(By.className("L0Z3Pu")).click();
		//select laptop
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='MIXNux']/div/div/div/img")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//body/div[@id='container']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/button[1]")).click();
		driver.findElement(By.className("_2KpZ6l _2U9uOA _3v1-ww")).click();
		
		

	}
}