Feature: Flujo de compra en Demoblaze

  Scenario Outline: Realizar una compra exitosa de dos productos
    Given que el usuario navega a la pagina de Demoblaze
    When agrega los productos al carrito
    And visualiza el carrito de compras
    And completa el formulario de compra con los datos requeridos <name>,<country>,<city>,<card>,<month>,<year>
    Then deberia ver el mensaje de confirmación <mensajeRespuesta>

    Examples:
      |name  |country|city  |card  |month   |year  |mensajeRespuesta                |
      |"Juan"|"Peru" |"Lima"|"1000"|"Agosto"|"2026"| "Thank you for your purchase!" |
