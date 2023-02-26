package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ShareBus {

	public static void main(String[] args) throws InterruptedException {

		// TODO Auto-generated method stub
		// System.setProperty("webdriver.chrome.driver", "C:\\web
		// driver\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://test.sharebus.co/");
		driver.findElement(By.xpath("//*[@id=\"app\"]/nav/div/ul/li/button")).click();
		driver.findElement(By.id("email")).sendKeys("brainstation23@yopmail.com");
		driver.findElement(By.id("password")).sendKeys("Pass@1234");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div/form/div[4]/button")).click();

		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='body-wrapper']/div/div/div/div")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[text() = 'Sharelead'])[1]")).click();

		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div/div/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[5]/button")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("startPoint")).sendKeys("Oslo, Norway");
		driver.findElement(By.id("destination")).sendKeys("Kolbotn, Norway");

		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div[2]/div[1]/div/form/div[2]/button[2]")).click();
		WebElement radioBtn = driver
				.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div[2]/div[1]/div/div[1]/div[1]/button[1]"));
		radioBtn.click();

		WebElement dropdown = driver
				.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div[2]/div[1]/div/div[1]/div[2]/div[1]/i"));

		Select select = new Select(dropdown);

		select.selectByVisibleText("NTNUI");

		// Verify that the selected option is correct
		WebElement selectedOption = select.getFirstSelectedOption();
		if (selectedOption.getText().equals("NTNUI")) {
			System.out.println("NTNUI is selected");
		} else {
			System.out.println("NTNUI is not selected");
		}
		WebElement radio = driver
				.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/button[2]"));
		radio.click();
		WebElement radio1 = driver
				.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/button[2]"));
		radio1.click();
		WebElement radio2 = driver
				.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div[2]/div[2]/div/div[2]/div[5]/button[2]"));
		radio2.click();
		WebElement radio3 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[4]/button"));
		radio3.click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/form/div[1]/div/input")).sendKeys("Fun");
		WebElement radio4 = driver.findElement(By.xpath("//*[@id=\"vacation3\"]"));
		radio4.click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/form/div[3]/div/input")).sendKeys("BrainStation23");
		WebElement radio5 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/form/div[5]/button"));
		radio5.click();
		WebElement radio6 = driver.findElement(By.xpath("//*[@id=\"tripPreviewModal\"]/div/div/div[3]/button[2]"));
		radio6.click();
		WebElement radio7 = driver.findElement(By.xpath("//*[@id=\"app\"]/nav/div/ul/li[1]/button"));
		radio7.click();
		String expectedTitle = "test.sharebus.co/my-buses";
		String actualTitle = driver.getTitle();
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Page title is correct");
		} else {
			System.out.println("Page title is not correct");
		}
		
		
		driver.quit();
	}
}
