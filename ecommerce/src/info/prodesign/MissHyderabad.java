package info.prodesign;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MissHyderabad {

	
	public static void main(String[] args) 
	{
		//launch browser and site
		System.setProperty("webdriver.chrome.driver", "D:\\karishma\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://124.123.41.5:8081/bamsa/");
		//maximize window
		driver.manage().window().maximize();
		
	}

}
