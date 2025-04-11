package co.com.screenplay.stepdefinitions2;

import co.com.screenplay.tasks2.AbrirPagina;
import co.com.screenplay.tasks2.BuscarCandidato;
import co.com.screenplay.userinterfaces2.CandidatosPage;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.openqa.selenium.WebDriver;

public class BuscarCandidatoStepDefinitions {

    @Managed(driver = "edge")
    public WebDriver navegador;

    private Actor actor = Actor.named("Daniel");

    @Before
    public void setUp() {
        actor.can(BrowseTheWeb.with(navegador));
    }

    @Dado("que el usuario abre la página de candidatos")
    public void abrirPaginaCandidatos() {
        actor.attemptsTo(AbrirPagina.enLaPagina());
    }

    @Cuando("el usuario busca el candidato llamado {string}")
    public void buscarCandidatoPorNombre(String nombre) {
        actor.attemptsTo(BuscarCandidato.conNombre(nombre));
    }

    @Entonces("debería ver al candidato {string}")
    public void verificarQueElCandidatoEsteEnLaLista(String nombreEsperado) {
        actor.attemptsTo(
                Ensure.that(CandidatosPage.NOMBRE_CANDIDATO(nombreEsperado)).isDisplayed()
        );
    }
}