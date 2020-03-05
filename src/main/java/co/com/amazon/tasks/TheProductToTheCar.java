package co.com.amazon.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.amazon.userinterface.AmazonAppPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class TheProductToTheCar implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CARD_PRODUCT_LIST),
                WaitUntil.the(BUTTON_ADD_TO_CART, isVisible()),
                Click.on(BUTTON_ADD_TO_CART),
                Click.on(BUTTON_GO_TO_CART)
        );
    }
}
