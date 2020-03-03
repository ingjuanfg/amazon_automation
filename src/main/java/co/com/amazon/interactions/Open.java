package co.com.amazon.interactions;

import io.appium.java_client.android.AndroidDriver;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Open implements Interaction {

        public static Performable app() {
            return instrumented(Open.class);
        }

        @Override
        public <T extends Actor> void performAs(T actor) {
            AndroidDriver driver;
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("automationName", "uiautomator2");
            capabilities.setCapability("deviceName", "ESU4C18A16000384");
            capabilities.setCapability("platformVersion", "9");
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("appPackage", "com.amazon.mShop.android.shopping");
            capabilities.setCapability("appActivity", "com.amazon.mShop.splashscreen.StartupActivity");
            capabilities.setCapability("autoGrantPermissions", true);
            capabilities.setCapability("fullReset", false);
            capabilities.setCapability("noReset", false);
            try {
                driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
}
