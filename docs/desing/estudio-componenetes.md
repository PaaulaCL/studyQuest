# Estudio de Componentes - StudyQuest

## 1. Página de Listado
*   **Diseño de alta fidelidad:** Pantalla 3. Historial de sesiones de estudio

![3. Pantalla de historia.png](3.%20Pantalla%20de%20historia.png)
*   **Layout principal:** Se utiliza un `Column` como contener vertical general de la pantalla.
*   **Componentes fundamentales:**
    *   `TopBar`: Barra superior que incluye el botón de retroceso, el logo de la app y el usuario.
    *   `Row`: Para la cabecera principal, donde se indican cuantas sesiones de estudio se han hecho.
    *   `LazyRow` : Filtrar las asignaturas de forma rápida en caso de que se quieran ver las sesiones de una asignatura en concreto.
    *   `LazyColumn` : Es el componente clave de la pantalla. Permite visualizar las sesiones de estudio que se han hecho y seleccionarlas. Carga unicamente las tarjetas visibles en pantalla.
        * `TargetaItem` : Tarjeta individual para cada una de las sesiones de estudio.
    *   `NavigationBar` : Barra de navegación inferior fija con los accesos directod a Inicio, Historial y Perfil.
*   **Imágenes:**

Estudio de la pantalla 3 - general:

![Pantalla3 - Historial de estudio 1.png](estudio-componenetes/Pantalla%203/Pantalla3%20-%20Historial%20de%20estudio%201.png)
    
Estudio de la pantalla 3 - detalle:

![Pantalla3 - Historial de estudio 2.png](estudio-componenetes/Pantalla%203/Pantalla3%20-%20Historial%20de%20estudio%202.png)



## 2. Página de Detalle
*   **Diseño de alta fidelidad:** Pantalla 5. Detalle de sesión de estudio

![5. Pantalla detalle historial.png](5.%20Pantalla%20detalle%20historial.png)

*   **Layout principal:** Se utiliza un `Column` como contener vertical general de la pantalla.
*   **Componentes fundamentales:**
    *   `TopBar`: Barra superior que incluye el botón de retroceso, el logo de la app y el usuario.
    *   `Column`: Para la cabecera principal. COntiene información como la asginatura, el tiempo, la exp conseguida...
    *   `Rown` : Para las cabeceras de cada sección de detalle.
    *   `Column` : Para la mayoría del contenido.
    *   `NavigationBar` : Barra de navegación inferior fija con los accesos directod a Inicio, Historial y Perfil.
*   **Imágenes:**

Estudio de la pantalla 5 - general:

![Pantalla 5 - Detalle estudio 1.png](estudio-componenetes/Pantalla%205/Pantalla%205%20-%20Detalle%20estudio%201.png)

Estudio de la pantalla 5 - cabecera principal:

![Pantalla 5 - Detalle estudio 2.png](estudio-componenetes/Pantalla%205/Pantalla%205%20-%20Detalle%20estudio%202.png)

Estudio de la pantalla 5 - apuntes:

![Pantalla 5 - Detalle estudio 3.png](estudio-componenetes/Pantalla%205/Pantalla%205%20-%20Detalle%20estudio%203.png)

Estudio de la pantalla 5 - descripción, frase y botón de eliminar:

![Pantalla 5 - Detalle estudio 4.png](estudio-componenetes/Pantalla%205/Pantalla%205%20-%20Detalle%20estudio%204.png)
