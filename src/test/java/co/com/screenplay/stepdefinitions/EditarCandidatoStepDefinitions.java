package co.com.screenplay.stepdefinitions;

import co.com.screenplay.tasks.AbrirPagina;
import co.com.screenplay.tasks.EditarCandidato;
import co.com.screenplay.userinterfaces.UserInterface;
import io.cucumber.java.Before;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.*;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.checkerframework.checker.units.qual.C;

import static co.com.screenplay.userinterfaces.UserInterface.APELLIDO_INPUT;
import static co.com.screenplay.userinterfaces.UserInterface.NOMBRE_INPUT;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

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
            theActorInTheSpotlight().attemptsTo(
                    EditarCandidato.irAListaDeCandidatos()
            );
        }
    }

    @Cuando("selecciona el botón {string} del candidato {string}")
    public void seleccionaElBotonDelCandidato(String boton, String candidato) {
        if (boton.equalsIgnoreCase("Editar")) {
            theActorInTheSpotlight().attemptsTo(
                    EditarCandidato.seleccionarCandidato(candidato)
            );
        }
    }
    @Cuando("cambia el nombre por {string}")
    public void cambiaElNombrePor(String nombre) {
        theActorInTheSpotlight().attemptsTo(
                Clear.field(NOMBRE_INPUT),
                Enter.theValue(nombre).into(NOMBRE_INPUT)
        );
    }

    @Cuando("cambia el apellido por {string}")
    public void cambiaElApellidoPor(String apellido) {
        theActorInTheSpotlight().attemptsTo(
                Clear.field(APELLIDO_INPUT),
                Enter.theValue(apellido).into(APELLIDO_INPUT)
        );
    }
    @Cuando("hace scroll hasta el botón {string}")
    public void haceScrollHastaElBoton(String boton) {
        if (boton.equalsIgnoreCase("Guardar")) {
            theActorInTheSpotlight().attemptsTo(
                    EditarCandidato.hacerScrollHacia(UserInterface.GUARDAR_BUTTON)
            );
        }
    }

    @Cuando("presiona el botón {string}")
    public void presionaElBoton(String boton) {
        if (boton.equalsIgnoreCase("Guardar")) {
            theActorInTheSpotlight().attemptsTo(
                    EditarCandidato.guardarCambios()
            );
        }
    }
}