import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Input {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriver_win32\\chromedriver.exe");  
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
        driver.manage().window().maximize();
        
        WebElement chckBox = driver.findElement(By.xpath("//input[@id='isAgeSelected']"));
        
        if(chckBox.isDisplayed() && chckBox.isEnabled()) {
        	if(!chckBox.isSelected()) {
        		chckBox.click();
        		System.out.println("CheckBox Selected - Pass");
        	}
        	else {
        		System.out.println("CheckBox Not Enabled/Displayed - Fail");
        	}
        }
        driver.close();
        driver.quit();
        
        driver=new ChromeDriver();
        driver.navigate().to("https://www.seleniumeasy.com/test/basic-radiobutton-demo.html");
        driver.manage().window().maximize();
        
        WebElement radioButtonWebElement = driver.findElement(By.xpath("//input[@value='Male' and @name='gender']"));
        if(radioButtonWebElement.isDisplayed() && radioButtonWebElement.isEnabled()) {
        	radioButtonWebElement.click();
        }
        
        driver.close();
        driver.quit();
        
        driver=new ChromeDriver();
        driver.navigate().to("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
        driver.manage().window().maximize();
        
        WebElement selectWebElement = driver.findElement(By.id("select-demo"));
        Select selectOptions = new Select(selectWebElement);
        selectOptions.selectByValue("Tuesday");
        selectOptions.selectByIndex(5);
        selectOptions.selectByVisibleText("Friday");
        
        
        
        
	}

}
