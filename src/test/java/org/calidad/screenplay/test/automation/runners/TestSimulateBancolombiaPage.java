package org.calidad.screenplay.test.automation.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/simulatorCreditBancolombiaWebPage.feature",
        glue = "org.calidad.screenplay.test.automation.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class TestSimulateBancolombiaPage {

}
