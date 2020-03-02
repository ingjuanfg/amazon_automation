package co.com.amazon.stepdefinitions;

import co.com.amazon.tasks.Buy;
import co.com.amazon.tasks.Find;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static co.com.amazon.utils.DriverManager.amazonCapabilities;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class BuyArticleAmazonStepDefinition {

    @Before
    public void prepararEscenario() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that (.*) is on Amazon Desktop$")
    public void thatJuanIsOnAmazonDesktop(String actorName) {
        theActorCalled(actorName).can(
                BrowseTheWeb.with(amazonCapabilities())
        );
    }


    @When("^He buys an (.*) book$")
    public void heBuysAnEdgarAllaPoeSBook(String autorBook) {
        theActorInTheSpotlight().attemptsTo(
                Find.aBook(autorBook),
                Buy.theArticle()
        );
    }

    @Then("^He should see a successfull message$")
    public void heShouldSeeASuccessfullMessage() {
    }
}
