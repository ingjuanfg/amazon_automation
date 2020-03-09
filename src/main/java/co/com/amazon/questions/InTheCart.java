package co.com.amazon.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.amazon.userinterface.AmazonPage.BUTTON_CAR;

public class InTheCart implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return BUTTON_CAR.resolveFor(actor).isVisible();
    }
}
