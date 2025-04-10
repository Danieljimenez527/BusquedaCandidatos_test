package co.com.screenplay.tasks2;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AbrirPagina implements Task {

    private static final String URL_CANDIDATOS = "http://localhost:4200/candidatos";

    public static AbrirPagina enLaPagina() {
        return instrumented(AbrirPagina.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url(URL_CANDIDATOS));
    }
}