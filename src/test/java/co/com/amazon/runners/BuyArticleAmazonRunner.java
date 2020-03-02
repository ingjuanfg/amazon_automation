package co.com.amazon.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/buy_article_amazon.feature",
        glue = "co.com.amazon.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class BuyArticleAmazonRunner {
}
