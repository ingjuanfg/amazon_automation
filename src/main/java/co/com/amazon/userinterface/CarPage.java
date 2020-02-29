package co.com.amazon.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CarPage {
    public static final Target BTN_PRODUCT = Target.the("First product in the list").located(By.xpath("//div[contains(@class,'s-result-list s-search-results sg-row')]/div[1]"));
    public static final Target BTN_ADD_CAR = Target.the("Add to the car button").located(By.id("add-to-cart-button-ubb"));

    private CarPage() {
    }
}
