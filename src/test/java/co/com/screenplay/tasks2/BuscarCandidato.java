package co.com.screenplay.tasks2;

import co.com.screenplay.userinterfaces2.CandidatosPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class BuscarCandidato implements Task {

    private final String nombre;

    public BuscarCandidato(String nombre) {
        this.nombre = nombre;
    }

    public static BuscarCandidato conNombre(String nombre) {
        return instrumented(BuscarCandidato.class, nombre);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(CandidatosPage.BUSCADOR, WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(nombre).into(CandidatosPage.BUSCADOR),
                Hit.the(Keys.ENTER).into(CandidatosPage.BUSCADOR)
        );
    }
}