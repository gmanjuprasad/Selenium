import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriver_win32\\chromedriver.exe");  
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("http://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();
        
        WebElement alertButtonWebElement = driver.findElement(By.xpath("//*[@id='content']/div/ul/li[1]/button"));
        alertButtonWebElement.click();
        
        
        String s = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        
        
        alertButtonWebElement = driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
        alertButtonWebElement.click();
        
        driver.switchTo().alert().dismiss();
        
        driver.close();
        driver.quit();

	}

}
