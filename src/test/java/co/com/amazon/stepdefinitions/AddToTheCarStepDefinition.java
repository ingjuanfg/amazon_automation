package co.com.amazon.stepdefinitions;

import co.com.amazon.interactions.Open;
import co.com.amazon.interactions.OpenThe;
import co.com.amazon.questions.ExistProducts;
import co.com.amazon.tasks.Add;
import co.com.amazon.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.android.AndroidDriver;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.remote.DesiredCapabilities;

import static co.com.amazon.utils.DriverManager.amazonCapabilities;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getProxiedDriver;

public class AddToTheCarStepDefinition {

    @Before
    public void prepareStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @When("^The user search the product (.*)$")
    public void searchTheProduct(String product) {
        theActorCalled("Juan").can(BrowseTheWeb.with(getProxiedDriver()));
        theActorInTheSpotlight().wasAbleTo(OpenThe.browser());
        theActorInTheSpotlight().attemptsTo(
                Search.theProduct(product)
        );
    }

    @When("^The actor search the product (.*)$")
    public void searchAProduct(String product) {
        theActorCalled("Juan").can(
                BrowseTheWeb.with(amazonCapabilities())
        );
    theActorInTheSpotlight().attemptsTo(
                Search.product(product)
        );
    }

    @When("^The buyer search the product (.*)$")
    public void searchProduct(String product) {
        theActorCalled("Juan").attemptsTo(
                Search.aProduct()
        );
    }

    @When("^add it to the car$")
    public void addItToTheCar() {
        theActorInTheSpotlight().attemptsTo(
                Add.toTheCar()
        );
    }

    @When("^add the product to the car$")
    public void addToTheCar() {
        theActorInTheSpotlight().attemptsTo(
                Add.productToTheCar()
        );
    }

    @When("^put the product to the car$")
    public void putToTheCar() {
        theActorInTheSpotlight().attemptsTo(
        );
    }

    @Then("^the user should see it in the car list$")
    public void theuserSholudSeeItInCarList() {
        theActorInTheSpotlight().should(
                seeThat(ExistProducts.inCar())
        );
    }

    @Then("^He should see it in the car list$")
    public void theuserShouldSeeItInCar() {
        theActorInTheSpotlight().should(seeThat(ExistProducts.inTheCar()));
    }

    @Then("^the buyer should see it in the car list$")
    public void theBuyerShouldSeeItInCar() {
        theActorInTheSpotlight().should(
        );
    }
}
