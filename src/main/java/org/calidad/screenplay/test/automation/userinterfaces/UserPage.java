package org.calidad.screenplay.test.automation.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;


public class UserPage extends PageObject {
    public static final Target INPUT_TEXT = Target.the("Input search").locatedBy("//*[@name='q']");
    public static final Target LINK_BANCOLOMBIA_PAGE = Target.the("LINK BANCOLOMBIA PAGE").locatedBy("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/a/h3");

    //buttons to click in bancolombia website
    public static final Target BUTTON_CONTINUAR = Target.the("Boton continuar").locatedBy("//*[@id=\"boton-seleccion-tarjeta\"]");
    public static final Target CHECK_SI = Target.the("Check si").locatedBy("//*[@id='opcion-si']");
    public static final Target AMOUNT_INPUT = Target.the("Input valor").locatedBy("//*[@id=\"valor-simulacion\"]");
    public static final Target MONTHS_INPUT = Target.the("Input meses").locatedBy("//*[@id=\"valor-plazo\"]");
    public static final Target BIRTHDATE_INPUT = Target.the("Input fecha de nacimiento").locatedBy("//*[@id=\"campo-fecha\"]");

    //input de la fecha de nacimiento
    public static final Target YEAR_BUTTON = Target.the("Input año de nacimiento").locatedBy("//*[@id=\"mat-datepicker-0\"]/div/mat-multi-year-view/table/tbody/tr[4]/td[2]/div[1]");
    public static final Target MONTH_BUTTON = Target.the("Input mes de nacimiento").locatedBy("//*[@id=\"mat-datepicker-0\"]/div/mat-year-view/table/tbody/tr[3]/td[1]/div[1]");
    public static final Target DAY_BUTTON = Target.the("Input dia de nacimiento").locatedBy("//*[@id=\"mat-datepicker-0\"]/div/mat-month-view/table/tbody/tr[5]/td[3]/div[1]");

    //boton para simular
    public static final Target SIMULATE_BUTTON = Target.the("Boton simular").locatedBy("//*[@id=\"boton-simular\"]");
    public static final Target TEXT_RESULTS_PAGE = Target.the("Texto de resultados de Simulador Credito Bancolombia").locatedBy("//*[@id=\"layoutContainers\"]/div/div[2]/div/div[2]/section/div[3]/div[2]/app-root/div/app-resultado-simulacion/section[1]/span");
}
