package loginpage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;




public class Orangehrmconverttexttono {
	public static void main(String[] arg) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Manisha\\drivers\\45\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		WebElement k = driver.findElement(By.name("q"));
		k.sendKeys("https://opensource-demo.orangehrmlive.com/");
		k.sendKeys(Keys.ENTER);

		// driver.findElement(By.linkText("View Profile")).click();
		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div[1]/a/h3")).click();
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");

		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();

		// index dropdown
		Actions actions = new Actions(driver);
		WebElement menuOption = driver.findElement(By.className("firstLevelMenu"));
		actions.moveToElement(menuOption).perform();

		driver.findElement(By.className("firstLevelMenu")).click();
		driver.findElement(By.id("searchSystemUser_employeeName_empName")).sendKeys("ganesh");
		Thread.sleep(2000);
		
		WebElement ajaxContainer1 = driver.findElement(By.className("ac_results"));
		WebElement ajaxHolder1 = ajaxContainer1.findElement(By.tagName("ul"));
		List<WebElement> ajaxValues1 = ajaxHolder1.findElements(By.tagName("li"));
		for (WebElement value1 : ajaxValues1) {
			if(value1.getText().equals("Goutam Ganesh"))
					{
				value1.click();
				break;
			}
			}
	    //Click on PIM static dropdown using select class
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
	//	driver.findElement(By.id("empsearch_sub_unit")).click();
		
		List<WebElement> options = driver.findElements(By.id("empsearch_sub_unit"));				
		WebElement option =driver.findElement(By.id("empsearch_sub_unit"));
		Select dropdown=new Select(option);
		dropdown.selectByIndex(5);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		//lick on leave calender
		driver.findElement(By.id("menu_leave_viewLeaveModule")).click();
		driver.findElement(By.id("calFromDate")).click();
		driver.findElement(By.className("ui-datepicker-year")).click();
//		driver.findElement(By.xpath("//*[@id=\\\"ui-datepicker-div\\\"]/div/div/select[2]")).click();;
		List<WebElement> Dates=driver.findElements(By.className("ui-datepicker-year"));

		int exactdate=Dates.size();
		//for(WebElement ele:Dates)
		for(int i=0;i<exactdate;i++)
		{
			
			String Date=Dates.get(i).getText();
			
			if(Date.equals("2001"))
			{
				
				Dates.get(i).click();
				break;
			}
			
			
		}
		
		//driver.findElement(By.className("ui-datepicker-month")).click();
	//	List <WebElement> months=driver.findElements(null)
		
	
	}
	}
