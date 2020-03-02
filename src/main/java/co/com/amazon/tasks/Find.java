package co.com.amazon.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;
import org.openqa.selenium.Keys;

import static co.com.amazon.userinterface.AmazonPage.BUTTON_FIND;
import static co.com.amazon.userinterface.AmazonPage.INPUT_FIND;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Find implements Task {
    private String autorBook;

    public Find(String autorBook){
        this.autorBook = autorBook;
    }

    public static Performable aBook(String autorBook){
        return instrumented(Find.class, autorBook);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(INPUT_FIND),
                Enter.theValue(autorBook).into(INPUT_FIND),
                SendKeys.of(Keys.ENTER).into(INPUT_FIND)
                //Click.on(BUTTON_FIND)
        );
    }
}
