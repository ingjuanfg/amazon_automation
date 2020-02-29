package co.com.amazon.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.amazon.com/-/es/")
public class IndexPage extends PageObject {
    public static final Target TXT_SEARCH = Target.the("Field search").located(By.id("twotabsearchtextbox"));
    public static final Target BTN_SEARCH = Target.the("Button search").located(By.xpath("//div[./span[@id='nav-search-submit-text']]"));
    public static final Target BTN_PRODUCT = Target.the("First product in the list").located(By.xpath("//div[contains(@class,'s-result-list s-search-results sg-row')]/div[1]"));

    private IndexPage() {
    }
}
