package betfedimplementation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Industry {
	static String getIndustry;
	static boolean dropDownflag=false;
	public static void IndustryDropDown(String industryValues)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Sindu Selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://BetFed.com");
		WebElement ele=driver.findElement(By.id("industry"));
		Select sc=new Select(ele);
		List<WebElement> getIndustryList=sc.getOptions();
	
		for(WebElement industry:getIndustryList)
		{
			getIndustry = industry.getText();
			
			if(industryValues.contains(getIndustry))
			{
				dropDownflag=true;
			}
			
		}
		
		if(dropDownflag)
		{
			System.out.println("Industry Drop down values is listed as Expected");
		}
		else
		{
			System.out.println("Industry Drop down values is not listed as Expected");
		}
		
	}
	

}
