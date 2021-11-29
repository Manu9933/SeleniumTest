package loginpage;

import java.awt.Desktop.Action;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class orangehrm {
	
	public static void main (String[]arg) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Manisha\\drivers\\45\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		
		WebElement k=driver.findElement(By.name("q"));
		k.sendKeys("https://opensource-demo.orangehrmlive.com/");
		k.sendKeys(Keys.ENTER);
		
		//driver.findElement(By.linkText("View Profile")).click();
		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div[1]/a/h3")).click();
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");

		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		
		//index dropdown
		
		Actions actions = new Actions(driver);
		
		WebElement menuOption = driver.findElement(By.className("firstLevelMenu"));
	
		actions.moveToElement(menuOption).perform();
		
		
		driver.findElement(By.className("firstLevelMenu")).click();
		driver.findElement(By.id("searchSystemUser_employeeName_empName")).sendKeys("gan");
		List<WebElement>options= driver.findElements(By.className("ac_input"));
	
		//driver.findElement(By.className("ac_even")).click();
		
//		for( WebElement option : options)
//		{
//			option.getText().equalsIgnoreCase("Gautam Ganesh");
//			
//			//Thread.sleep(3000);
//			option.click();
//			break;
//			
//		}
	
		for(int i=0; i<options.size();i++)
		{
		
			
			String name=options.get(i).getText();
			if(name.contains("ganesh"))
			{
				
				
			}
			
			
		}
	}
	}
	
	
	


