package org.calidad.screenplay.test.automation.task;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenThe implements Task {

    private PageObject page;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(page)
        );

    }
    public OpenThe(PageObject page) {
        this.page = page;
    }
    public static OpenThe browser(PageObject page) {
        return Tasks.instrumented(OpenThe.class, page);
    }
}
