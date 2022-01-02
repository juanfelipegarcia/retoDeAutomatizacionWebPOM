Feature: Compra Online Productos
  Como Comprador de la empresa zonafit deseo  ingresar a la pagina Web zonafit.co
  Para comprar los productos segun sus caracteristicas
  Con el fin de Obtener los productos requeridos

  Background:
    Given Que el comprador se encuentra en la pagina web de la empresa zonafit

  @Comprador1
  Scenario: Productos por 2
    When el comprador ingresa en X2 añade los productos al carrito de compras dilegencia el formulario y realiza el pedido
    Then el comprador debere observar el mensaje de comfirmacion de su pedido de X2.

  @Comprador2
  Scenario: Productos en Oferta
    When el comprador ingresa en Ofertas añade los productos al carrito de compras dilegencia el formulario y realiza el pedido
    Then el comprador debere observar el mensaje de comfirmacion de su pedido de Ofertas.




