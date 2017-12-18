package whattfixSelenium;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup(){
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\TestResources\\driverExecutable\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://whatfix.com/quickolabs.com/#!flows/how-to-import-google-analytics-solution-of-whatfix/8174f470-9df9-11e3-8178-386077c653fe/");	
	}
	
	@Test
	public void test1() throws InterruptedException{
		//Click on "Self Help" on right side of the screen.
		driver.findElement(By.xpath("//a[text()='Self Help']")).click();
		
		//Click on "How to embed flows in my website or application"
		WebElement ele = driver.findElement(By.xpath("//iframe[@class='WFEMPS WFEMMT WFEMBW WFEMPV WFEMCN WFEMNT']"));
																	   
		driver.switchTo().frame(ele);
		driver.findElement(By.xpath("//a[text()='How to embed flows in my website or application?']")).click();
		
		//come out of frame
		driver.switchTo().defaultContent();
		
		//click on embed
		driver.findElement(By.xpath("//a[text()='embed']")).click();
		
		//wait for next step tooltip to be visible
		waitForElementVisible(By.cssSelector(".WFEMJU"));
		
		//click whatfixlogo hyperlink
		waitAndClick(By.cssSelector(".WFMABLB"));
				
		waitForElementVisible(By.cssSelector(".WFMAHCB [tabindex='0']:nth-of-type(1) .WFMAFJB"));
		
		//click on next button in tooltip
		waitAndClick(By.cssSelector("#wfx-tooltip-next"));
				
		waitForElementVisible(By.xpath("//body[1]/div[4]/div/div/table/tbody/tr[2]/td/div/table/tbody/tr[2]/td/div"));
		
		//Click on search icon in searchbar
		waitAndClick(By.xpath("//body[1]/div[3]/div[2]/div/div/div/table/tbody/tr/td/a"));
		
		//switch to dialog box frame with close button
		WebElement frame = driver.findElement(By.xpath("//body[1]/div[5]/div/iframe"));		
		new WebDriverWait(driver, 10).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frame));
			
		//intentional hardcoded delay just to watch dialog comming up
		Thread.sleep(2000);
		
		//click on close button
		WebElement closeButton = driver.findElement(By.cssSelector("button"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()", closeButton); 
				
	}

	@AfterMethod
	public void tearDown() throws InterruptedException, IOException{
		Thread.sleep(3000);
        driver.quit();
        Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe");
	}
	
	private void waitForElementVisible(By by){
		new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(by));

	}
	
	private void waitAndClick(By by) throws InterruptedException{
			
		WebElement whatfixElement = driver.findElement(by);
		new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(whatfixElement));
		whatfixElement.click();
	}
	
}
