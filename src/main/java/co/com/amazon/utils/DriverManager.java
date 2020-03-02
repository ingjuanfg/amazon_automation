package co.com.amazon.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class DriverManager {
    private static WebDriver driver = null;
    private static DesiredCapabilities capabilities;

    private DriverManager() {
        throw new IllegalStateException("Failed to Connect with server");
    }

    public static WebDriver amazonCapabilities() {
        try {
            capabilities = new DesiredCapabilities();
            capabilities.setCapability("app", "Amazon.com.Amazon_343d40qqvtj1t!App");
            capabilities.setCapability("platformName", "windows");
            driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723"), capabilities);
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return driver;
    }
}