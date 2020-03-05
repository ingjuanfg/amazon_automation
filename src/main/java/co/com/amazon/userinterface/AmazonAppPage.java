package co.com.amazon.userinterface;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class AmazonAppPage {
    public static final Target BUTTON_DONE_HOME = Target.the("Button to accept configuration").locatedBy("//android.widget.Button[contains(@text, 'Skip sign in')]");
    public static final Target INPUT_FIND_PRODUCT = Target.the("Input to Product Articles").locatedBy("//android.widget.EditText[contains(@text,'What are you looking for?')]");
    public static final Target CARD_PRODUCT_LIST = Target.the("Product in the list").locatedBy("//android.webkit.WebView/android.view.View/android.view.View/android.view.View[7]");
    public static final Target SELECTED_PRODUCT_LIST = Target.the("Product in the list").locatedBy("(//android.widget.TextView[contains(@text, 'poe book')])[1]");
    public static final Target BUTTON_ADD_TO_CART = Target.the("Button to add to cart").locatedBy("//android.widget.Button[contains(@text, 'Add to Cart')]");
    public static final Target BUTTON_GO_TO_CART = Target.the("Button GO add to cart").locatedBy("//android.widget.ImageView[@content-desc='Cart']");
}
