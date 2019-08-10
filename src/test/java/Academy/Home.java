package Academy;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import resources.Base;

public class Home extends Base {
	@Test
	public void initializedriver() throws IOException {
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
	}
	@Test
	public void navigation() {
		Account ac=new Account(driver);
		ac.firstname().sendKeys("honey");
		ac.lastname().sendKeys("hayi");
		ac.mobile().sendKeys("9108407878");
		ac.password().sendKeys("honey@65765");
		WebElement daypicker=driver.findElement(By.xpath("//select[@id='day']"));
		Select day=new Select(daypicker);
		day.selectByVisibleText("16");
		WebElement monthpicker=driver.findElement(By.xpath("//select[@id='month']"));
		Select month=new Select(monthpicker);
		month.selectByVisibleText("May");
		WebElement yearpicker=driver.findElement(By.xpath("//select[@id='year']"));
		Select year=new Select(yearpicker);
		year.selectByVisibleText("1992");
		ac.gender().click();
		ac.submit().click();
		
		
		
		
		
		
		
	}
	@AfterTest
	public void teardown() {
		driver.close();
		driver=null;
	}

	}

