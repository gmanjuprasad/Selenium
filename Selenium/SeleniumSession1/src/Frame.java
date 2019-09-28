import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriver_win32\\chromedriver.exe");  
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("http://the-internet.herokuapp.com/nested_frames");
        driver.manage().window().maximize();
        
        String XPath = "/html/body";
        
        //To Get Right
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-right");
        String s = driver.findElement(By.xpath(XPath)).getText();
        
        //To Get to Left
        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-left");
        s = driver.findElement(By.xpath(XPath)).getText();
        
        //To Get Middle By ID 
        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame(1);
        s = driver.findElement(By.xpath(XPath)).getText();
        
        //To Get Bottom
        driver.switchTo().defaultContent();
        WebElement frameWebElement = driver.findElement(By.name("frame-bottom"));
        driver.switchTo().frame(frameWebElement);
        s = driver.findElement(By.xpath(XPath)).getText();
        
        driver.close();
        driver.quit();

	}

}
