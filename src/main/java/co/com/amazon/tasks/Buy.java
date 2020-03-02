package co.com.amazon.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.amazon.userinterface.AmazonPage.BUTTON_ADD_TO_CART;
import static co.com.amazon.userinterface.AmazonPage.CARD_ARTICLE;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Buy implements Task {

    public static Performable theArticle(){
        return instrumented(Buy.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(CARD_ARTICLE, isVisible()),
                Click.on(CARD_ARTICLE),
                Click.on(BUTTON_ADD_TO_CART)
        );
    }
}
