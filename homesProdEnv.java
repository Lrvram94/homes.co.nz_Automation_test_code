package intro;
import org.openqa.selenium.By;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class homesconz {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Learning\\selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		// Test case 1A Search - Auckland - Production Environment

		driver.get("https://www.homes.co.nz");
		driver.manage().window().maximize();
		driver.findElement(By.id("autocomplete-search")).sendKeys("Auckland");
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'ng-tns-c165-8 addressResult ng-star-inserted')]")));
		List<WebElement> options = driver.findElements(By.xpath("//div[contains(@class,'ng-tns-c165-8 addressResult ng-star-inserted')]"));
		for (WebElement option : options) 
		{
			if (option.getText().equalsIgnoreCase("Auckland")) 
			{
				option.click();
				break;
			}

		}
		Thread.sleep(5000);
		String Expected_page = "https://homes.co.nz/map/auckland/auckland?searchLoc=pdb%60Fafui%60@";
		String Actual_page = driver.getCurrentUrl();
		if (Actual_page.equalsIgnoreCase(Expected_page)) 
		{
			System.out.println("The Correct page is opened for search result - Auckland");
		} 
		else 
		{
			System.out.println("The page opened is Incorrect");
		}

		String SearchResult = driver.findElement(By.xpath("/html[1]/body[1]/homes-root[1]/homes-map-page[1]/div[1]/homes-drawer[1]/div[1]/div[2]/h2[1]")).getText();
		if (SearchResult.contains("Auckland")) 
		{
			System.out.println("Correct search results displayed - Auckland");
		}
		else 
		{
			System.out.println("InCorrect search results displayed");
		}

		// Test Case 2 A Search- Petone Production Environment

		driver.get("https://www.homes.co.nz");
		driver.findElement(By.id("autocomplete-search")).sendKeys("Petone");
		WebDriverWait wait2 = new WebDriverWait(driver, 5);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'ng-tns-c165-8 addressResult ng-star-inserted')]")));
		List<WebElement> options2 = driver.findElements(By.xpath("//div[contains(@class,'addressResult')]"));
		for (WebElement option : options2) 
		{
			if ((option.getText().contains("Petone"))) 
			{
				option.click();
				break;
			}

		}
		Thread.sleep(5000);
		String Expected_page2 = "https://homes.co.nz/map/lower-hutt/petone?searchLoc=nvrzFsclj%60@";
		String Actual_page2 = driver.getCurrentUrl();
		if (Actual_page2.equalsIgnoreCase(Expected_page2)) 
		{
			System.out.println("The Correct page is opened for search result - Petone");
		} 
		else 
		{
			System.out.println("The page opened is Incorrect");
		}

		String SearchResult2 = driver.findElement(By.xpath("/html[1]/body[1]/homes-root[1]/homes-map-page[1]/div[1]/homes-drawer[1]/div[1]/div[2]/h2[1]")).getText();
		if (SearchResult2.contains("Petone")) 
		{
			System.out.println("Correct search results displayed - Petone");
		} 
		else 
		{
			System.out.println("InCorrect search results displayed");
		}

		// Test Case 3 A - 45 Puru Crescent Production Environment

		driver.get("https://www.homes.co.nz");
		driver.findElement(By.id("autocomplete-search")).sendKeys("45 Puru Crescent");
		WebDriverWait wait3 = new WebDriverWait(driver, 5);
		wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'ng-tns-c165-8 addressResult ng-star-inserted')]")));
		List<WebElement> options3 = driver.findElements(By.xpath("//div[contains(@class,'addressResult')]"));
		for (WebElement option : options3) 
		{
			if ((option.getText().contains("45 Puru Crescent"))) 
			{
				option.click();
				break;
			}

		}
		Thread.sleep(5000);
		String Expected_page3 = "https://homes.co.nz/map/wellington/lyall-bay/puru-crescent/45?searchLoc=rhf%7BFyb%7Bi%60@";
		String Actual_page3 = driver.getCurrentUrl();
		if (Actual_page3.equalsIgnoreCase(Expected_page3)) 
		{
			System.out.println("The Correct page is opened for search results - Puru, Cresent");
		} 
		else 
		{
			System.out.println("The page is Incorrect");
		}

		String SearchResult3 = driver.findElement(By.xpath("/html[1]/body[1]/homes-root[1]/homes-map-page[1]/div[1]/homes-drawer[1]/div[1]/div[2]/h2[1]")).getText();
		if (SearchResult3.contains("45 Puru Crescent, Lyall Bay")) 
		{
			System.out.println("Correct search results displayed - Puru, Cresent");
		} 
		else 
		{
			System.out.println("InCorrect search results displayed");
		}

		driver.close();

	}

}
