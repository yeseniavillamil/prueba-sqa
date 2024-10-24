package starter.interactions.esperas;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.actions.Open;
import starter.interactions.PaginaPrincipal;

@AllArgsConstructor
public class Detener implements Interaction {

    private int segundos;

    @Override
    public <T extends Actor> void performAs(T actor) {

        /**
         * aqui hace las acciones que cumplen con la tarea
         */
       try {
           Thread.sleep(segundos * 1000);
       }catch (Exception e){

       }

    }

    public static Performable por(int segundos) {
        return Tasks.instrumented(Detener.class,
                segundos);
    }


}
