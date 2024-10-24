Feature: Carrito de compras

@Agregar
  Scenario Outline: Agregar un producto con 2 unidades al carrito
    Given El cliente esta en la pagina principal de mundoflor
    When agrega al carrito: "<unidades>" unidades del producto "<producto>", de la categoria "<categoria>"
    #Then el carrito de compras debe mostrar un producto con "<unidades>" unidades
    Then el total de items en el carrito de compras sera de: "<total>"
    Examples:
      |categoria      |producto|unidades|total |
  #    |  Amor         | 1       | 2     |   2   |
  #    |  Cumpleaños   | 1       | 2     | 2   |


@Eliminar
  Scenario Outline: Eliminar un producto agregado al carrito de compras
    Given El cliente esta en la pagina principal de mundoflor
    When agrega al carrito: "<unidades>" unidades del producto "<producto>", de la categoria "<categoria>"
    And retira el producto "<producto>" del carrito
    Then el total de items en el carrito de compras sera de: "<total>"
    Examples:
      |categoria      |producto|unidades| total |
      |  Amor         | 1       | 2     |   0   |
     # |  Cumpleaños   | 1       | 2     |  0  |