package co.com.amazon.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static co.com.amazon.userinterface.AmazonAppPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AProduct implements Task {
    private String product;

    public AProduct(String product){
        this.product = product;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BUTTON_DONE_HOME, isEnabled()),
                Click.on(BUTTON_DONE_HOME),
                Click.on(INPUT_FIND_PRODUCT),
                Enter.theValue(product).into(INPUT_FIND_PRODUCT),
                Click.on(SELECTED_PRODUCT_LIST)
        );
    }
}
