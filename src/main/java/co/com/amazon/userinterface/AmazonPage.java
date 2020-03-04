package co.com.amazon.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AmazonPage {
    public static final Target INPUT_FIND = Target.the("Input to Product Articles").located(By.name("Search"));
    public static final Target CARD_ARTICLE = Target.the("Card that contains the article").located(By.name("Pokemon Plush, pikachu de felpa de 8.0 in"));
    public static final Target BUTTON_ADD_TO_CAR = Target.the("Button add to cart").located(By.name("Agregar al Carrito"));
    public static final Target BUTTON_CAR = Target.the("Button car").located(By.name("1 artículo en el carrito"));
}