package co.com.amazon.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AmazonPage {
    public static final Target INPUT_FIND = Target.the("Input to Product Articles").located(By.name("Buscar"));
    public static final Target BUTTON_FIND = Target.the("Button to Product Articles").located(By.name("Ir"));
    public static final Target CARD_ARTICLE = Target.the("Card that contains the article").located(By.name("Sherlock Holmes: Adventures in the Realms of Edgar Allan Poe"));
    public static final Target BUTTON_ADD_TO_CART = Target.the("Button add to cart").located(By.name("Agregar al Carrito"));
}