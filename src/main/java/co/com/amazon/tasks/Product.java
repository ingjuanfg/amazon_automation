package co.com.amazon.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;
import org.openqa.selenium.Keys;

import static co.com.amazon.userinterface.AmazonPage.INPUT_FIND;

public class Product implements Task {
    private String product;

    public Product(String product){
        this.product = product;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(INPUT_FIND),
                Enter.theValue(product).into(INPUT_FIND),
                SendKeys.of(Keys.ENTER).into(INPUT_FIND)
        );
    }
}
