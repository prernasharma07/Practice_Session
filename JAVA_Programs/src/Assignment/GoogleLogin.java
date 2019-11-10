package Assignment;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleLogin {

	static String global_URL = "https://www.google.com/";
	static WebDriver driver;
	static WebElement gmailLink, gmailSignInLink, emailField, nextButton, passwordField, passwordNextButton,
			composeButton, recipientField, subjectField, textField, sendButton;
	
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Prerna\\git\\Practice_Session\\JAVA_Programs\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(global_URL);
		gmailLink = returnElement(".gb_g[data-pid=\"23\"]");
		gmailLink.click();
		System.out.println("Current Page URL: " + driver.getCurrentUrl());
		gmailSignInLink = returnElement(
				".h-c-header__cta-list.header__nav--ltr .h-c-header__nav-li.g-mail-nav-links a[href=\"https://accounts.google.com/AccountChooser?service=mail&continue=https://mail.google.com/mail/\"]");
		gmailSignInLink.click();
		ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(newTab.get(1));
		emailField = returnElement(".Xb9hP input[type=\"email\"]");
		emailField.sendKeys("qasampleuser07");
		System.out.println("Entered the Email ID");
		nextButton = returnElement("#identifierNext");
		nextButton.click();
		System.out.println("Clicked Next");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		passwordField = returnElement(".Xb9hP input[type=\"password\"]");
		passwordField.sendKeys("Qait@123");
		System.out.println("Entered the Password");
		passwordNextButton = returnElement("#passwordNext");
		passwordNextButton.click();
		System.out.println("Clicked Next");
		composeButton = returnElement(".T-I.J-J5-Ji.T-I-KE.L3");
		composeButton.click();
		System.out.println("Clicked on Compose Button");
		recipientField = returnElement(".wO.nr.l1 textarea");
		recipientField.sendKeys("qasampleuser07@gmail.com");
		System.out.println("Entered Email ID in Composition Email.");
		subjectField = returnElement("input[name=\"subjectbox\"]");
		subjectField.sendKeys("Test Subject.");
		System.out.println("Entered Subject in Composed Email.");
		textField = returnElement("div[aria-label=\"Message Body\"]");
		textField.sendKeys("Test Email Text.");
		System.out.println("Entered Text in Composed Email.");
		sendButton = returnElement("div[aria-label=\"Send ‪(Ctrl-Enter)‬\"]");
		sendButton.click();
		System.out.println("Clicked on SEND Button.");
//		driver.quit();
	}

	static WebElement returnElement(String cssPath) {
		WebElement element = driver.findElement(By.cssSelector(cssPath));
		return element;
	}

}
