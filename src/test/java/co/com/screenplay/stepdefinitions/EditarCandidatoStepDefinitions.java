package co.com.screenplay.stepdefinitions;

import co.com.screenplay.tasks.AbrirPagina;
import co.com.screenplay.tasks.EditarCandidato;
import co.com.screenplay.userinterfaces.UserInterface;
import io.cucumber.java.Before;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.*;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.checkerframework.checker.units.qual.C;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class EditarCandidatoStepDefinitions {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("que el usuario ingresa a la página principal")
    public void queElUsuarioIngresaALaPaginaPrincipal() {
        theActorCalled("Usuario").wasAbleTo(
                AbrirPagina.en("http://localhost:4200") // o la URL real de tu aplicación
        );
    }

    @Cuando("hace clic en el botón {string}")
    public void haceClicEnElBoton(String boton) {
        if (boton.equalsIgnoreCase("Candidatos")) {
            OnStage.theActorInTheSpotlight().attemptsTo(
                    EditarCandidato.irAListaDeCandidatos()
            );
        }
    }

    @Cuando("selecciona el botón {string} del candidato {string}")
    public void seleccionaElBotonDelCandidato(String boton, String candidato) {
        if (boton.equalsIgnoreCase("Editar")) {
            OnStage.theActorInTheSpotlight().attemptsTo(
                    EditarCandidato.seleccionarCandidato(candidato)
            );
        }
    }

    @Cuando("hace scroll hasta el botón {string}")
    public void haceScrollHastaElBoton(String boton) {
        if (boton.equalsIgnoreCase("Guardar")) {
            OnStage.theActorInTheSpotlight().attemptsTo(
                    EditarCandidato.hacerScrollHacia(UserInterface.GUARDAR_BUTTON)
            );
        }
    }

    @Cuando("presiona el botón {string}")
    public void presionaElBoton(String boton) {
        if (boton.equalsIgnoreCase("Guardar")) {
            OnStage.theActorInTheSpotlight().attemptsTo(
                    EditarCandidato.guardarCambios()
            );
        }
    }
}