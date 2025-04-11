package co.com.screenplay.tasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import co.com.screenplay.userinterfaces.UserInterface;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EditarCandidato {

    public static Task irAListaDeCandidatos() {
        return Task.where("{0} hace clic en el botón 'Candidatos'",
                Click.on(UserInterface.CANDIDATOS_BUTTON)
        );
    }

    public static Task seleccionarCandidato(String nombre) {
        return Task.where("{0} Daniel Peña " + nombre,
                Click.on(UserInterface.EDITAR_CANDIDATO_BUTTON)
        );
    }

    public static Task cambiarNombre(String nombre) {
        return Task.where("{0} cambia el nombre del candidato a " + nombre,
                Clear.field(UserInterface.NOMBRE_INPUT),
                Enter.theValue(nombre).into(UserInterface.NOMBRE_INPUT)
        );
    }

    public static Task cambiarApellido(String apellido) {
        return Task.where("{0} cambia el apellido del candidato a " + apellido,
                Clear.field(UserInterface.APELLIDO_INPUT),
                Enter.theValue(apellido).into(UserInterface.APELLIDO_INPUT)
        );
    }

    public static Task hacerScrollHacia(Target objetivo) {
        return Task.where("{0} hace scroll hacia el elemento objetivo",
                Scroll.to(objetivo)
        );
    }
    public static Task guardarCambios() {
        return Task.where("{0} hace clic en el botón 'Guardar'",
                Click.on(UserInterface.GUARDAR_BUTTON)
        );
    }
}