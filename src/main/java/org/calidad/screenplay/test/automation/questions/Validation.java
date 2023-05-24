package org.calidad.screenplay.test.automation.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static org.calidad.screenplay.test.automation.userinterfaces.UserPage.TEXT_RESULTS_PAGE;
import static org.calidad.screenplay.test.automation.utils.Constants.TEXT_TO_VALIDATE;

public class Validation implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        //trae el texto TEXT_BANCOLOMBIA_PAGE si lo esta viendo el usuario en ese momento

        String temp = Text.of(TEXT_RESULTS_PAGE).answeredBy(actor);
        return temp.contains(TEXT_TO_VALIDATE);
    }

    public static Validation theBancolombiaPage(){
        return new Validation();
    }
}