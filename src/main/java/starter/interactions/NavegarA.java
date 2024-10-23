package starter.interactions;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

@AllArgsConstructor
public class NavegarA implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {

        /**
         * aqui hace las acciones que cumplen con la tarea
         */
        actor.attemptsTo(
                Open.browserOn().the(PaginaPrincipal.class)
        );

    }

    public static Performable paginaPrincipal() {
        return Tasks.instrumented(NavegarA.class);
    }


}
