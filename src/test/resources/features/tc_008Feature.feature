Feature: Validar acción de cancelar carga de documento

  Scenario: Cancelar carga de documento
    Given El usuario inicia la carga de un documento válido
    When El usuario selecciona 'Cancelar carga'
    Then La carga del documento se detiene inmediatamente
    And No se guarda ningún registro o archivo incompleto en el sistema