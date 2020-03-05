package co.com.amazon.stepdefinitions;

import co.com.amazon.questions.ExistProducts;
import co.com.amazon.tasks.Add;
import co.com.amazon.tasks.Search;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static co.com.amazon.utils.DriverManager.amazonCapabilities;
import static co.com.amazon.utils.DriverManager.webCapabilities;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AddToTheCarStepDefinition {

    @When("^The user search the product (.*)$")
    public void searchTheProduct(String product) {
        OnStage.setTheStage(new OnlineCast());
        theActorCalled("Juan").can(BrowseTheWeb.with(webCapabilities()));
        theActorInTheSpotlight().attemptsTo(
                Search.theProduct(product)
        );
    }

    @When("^The actor search the product (.*)$")
    public void searchAProduct(String product) {
        OnStage.setTheStage(new OnlineCast());
        theActorCalled("Juan").can(
                BrowseTheWeb.with(amazonCapabilities())
        );
    theActorInTheSpotlight().attemptsTo(
                Search.product(product)
        );
    }

    @When("^The buyer search the product (.*)$")
    public void searchProduct(String product) {
        OnStage.setTheStage(new OnlineCast());
        theActorCalled("Juan").attemptsTo(
                Search.aProduct(product)
        );
    }

    @When("^add it to the cart$")
    public void addItToTheCar() {
        theActorInTheSpotlight().attemptsTo(
                Add.toTheCar()
        );
    }

    @When("^add the product to the cart$")
    public void addToTheCar() {
        theActorInTheSpotlight().attemptsTo(
                Add.productToTheCar()
        );
    }

    @When("^put the product to the cart$")
    public void putToTheCar() {
        theActorInTheSpotlight().attemptsTo(
                //Add.theProductToTheCar()
        );
    }

    @Then("^the user should see it in the cart list$")
    public void theuserSholudSeeItInCarList() {
        theActorInTheSpotlight().should(
                seeThat(ExistProducts.inCar())
        );
    }

    @Then("^He should see it in the cart list$")
    public void theuserShouldSeeItInCar() {
        theActorInTheSpotlight().should(seeThat(ExistProducts.inTheCar()));
    }

    @Then("^the buyer should see it in the cart list$")
    public void theBuyerShouldSeeItInCar() {
        theActorInTheSpotlight().should(
        );
    }
}
