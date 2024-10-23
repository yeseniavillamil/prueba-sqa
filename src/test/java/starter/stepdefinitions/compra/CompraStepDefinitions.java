package starter.stepdefinitions.compra;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import starter.interactions.NavegarA;
import starter.tasks.compra.AgregarProducto;
import starter.userinterfaces.compra.ProductosUI;

public class CompraStepDefinitions {

    @Given("{actor} esta en la pagina principal de mundoflor")
    public void dadoQueEstaEnLaPaginaPrincipal(Actor actor) {
        actor.wasAbleTo(NavegarA.paginaPrincipal());
    }

    @When("selecciona la categoria {string} y producto {string} y agrega {string} unidades al carrito")
    public void searchesFor(String categoria, String producto, String unidades) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                AgregarProducto.alCarritoCompra(categoria,producto,unidades)
        );
    }

    @Then("el carrito de compras debe mostrar un producto con {string} unidades")
    public void searchesFor(String unidades) {

        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(WebElementQuestion.the(ProductosUI.RESUMEN)
                        , WebElementStateMatchers.hasValue(unidades))
        );

    }


}
