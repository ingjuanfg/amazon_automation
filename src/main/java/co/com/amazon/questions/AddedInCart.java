package co.com.amazon.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class AddedInCart implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return true;
    }
}
