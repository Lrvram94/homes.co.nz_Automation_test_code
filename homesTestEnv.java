package intro;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class homesTestEnv {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Learning\\selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// Test Environment test cases
		// Test case 1B Search - Auckland - Test Environment

		driver.get("https://ketu.homes-test.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("autocomplete-search")).sendKeys("Auckland");
		WebDriverWait wait4 = new WebDriverWait(driver, 5);
		wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'ng-tns-c165-8 addressResult ng-star-inserted')]")));
		List<WebElement> options4 = driver.findElements(By.xpath("//div[contains(@class,'ng-tns-c165-8 addressResult ng-star-inserted')]"));
		for (WebElement option : options4) 
		{
			if (option.getText().equalsIgnoreCase("Auckland")) 
			{
				option.click();
				break;
			}

		}
		Thread.sleep(5000);
		String Expected_page4 = "https://ketu.homes-test.com/map/auckland/auckland?searchLoc";
		String Actual_page4 = driver.getCurrentUrl();
		if (Actual_page4.contains(Expected_page4)) 
		{
			System.out.println("The Correct page is opened for search result - Auckland Test Environment");
		} 
		else
		{
			System.out.println("The page opened is Incorrect");
		}

		String SearchResult4 = driver.findElement(By.xpath("/html[1]/body[1]/homes-root[1]/homes-map-page[1]/div[1]/homes-drawer[1]/div[1]/div[2]/h2[1]")).getText();
		if (SearchResult4.contains("Auckland")) 
		{
			System.out.println("Correct search results displayed - Auckland Test Environment");
		} 
		else 
		{
			System.out.println("InCorrect search results displayed");
		}

		// Test Case 2 B - Petone Test Environment

		driver.get("https://ketu.homes-test.com/");
		driver.findElement(By.id("autocomplete-search")).sendKeys("Petone");
		WebDriverWait wait5 = new WebDriverWait(driver, 5);
		wait5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'ng-tns-c165-8 addressResult ng-star-inserted')]")));
		List<WebElement> options5 =  driver.findElements(By.xpath("//div[contains(@class,'addressResult')]"));
		for (WebElement option : options5)
		{
			if ((option.getText().contains("Petone")))
			{
				option.click();
				break;
			}

		}
		Thread.sleep(5000);
		String Expected_page5 = "https://ketu.homes-test.com/map/lower-hutt/petone?searchLoc";
		String Actual_page5 = driver.getCurrentUrl();
		if (Actual_page5.contains(Expected_page5)) 
		{
			System.out.println("The Correct page is opened for search result - Petone Test Environment");
		} 
		else 
		{
			System.out.println("The page opened is Incorrect");
		}

		String SearchResult5 = driver.findElement(By.xpath("/html[1]/body[1]/homes-root[1]/homes-map-page[1]/div[1]/homes-drawer[1]/div[1]/div[2]/h2[1]")).getText();
		if (SearchResult5.contains("Petone")) 
		{
			System.out.println("Correct search results displayed - Petone Test Environment");
		} 
		else 
		{
			System.out.println("InCorrect search results displayed");
		}

		// Test Case 3 B - 45, Puru Cresent Test Environment
		
		driver.get("https://ketu.homes-test.com/");
		driver.findElement(By.id("autocomplete-search")).sendKeys("45 Puru Crescent");
		WebDriverWait wait6 = new WebDriverWait(driver, 5);
		wait6.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'ng-tns-c165-8 addressResult ng-star-inserted')]")));
		List<WebElement> options6 = driver.findElements(By.xpath("//div[contains(@class,'addressResult')]"));
		for (WebElement option : options6) 
		{
			if ((option.getText().contains("45 Puru Crescent")))
			{
				option.click();
				break;
			}

		}
		Thread.sleep(5000);
		String Expected_page6 = "https://ketu.homes-test.com/map/wellington/lyall-bay/puru-crescent/45?searchLoc=rhf%7BFyb%7Bi%60@";
		String Actual_page6 = driver.getCurrentUrl();
		if (Actual_page6.equalsIgnoreCase(Expected_page6)) 
		{
			System.out.println("The Correct page is opened for search results - Puru, Cresent Test Environment");
		} 
		else 
		{
			System.out.println("The page opened is Incorrect");
		}
		String SearchResult6 = driver.findElement(By.xpath("/html[1]/body[1]/homes-root[1]/homes-map-page[1]/div[1]/homes-drawer[1]/div[1]/div[2]/h2[1]")).getText();
		if (SearchResult6.contains("45 Puru Crescent, Lyall Bay"))
		{
			System.out.println("Correct search results displayed - Puru, Cresent Test Environment");
		} 
		else 
		{
			System.out.println("InCorrect search results displayed");
		}
		
		driver.close();

	}
}
