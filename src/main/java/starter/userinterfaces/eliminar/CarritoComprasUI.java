package starter.userinterfaces.eliminar;

import net.serenitybdd.screenplay.targets.Target;

public class CarritoComprasUI {

    public static final Target ELIMINAR_PRODUCTO =  Target.the("eliminar producto")
            .locatedBy("//td[@class='product-remove']");

    public static final Target ESTADO_CARRITO =  Target.the("estado carrito")
            .locatedBy("//*[@class='mini-cart-items']");

}
