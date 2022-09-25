package ApplaudoQaAutomationTrainee.Maven.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
	
	@Test 
	public void exercise_2(){
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
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		/*7-Look for the element with the text "BEST SELLERS"
		 *8-Find the correct XPATH for that element. 
		 *9-Find the CSS path. 
		 *10-Use either the XPATH or CSS path to do a click action on that element. 
		 */
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)");
	    driver.findElement(By.xpath("//*[@id='home-page-tabs']/li[2]/a")).click();
	    //11- Look for another element that contains ID and locate the element By.ID in Selenium.
	    //12- Use this new element with an action like click or store the text it contains. 
	    String idText = driver.findElement(By.id("facebook_block")).getText();
	    //System.out.println(idText);
	    //13- Go back to the main page.
	    driver.findElement(By.xpath("//*[@id=\"home-page-tabs\"]/li[1]/a")).click(); //driver.navigate().back() method took me back to a blank page.
	    //14-Find multiple elements with the same class, for example "price product-price" and get the price of the first and the last element and show those prices in console.
	    List<WebElement> elements = (driver.findElements(By.xpath("//div[@class=\"tab-content\"]/ul[1]//child::div[@class=\"right-block\"]/*/span[@itemprop=\"price\"]")));	
	    //Print first and last element. 
	    System.out.println(elements.get(0).getText());
	    System.out.println(elements.get(elements.size()-1).getText());    
		driver.close();
		driver.quit();
	}
}
