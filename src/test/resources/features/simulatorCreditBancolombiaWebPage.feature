#Author Esneider
  #language: en

  #historia de usuario
Feature: Hacer una simulacion de prestamo de libre inversion en la pagina web de Bancolombia
  Como usuario necesito buscar el sistio web de bancolombia
  para hacer una simulación de credito de libre inversion

  #hay escenarios multiples y singulares (se ejecuta solo un escenario)
  # se puede enviar diferentes filas de parametros para ejecutar la prueba
  #Scenario Outline: envia multiples combinaiciones de parametros

  Scenario: Buscar la pagina oficial de Bancolombia en el motor de google
    Given que me encuentro en la pagina principal de google
    When busco la pagina de bancolombia para simular credito de libre inversion
    Then puedo ver el link de la pagina oficial de creditos de bancolombia