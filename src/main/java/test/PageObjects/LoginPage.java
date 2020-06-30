package test.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {

		this.driver = driver;

		/*
		 * User ID : mngr262578 Password : AzunyjU
		 */

	}

	@FindBy(name = "uid")

	WebElement txtUserName;

	@FindBy(name = "password")

	WebElement Password;

	@FindBy(name = "btnLogin")

	WebElement click;

	public void setUserName(String uname) {

		txtUserName.sendKeys(uname);
	}

	public void setPassword(String pwd) {

		Password.sendKeys(pwd);
	}

	public void submit() {

		click.click();
	}


}
