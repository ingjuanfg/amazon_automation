package co.com.amazon.stepdefinitions;

import co.com.amazon.interactions.OpenThe;
import cucumber.api.java.Before;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class Hooks {

    @Managed(driver = "chrome")
    private WebDriver theBrowser;
    public static final Actor Jeremias = Actor.named("Daniel");

    @Before
    public void prepareStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Before
    public void initialization() {
        Jeremias.can(BrowseTheWeb.with(theBrowser));
        Jeremias.wasAbleTo(OpenThe.browser());
    }
}
