package co.com.amazon.stepdefinitions;

import co.com.amazon.questions.ExistProductsQuestion;
import co.com.amazon.tasks.Add;
import co.com.amazon.tasks.Search;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static co.com.amazon.stepdefinitions.Hooks.Jeremias;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class AddToTheCarStepDefinition {

    @When("^The user search the product (.*)$")
    public void searchTheProduct(String product) {
        Jeremias.attemptsTo(
                Search.theProduct(product)
        );
    }

    @When("^add it to the car$")
    public void addItToTheCar() {
        Jeremias.attemptsTo(
                Add.toTheCar()
        );
    }

    @Then("^the user should see it in the car list$")
    public void theuserSholudSeeItInCarList() {
        Jeremias.should(
                seeThat(ExistProductsQuestion.inCar())
        );
    }
}
