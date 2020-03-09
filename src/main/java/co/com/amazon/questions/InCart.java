package co.com.amazon.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.amazon.userinterface.CarPage.LST_PRODUCTS;

public class InCart implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return LST_PRODUCTS.resolveFor(actor).isPresent();
    }
}
