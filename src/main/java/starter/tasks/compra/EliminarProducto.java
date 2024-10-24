package starter.tasks.compra;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import starter.userinterfaces.eliminar.CarritoComprasUI;

@AllArgsConstructor
public class  EliminarProducto implements Task {

        private String unidades;

        @Override
        public <T extends Actor> void performAs(T actor) {
            // Lógica para eliminar un producto del carrito
            actor.attemptsTo(
                    Click.on(CarritoComprasUI.ELIMINAR_PRODUCTO.of(unidades))
            );
        }

        public static Performable delCarrito (String unidades) {
            return Tasks.instrumented(EliminarProducto.class,
                    unidades);
        }




}
