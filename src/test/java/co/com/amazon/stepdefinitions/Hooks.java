package co.com.amazon.stepdefinitions;

import co.com.amazon.interactions.Open;
import co.com.amazon.interactions.OpenThe;
import cucumber.api.java.Before;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static co.com.amazon.interactions.Open.app;
import static co.com.amazon.utils.DriverManager.amazonCapabilities;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getProxiedDriver;

public class Hooks {
 //   @Managed(driver = "chrome")
  //  private WebDriver theBrowser;
    public static final Actor Daniel = Actor.named("Daniel");

    @Before
    public void prepareStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Before("@Web")
    public void webInitialization() {
        Daniel.attemptsTo((Performable) app());
        Daniel.can(BrowseTheWeb.with(app()));
        Daniel.wasAbleTo(OpenThe.browser());
    }

    @Before("@Desktop")
    public void desktopInitialization(){
        Daniel.can(
                BrowseTheWeb.with(amazonCapabilities())
        );
    }
/*
    @Before("@Mobile")
    public void mobileInitialization(){
        Daniel.attemptsTo(
                app()
        );
    }*/
}
