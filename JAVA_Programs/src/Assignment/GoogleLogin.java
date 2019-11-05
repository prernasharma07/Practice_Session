package Assignment;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.firefox.FirefoxDriver;


public class GoogleLogin {
	
	static String global_URL= "https://www.google.com/";	
	
	public static void main(String args[]) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prerna\\git\\Practice_Session\\JAVA_Programs\\drivers\\chromedriver.exe");  
		
		WebDriver driver= new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get(global_URL);
	}

}
