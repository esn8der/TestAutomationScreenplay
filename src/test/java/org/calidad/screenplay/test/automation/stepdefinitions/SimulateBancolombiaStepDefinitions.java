package org.calidad.screenplay.test.automation.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.calidad.screenplay.test.automation.questions.Validation;
import org.calidad.screenplay.test.automation.task.FindThe;
import org.calidad.screenplay.test.automation.task.OpenThe;
import org.calidad.screenplay.test.automation.userinterfaces.UserPage;
import org.openqa.selenium.WebDriver;

import java.util.Objects;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class SimulateBancolombiaStepDefinitions {

    @Managed(driver = "chrome")
    public WebDriver driver;

    private final Actor usuario = Actor.named("Pepito");

    @Before(order = 1)
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Before(order = 2)
    public void preStage() {
        driver.manage().window().maximize();
        usuario.can(BrowseTheWeb.with(driver));
    }

    @Given("que me encuentro en la pagina principal de google")
    public void onThePage() {
        usuario.attemptsTo(OpenThe.browser(new UserPage()));
    }

    @When("busco la pagina de bancolombia para simular credito de libre inversion")
    public void searchPage() {
        usuario.attemptsTo(FindThe.bancolombiaPage());
    }

    @Then("puedo ver el link de la pagina oficial de creditos de bancolombia")
    public void verifyLink() {
        usuario.should(seeThat(Validation.theBancolombiaPage(), aBoolean -> Objects.equals(aBoolean, true)));
    }
}
