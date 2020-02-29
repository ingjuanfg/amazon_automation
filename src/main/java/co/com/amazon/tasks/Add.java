package co.com.amazon.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.amazon.userinterface.CarPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Add implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_PRODUCT),
                Click.on(BTN_ADD_CAR),
                Click.on(BTN_CAR)
        );
    }

    public static Performable toTheCar() {
        return instrumented(Add.class);
    }
}
