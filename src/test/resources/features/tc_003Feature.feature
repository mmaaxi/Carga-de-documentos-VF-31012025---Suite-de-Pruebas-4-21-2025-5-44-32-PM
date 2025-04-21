Feature: Validar error al cargar documento que exceda el tamaño máximo permitido

  Scenario: Usuario intenta cargar un documento demasiado grande
    Given El usuario está en la página de carga de documentos
    When Selecciona el botón 'Cargar documento'
    Then Se despliega el diálogo de selección de archivos
    When Selecciona un documento cuyo tamaño supere el límite permitido
    Then El sistema verifica el tamaño del documento
    When Intenta cargar el documento
    Then Se muestra mensaje de error indicando que el tamaño del documento excede lo permitido