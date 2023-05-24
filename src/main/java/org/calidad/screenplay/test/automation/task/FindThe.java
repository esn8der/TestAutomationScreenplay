package org.calidad.screenplay.test.automation.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import org.calidad.screenplay.test.automation.interactions.BancolombiaPage;

public class FindThe implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(BancolombiaPage.findItAndGo());
    }

    public static FindThe bancolombiaPage() {
        return Tasks.instrumented(FindThe.class);
    }
}