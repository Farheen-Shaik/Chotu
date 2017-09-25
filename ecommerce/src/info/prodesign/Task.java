package info.prodesign;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {

	
	public static void main(String[] args) 
	{
	   System.setProperty("webdriver.chrome.driver", "path of chrome driver");
	   WebDriver driver=new ChromeDriver();
	   driver.close();
		
	}

}
