package co.com.screenplay.tasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.Actor;

public class AbrirPagina implements Task {

    private final String url;

    public AbrirPagina(String url) {
        this.url = url;
    }

    public static AbrirPagina en(String url) {
        return new AbrirPagina(url);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url(url)
        );
    }
}