package co.com.amazon.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.amazon.userinterface.CarPage.*;

public class ToTheCar implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_PRODUCT),
                Click.on(BTN_ADD_CAR),
                Click.on(BTN_CAR)
        );
    }
}