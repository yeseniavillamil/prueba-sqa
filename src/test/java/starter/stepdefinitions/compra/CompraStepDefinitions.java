package starter.stepdefinitions.compra;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.ScrollTo;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import starter.interactions.NavegarA;
import starter.tasks.compra.AgregarProducto;
import starter.tasks.compra.EliminarProducto;
import starter.userinterfaces.compra.ProductosUI;
import starter.userinterfaces.eliminar.CarritoComprasUI;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CompraStepDefinitions {

    @Given("{actor} esta en la pagina principal de mundoflor")
    public void dadoQueEstaEnLaPaginaPrincipal(Actor actor) {
        actor.wasAbleTo(NavegarA.paginaPrincipal());
    }

    @When("agrega al carrito: {string} unidades del producto {string}, de la categoria {string}")
    public void cuandoSeleccionaLaCategoriaYProductoY(String unidades, String producto, String categoria) {
        theActorInTheSpotlight().attemptsTo(
                AgregarProducto.alCarritoCompra(categoria,producto,unidades)
        );
    }

    @When("retira el producto {string} del carrito")
    public void cuandoRetiraElProductoDelCarrito(String producto) {
        theActorInTheSpotlight().attemptsTo(
                EliminarProducto.delCarrito(producto));
    }

    @Then("el carrito de compras debe mostrar un producto con {string} unidades")
    public void searchesFor(String unidades) {

        theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(WebElementQuestion.the(ProductosUI.RESUMEN)
                        , WebElementStateMatchers.hasValue(unidades))
        );

    }

    @Then("el total de items en el carrito de compras sera de: {string}")
    public void elCarritoDeComprasDebeMostrarElMensaje(String unidades) {
        theActorInTheSpotlight().attemptsTo(
                Scroll.to(CarritoComprasUI.ESTADO_CARRITO)
        );
        theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(
                        WebElementQuestion.the(CarritoComprasUI.ESTADO_CARRITO)
                        , WebElementStateMatchers.containsOnlyText(unidades)

                )
        );
    }


}
