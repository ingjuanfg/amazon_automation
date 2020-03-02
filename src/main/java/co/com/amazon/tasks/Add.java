package co.com.amazon.tasks;

import net.serenitybdd.screenplay.Performable;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Add{

    public static Performable toTheCar() {
        return instrumented(ToTheCar.class);
    }

    public static Performable productToTheCar() {
        return instrumented(ProductToTheCar.class);
    }
}
