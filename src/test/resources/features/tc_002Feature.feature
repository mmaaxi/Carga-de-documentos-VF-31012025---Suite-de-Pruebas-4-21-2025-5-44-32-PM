Feature: Validar mensaje de error al cargar archivo con formato inválido

  Scenario: Cargar archivo con formato no permitido
    Given El usuario está en la página de carga de documentos
    When El usuario selecciona el botón 'Cargar documento'
    Then Se despliega el diálogo de selección de archivos
    When El usuario elige un archivo con formato inválido
    Then El sistema detecta el formato no permitido
    When El usuario intenta cargar el documento
    Then El mensaje de error indica que el formato no es permitido