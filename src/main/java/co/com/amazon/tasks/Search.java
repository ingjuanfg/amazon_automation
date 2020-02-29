package co.com.amazon.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.amazon.userinterface.IndexPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Search implements Task {
    private String product;

    public Search(String product) {
        this.product = product;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(product).into(TXT_SEARCH),
                Click.on(BTN_SEARCH),
                Click.on(BTN_PRODUCT)
        );
    }

    public static Performable theProduct(String product) {
        return instrumented(Search.class, product);
    }
}
