package co.com.amazon.userinterface;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class AmazonAppPage {
    public static final Target BUTTON_LISTO_HOME = Target.the("Button to accept configuration").located(MobileBy.xpath("//android.view.View[@resource-id='landing-doneButton']//android.widget.Button"));
    public static final Target INPUT_FIND_PRODUCT = Target.the("Input to Product Articles").located(MobileBy.id("com.amazon.mShop.android.shopping:id/rs_search_src_text"));
}
