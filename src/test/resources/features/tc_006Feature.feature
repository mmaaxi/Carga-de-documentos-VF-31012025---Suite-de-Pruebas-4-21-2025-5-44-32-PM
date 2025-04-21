Feature: Validar seguridad ante inyección en metadatos de documento

  Scenario: Detectar inyección de código en metadatos al cargar documento
    Given el usuario ha seleccionado un archivo con metadatos modificados con código malicioso
    When el usuario intenta cargar el documento
    Then el sistema debe analizar los metadatos del archivo
    And el sistema detecta los caracteres sospechosos y rechaza la carga
    And se muestra un mensaje de error apropiado acerca de contenido malicioso en los metadatos