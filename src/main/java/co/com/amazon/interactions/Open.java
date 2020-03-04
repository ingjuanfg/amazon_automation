package co.com.amazon.interactions;

import io.appium.java_client.android.AndroidDriver;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Open{

        public static WebDriver app() {
            WebDriver driver = null;
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("driver", "chrome");
            capabilities.setCapability("chrome.driver", "C:/chromedriver.exe");
            capabilities.setCapability("wait.for.timeout ", "16000");
            capabilities.setCapability("timeouts.implicitlywait", "1600");
            try {
                driver = new RemoteWebDriver(new URL("http://www.google.com"), capabilities);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
            return driver;
        }
}
