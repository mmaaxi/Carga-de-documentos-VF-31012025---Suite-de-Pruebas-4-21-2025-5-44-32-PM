Feature: Validar carga simultánea de múltiples documentos

  Scenario: Cargar múltiples documentos válidos
    Given El usuario está en la página de carga de documentos
    When Selecciona el botón 'Cargar documento' y elige múltiples archivos válidos
    Then El sistema permite seleccionar más de un documento a la vez
    When Confirma la carga de todos los documentos seleccionados
    Then Cada documento se carga de forma concurrente sin afectar la integridad de los demás
    And Se muestran mensajes de confirmación para cada documento cargado
    Then Deben aparecer mensajes de éxito individuales para cada archivo