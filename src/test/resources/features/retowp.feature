Feature: Checkeo precios vuelos
  Como usuario de la pagina despegar
  Deseo conocer los precios de los vuelos  desde diferentes ogigenes a diferentes destinos
  con el proposito de agendar las vacaciones

  Background:
    Given que el usuario se encuentra en la pagina web de vuelos.com

  @regresion
  Scenario: Digito los datos necesarios para la verificacion de los precios de los vuelos  ida y vuelta
    When el Usuario ingresa los campos obligatorios y necesarios para la seleccion del destino de ida y vuelta  e inicia la busqueda.
    Then el sistema debera mostrar por pantalla los diferentes precios del vueldo de ida y vuelta.

  @regresion2
  Scenario: Digito los datos necesarios para la verificacion de los precios vuelo de solo ida.
    When el Usuario ingresa los campos obligatorios y necesarios para la seleccion del destino de ida e inicia la busqueda.
    Then el sistema debera mostrar por pantalla los diferentes precios del vueldo de ida.