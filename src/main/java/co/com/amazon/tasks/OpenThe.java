package co.com.amazon.tasks;

import co.com.amazon.userinterface.IndexPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenThe implements Task {
    private IndexPage indexPage;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(net.serenitybdd.screenplay.actions.Open.browserOn(indexPage));
    }

    public static Performable browser(){
        return instrumented(OpenThe.class);
    }
}
