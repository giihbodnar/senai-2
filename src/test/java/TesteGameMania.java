import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteGameMania {
	private WebDriver driver;
	
	@Before
	public void ConfigureTest () {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\OI417414\\Documents\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void NavigabilityTest () {
		driver.get("https://ellievi.github.io/GameMania/#computadores");
		driver.findElement(By.id("computadores")).click();
		driver.findElement(By.id("nxt-btn")).click();
	}
	
}
