package test;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestBookMyShow {

	private WebDriver driver;
	private String baseURL;

	@Before
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pragati\\eclipse\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		baseURL = "https://in.bookmyshow.com/";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void test() throws InterruptedException {
		driver.get(baseURL);
		
		driver.findElement(By.xpath("//*[@id=\"modal-root\"]/div/div/div/div[1]/div/div/input")).sendKeys("Jalgaon");
		driver.findElement(By.xpath("//*[@id=\"modal-root\"]/div/div/div/div[1]/div/div/input")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//*[@id=\"modal-root\"]/div/div/div/div[1]/div/div/input")).sendKeys(Keys.ARROW_DOWN.ENTER);
		driver.findElement(By.xpath("//*[@id=\"super-container\"]/div[2]/header/div[2]/div/div/div/div[1]/div/a[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"super-container\"]/div[2]/div[4]/div[2]/div[2]/div/div/div[2]/a/div/div[2]/div/img")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"super-container\"]/div[2]/div[3]/div[2]/div[2]/div/div[2]/div/div/div")).click();
	}
	
	@After
	public void tearDown() throws Exception {
	}


}
