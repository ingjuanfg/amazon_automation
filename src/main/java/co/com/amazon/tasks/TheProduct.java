package co.com.amazon.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.amazon.userinterface.IndexPage.BTN_SEARCH;
import static co.com.amazon.userinterface.IndexPage.TXT_SEARCH;

public class TheProduct implements Task {
    private String product;

    public TheProduct(String product) {
        this.product = product;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(product).into(TXT_SEARCH),
                Click.on(BTN_SEARCH)
        );
    }
}
