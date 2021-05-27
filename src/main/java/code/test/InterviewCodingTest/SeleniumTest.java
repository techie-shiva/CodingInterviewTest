package code.test.InterviewCodingTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {


	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "/Users/admin/Documents/chromedriver");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.espncricinfo.com/");
		System.out.println(driver.getTitle());

		driver.findElement(By.className("search")).click();
		Thread.sleep(15000);
		driver.findElement(By.id("wzrk-cancel")).click();
		driver.findElement(By.className("search")).click();
		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul[2]/div/div/div/form/input")).sendKeys("Sachin Tendulkar");
		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul[2]/div/div/div/form/button/i")).click();
		driver.findElement(By.xpath("//*[@id=\"viewport\"]/div[5]/div[2]/main/div/div[4]/ul/li/h3/a")).click();

		WebElement battingAndFieldingHeader = driver.findElement(By.xpath("//*[@id=\"main-container\"]/div[1]/div[2]/div/div[2]/div[3]/div/div[1]/h5"));
		WebElement batAndFieldTable = driver.findElement(By.xpath("//*[@id=\"main-container\"]/div[1]/div[2]/div/div[2]/div[3]/div/div[1]/div/table"));

		WebElement totalNumOfODIMatchesPlaWebElement  = driver.findElement(By.xpath("//*[@id=\"main-container\"]/div[1]/div[2]/div/div[2]/div[3]/div/div[1]/div/table/tbody/tr[2]/td[2]"));

		if (battingAndFieldingHeader.isDisplayed() && batAndFieldTable.isDisplayed())
		if (totalNumOfODIMatchesPlaWebElement.getText().contentEquals("463")) {
			System.out.println("Confirmed that #of ODI matches played by sachin "+totalNumOfODIMatchesPlaWebElement.getText());
		}
		else {
			System.out.println("Verification failed");
		}
		driver.close(); 
		driver.quit();


	}

}
