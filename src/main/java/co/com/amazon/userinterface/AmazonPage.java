package co.com.amazon.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AmazonPage {
    public static final Target INPUT_FIND = Target.the("Input to Product Articles").located(By.name("Buscar"));
    public static final Target CARD_ARTICLE = Target.the("Card that contains the article").located(By.name("Edgar Allan Poe: Collected Works (Leather-bound Classics)"));
    public static final Target BUTTON_ADD_TO_CAR = Target.the("Button add to cart").located(By.name("Agregar al Carrito"));
    public static final Target BUTTON_CAR = Target.the("Button car").located(By.name("Proceder al pago (1 artículo)"));
}