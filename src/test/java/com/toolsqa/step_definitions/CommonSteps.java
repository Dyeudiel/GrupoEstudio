package com.toolsqa.step_definitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;

public class CommonSteps {

	@Managed
	WebDriver driver;

	@Before
	public void inicio() {

		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\drivers\\chromedriver78.exe");
		driver = new ChromeDriver();

		OnStage.setTheStage(Cast.ofStandardActors());
		OnStage.theActorCalled("Daniel");
		OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(driver));
		OnStage.theActorInTheSpotlight().attemptsTo(Open.url("http://automationpractice.com/index.php"));
		driver.manage().window().maximize();

	}

	@After
	public void cerrar() {		
		driver.quit();
	}
}
