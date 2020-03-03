package co.com.amazon.stepdefinitions;

import co.com.amazon.questions.ExistProductsQuestion;
import co.com.amazon.tasks.Add;
import co.com.amazon.tasks.Search;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static co.com.amazon.stepdefinitions.Hooks.Daniel;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class AddToTheCarStepDefinition {

    @When("^The user search the product (.*)$")
    public void searchTheProduct(String product) {
        Daniel.attemptsTo(
                Search.theProduct(product)
        );
    }

    @When("^The actor search the product (.*)$")
    public void searchAProduct(String product) {
        Daniel.attemptsTo(
                Search.product(product)
        );
    }

    @When("^The buyer search the product (.*)$")
    public void searchProduct(String product) {
        Daniel.attemptsTo(
        );
    }

    @When("^add it to the car$")
    public void addItToTheCar() {
        Daniel.attemptsTo(
                Add.toTheCar()
        );
    }

    @When("^add the product to the car$")
    public void addToTheCar() {
        Daniel.attemptsTo(
                Add.productToTheCar()
        );
    }

    @When("^put the product to the car$")
    public void putToTheCar() {
        Daniel.attemptsTo(
        );
    }

    @Then("^the user should see it in the car list$")
    public void theuserSholudSeeItInCarList() {
        Daniel.should(
                seeThat(ExistProductsQuestion.inCar())
        );
    }

    @Then("^He should see it in the car list$")
    public void theuserShouldSeeItInCar() {
        Daniel.should(
                seeThat(ExistProductsQuestion.inCar())
        );
    }

    @Then("^the buyer should see it in the car list$")
    public void theBuyerShouldSeeItInCar() {
        Daniel.should(
        );
    }
}
