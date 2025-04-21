Feature: Validar integridad del documento después de la carga mediante checksum

  Scenario: Verificar integridad del documento cargado
    Given el usuario carga un documento válido
    When se calcula el checksum del documento cargado
    Then el checksum del documento cargado debe coincidir con el checksum del documento original
    And el registro de verificación debe ser guardado en el sistema