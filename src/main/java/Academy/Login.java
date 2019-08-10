package Academy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
	public WebDriver driver;
	By uname=By.xpath("//input[@id='email']");
	By pswd=By.xpath("//input[@name='pass']");
	By login=By.xpath("//input[@type='submit']");
	
	public Login(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public WebElement username() {
		return driver.findElement(uname);
	}
	public WebElement password() {
		return driver.findElement(pswd);
	}
	public WebElement submit() {
		return driver.findElement(login);
	}

}
