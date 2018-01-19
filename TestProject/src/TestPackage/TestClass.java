package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Creating driver");
//		WebDriver driver = new FirefoxDriver();
//		System.out.println("Launching site");
//		driver.get("https://www.google.co.in/?gfe_rd=cr&ei=TOGSWcXSK6Hx8AfJ16mQDA");
//		System.out.println("Launched site");
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\AUTOMATION\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver chdriver = new ChromeDriver();
		chdriver.get("https://www.google.co.in/?gfe_rd=cr&ei=TOGSWcXSK6Hx8AfJ16mQDA");
		chdriver.findElement(By.xpath(" ")).sendKeys(new String[]{"Hello, selenium"});
		
	}

}
