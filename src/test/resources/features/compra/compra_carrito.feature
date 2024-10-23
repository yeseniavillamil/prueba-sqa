Feature: Carrito de compras


  Scenario Outline: Agregar un producto con 2 unidades al carrito
    Given El cliente esta en la pagina principal de mundoflor
    When selecciona la categoria "<categoria>" y producto "<producto>" y agrega "<unidades>" unidades al carrito
    Then el carrito de compras debe mostrar un producto con "<unidades>" unidades
    Examples:
      |categoria      |producto|unidades|
      |  Amor         | 1       | 2     |
      |  Cumpleaños   | 1       | 2     |


