package ApplaudoQaAutomationTrainee.Maven.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
public class homework0401 {
	@Test
	public void exercise_1(){
		WebDriver driver;
		/*
		// FireFox Web Driver:
		System.setProperty("webdriver.gecko.driver", "..\\Maven.java\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		*/
		/*
		// Edge Web Driver:
		System.setProperty("webdriver.edge.driver", "..\\Maven.java\\Drivers\\msedgedriver.exe");
		driver = new EdgeDriver();
		*/
		
		//Chrome Web Driver:
		System.setProperty("webdriver.chrome.driver", "..\\Maven.java\\Drivers\\chromedriver.exe"); 
		driver = new ChromeDriver();
		driver.get("http://opencart.abstracta.us/index.php?route=common/home");
		driver.manage().window().maximize();
		//1 - Verify Title.
		String expectedTitle = "My Store";
		String actualTitle = driver.getTitle();
		if (actualTitle.equalsIgnoreCase(expectedTitle))
			System.out.println("Titles Match");
		else 
			System.out.println("Error");	
		//2 - Refresh Page.
		driver.navigate().refresh();
		//3 - Go to Google.
		driver.navigate().to("https://google.com.sv");
		//4 - Go back to Home and compare URL.
		driver.navigate().back();
		String myUrl = "http://opencart.abstracta.us/index.php?route=common/home";
		String actualUrl = driver.getCurrentUrl();
		if (actualUrl.equalsIgnoreCase(myUrl))
			System.out.println("URL match");
		else 
			System.out.println("Error");
		driver.close();
		driver.quit();
	}
}
