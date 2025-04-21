Feature: Validar manejo de duplicidad en carga de documentos

  Scenario: Evitar carga duplicada de un documento
    Given el usuario ha iniciado sesión y está en la página de carga de documentos
    When carga un documento válido que ya ha sido cargado anteriormente
    Then el sistema detecta la duplicidad mediante comprobación de metadatos o checksum
    When intenta cargar el mismo documento nuevamente
    Then el sistema muestra un mensaje de error o advertencia indicando la duplicidad
    And el sistema no almacena archivos duplicados