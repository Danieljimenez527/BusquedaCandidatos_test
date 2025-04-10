package co.com.screenplay.tasks;

import co.com.screenplay.userinterfaces.UserInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class IrACandidatos implements Task {

    public static IrACandidatos menu() {
        return new IrACandidatos();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(UserInterface.CANDIDATOS_BUTTON)
        );
    }
}