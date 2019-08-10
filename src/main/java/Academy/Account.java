package Academy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Account {
	public WebDriver driver;
	By name=By.xpath("//input[@name='firstname']");
	By lname=By.xpath("//input[@name='lastname']");
	By mob=By.xpath("//input[contains(@name,'reg_email__')]");
	By newpass=By.xpath("//input[@type='password']");
	By sex=By.xpath("//label[contains(text(),'Female')]");
	By sub=By.xpath("//input[@type='submit']");
	public Account(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	public WebElement firstname() {
		return driver.findElement(name);
	}
	public WebElement lastname() {
		return driver.findElement(lname);
	}
	public WebElement mobile() {
	return driver.findElement(mob);
	}
	public WebElement password() {
		return driver.findElement(newpass);
	}
	public WebElement gender() {
		return driver.findElement(sex);
	}
	public WebElement submit() {
		return driver.findElement(sub);
	}
	
	

}
