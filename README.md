# Proyecto de Automatización E2E - Demoblaze

Este proyecto contiene una prueba funcional automatizada para el flujo de compra en la página https://www.demoblaze.com/, desarrollada siguiendo las mejores prácticas de ingeniería de calidad.

## 🛠️ Tecnologías y Frameworks
* **Lenguaje:** Java 11+
* **Framework de Automatización:** Serenity BDD (Screenplay Pattern)
* **Gestor de Dependencias:** Maven
* **BDD Tool:** Cucumber
* **Navegador:** Google Chrome

## 🏗️ Estructura del Proyecto (Screenplay)
El proyecto utiliza el patrón Screenplay para mejorar la legibilidad y el mantenimiento:
- **Features:** Escenarios en lenguaje Gherkin (Cucumber).
- **Tasks:** Representan las acciones de alto nivel que el actor realiza.
- **UserInterfaces:** Contiene los localizadores (XPaths/IDs) de los elementos web.
- **StepDefinitions:** Conecta los pasos de Gherkin con el código Java.

## 📋 Requisitos Previos
Para ejecutar este proyecto correctamente, asegúrate de tener:
1. Java JDK 11 o superior instalado.
2. Apache Maven (configurado en las variables de entorno).
3. Google Chrome instalado.

## 🚀 Instrucciones de Ejecución
Sigue estos pasos para correr las pruebas:

1.  **Clonar el repositorio:**
    git clone [URL_DE_TU_REPOSITORIO]

2.  **Importar en IntelliJ:**
    Abre el proyecto como un "Maven Project".

3.  **Ejecutar desde la terminal:**
    Abre una terminal en la raíz del proyecto y ejecuta:
    mvn clean verify

    *Nota: El comando 'verify' ejecuta los tests y genera automáticamente el reporte de Serenity.*

## 📊 Visualización de Reportes
Una vez finalizada la ejecución, Serenity genera un reporte HTML detallado (Living Documentation). Puedes encontrarlo en la siguiente ruta local:

[RAIZ_DEL_PROYECTO]/target/site/serenity/index.html

Para verlo, haz clic derecho en 'index.html' -> Open in Browser -> Chrome.

## 📂 Archivos Adicionales
Como se solicita en las instrucciones:
- Se incluye el archivo 'conclusiones.txt' con los hallazgos técnicos del ejercicio.
- El código fuente está organizado para ser fácilmente reproducible.