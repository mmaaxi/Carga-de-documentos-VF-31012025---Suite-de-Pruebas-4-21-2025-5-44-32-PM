Feature: Validar comportamiento del sistema ante interrupción de red durante la carga

  Scenario: Simular interrupción de red durante carga de documento
    Given el usuario ha iniciado sesión en la aplicación
    When inicia el proceso de carga de un documento válido
    Then el proceso de carga comienza normalmente
    When ocurre una interrupción en la conexión de red
    Then el sistema detecta la pérdida de conexión y pausa la operación
    When se restablece la conexión y se reintenta la carga
    Then el sistema retoma o reinicia el proceso de carga o ofrece opción de reintentar