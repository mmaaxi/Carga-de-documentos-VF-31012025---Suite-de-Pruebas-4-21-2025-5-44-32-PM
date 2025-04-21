Feature: Validar carga exitosa de documento con formato y tamaño válidos

  Scenario: Cargar un documento PDF con formato y tamaño válidos
    Given El usuario está en la página de carga de documentos
    When El usuario selecciona el botón 'Cargar documento'
    Then Se despliega el diálogo de selección de archivos
    When El usuario elige un documento PDF con tamaño permitido
    Then El sistema reconoce el formato y tamaño del documento
    When El usuario confirma la carga del documento
    Then El documento se carga exitosamente y se muestra un mensaje de confirmación