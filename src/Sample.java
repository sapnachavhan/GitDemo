import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Initialize browser
		System.setProperty("webdriver.chrome.driver","E:\\Software\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		//driver.findElement(By.id("username")).sendKeys("USer12");
		//driver.findElement(By.name("pw")).sendKeys("pass12345");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		driver.findElement(By.xpath("//a[@value='MAA']")).click();
		
		//driver.close();
		 
	}

}
