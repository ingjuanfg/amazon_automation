package co.com.amazon.stepdefinitions;

import co.com.amazon.tasks.Search;
import cucumber.api.java.en.When;

import static co.com.amazon.stepdefinitions.Hooks.Jeremias;

public class AddToTheCarStepDefinition {

    @When("^The user search the product (.*)$")
    public void searchTheProduct(String product) {
        Jeremias.attemptsTo(
                Search.theProduct(product)
        );
    }

    @When("^add it to the car$")
    public void addItToTheCar() {
    }
}
