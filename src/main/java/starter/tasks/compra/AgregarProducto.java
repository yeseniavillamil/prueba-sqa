package starter.tasks.compra;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.Scroll;
import starter.interactions.PaginaPrincipal;
import starter.userinterfaces.compra.ProductosUI;

@AllArgsConstructor
public class AgregarProducto implements Task {

    private String producto;
    private String unidades;
    private String categoria;

    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(

                Click.on(ProductosUI.CATEGORIA.of(categoria)),

                Click.on(ProductosUI.PRODUCTO_ELEGIDO.of(producto)),

                Enter.theValue(unidades).into(ProductosUI.CANTIDAD),

                Click.on(ProductosUI.AGREGAR)

        );

    }

    public static Performable alCarritoCompra(String categoria,String producto, String unidades) {
        return Tasks.instrumented(AgregarProducto.class,
                producto,
                unidades,
                categoria);
    }


}
