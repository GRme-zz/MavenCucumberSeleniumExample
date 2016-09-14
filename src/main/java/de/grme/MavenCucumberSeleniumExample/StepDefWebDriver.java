package de.grme.MavenCucumberSeleniumExample;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.de.Wenn;

public class StepDefWebDriver {

	private static WebDriver wd = null;
	
	@After
	public void after() {
		getWebDriver().quit();
	}
	
	public synchronized static WebDriver getWebDriver() {
	    if (wd == null)
	    	wd = new FirefoxDriver();
	    return wd;
	}
	
    @Wenn("^die Seite \\[(.*?)\\] geladen wird$")
    public void openPage(String url) {
        getWebDriver().get(url);
        Assert.assertTrue(!wd.getPageSource().isEmpty());
    }
}