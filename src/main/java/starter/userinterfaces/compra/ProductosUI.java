package starter.userinterfaces.compra;

import net.serenitybdd.screenplay.targets.Target;

public class ProductosUI {

    public static final Target CATEGORIA =  Target.the("categoria seleccionado")
            .locatedBy("//ul[@id='menu-category-menu']//li/a[text()='{0}']");
    public static final Target PRODUCTO_ELEGIDO =  Target.the("producto seleccionado")
            .locatedBy("(//figure//img[not(@style)])[{0}]");

    public static final Target CANTIDAD =  Target.the("cantidad")
            .locatedBy("//input[contains(@type,'number')]");

    public static final Target AGREGAR =  Target.the("agregar")
            .locatedBy("//button[@name='add-to-cart']");

    public static final Target RESUMEN =  Target.the("resumen")
            .locatedBy("//input[@type='number']");


}
