package co.com.amazon.tasks;

import net.serenitybdd.screenplay.Performable;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Search {

    public static Performable theProduct(String product) {
        return instrumented(TheProduct.class, product);
    }

    public static Performable product(String product) {
        return instrumented(Product.class, product);
    }

    public static Performable aProduct() {
        return instrumented(AProduct.class);
    }
}
