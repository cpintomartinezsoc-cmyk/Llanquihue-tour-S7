<img width="488" height="157" alt="image" src="https://github.com/user-attachments/assets/f80ca68b-059b-4ed7-8500-7e1562cc24f6" /><br><br><br><br>





🧠 Actividad Formativa Semana 6 – Creando Jerarquías de Clases con Herencia Simple
👤 

Nombre completo: Camilo Pinto

Carrera: Analista Programador

Asignatura: Desarrollo Orientado a Objetos I

Caso: Llanquihue Tour<br><br><br><br>








📘 Descripción general del sistema

Este proyecto corresponde a la actividad formativa de la Semana 7 de la asignatura Desarrollo Orientado a Objetos I.

La aplicación continúa el desarrollo del sistema de gestión de la agencia Llanquihue Tour, incorporando los conceptos de polimorfismo, herencia simple y colecciones genéricas mediante una jerarquía de clases que representa distintos servicios turísticos.

El sistema permite almacenar diferentes tipos de servicios turísticos dentro de una misma colección, recorrerlos dinámicamente y mostrar su información utilizando referencias de la superclase, demostrando el comportamiento polimórfico de la Programación Orientada a Objetos.








🧱 Estructura del proyecto

src/

│

├── model/

│   ├── ServicioTuristico.java

│   ├── RutaGastronomica.java

│   ├── PaseoLacustre.java

│   └── ExcursionCultural.java

│

├── data/

│   └── GestorServicios.java

│

└── ui/

    └── Main.java







📂 Descripción de las clases<br><br>







ServicioTuristico

Clase base del sistema que representa un servicio turístico.

Atributos

nombre

duracionHoras

Métodos implementados

Constructor

mostrarInformacion()

Getters y Setters

toString()

Esta clase sirve como base para todas las categorías de servicios turísticos.<br><br><br><br>











RutaGastronomica

Hereda de ServicioTuristico.

Atributo adicional

numeroDeParadas

Sobrescribe el método mostrarInformacion() para mostrar la información general del servicio junto con la cantidad de paradas gastronómicas.<br><br><br><br>










PaseoLacustre

Hereda de ServicioTuristico.

Atributo adicional

tipoEmbarcacion

Sobrescribe mostrarInformacion() incorporando el tipo de embarcación utilizada durante el recorrido.<br><br><br><br>











ExcursionCultural

Hereda de ServicioTuristico.

Atributo adicional

lugarHistorico

Especializa la información del servicio indicando el lugar histórico que forma parte de la excursión.<br><br><br><br>












GestorServicios

Clase encargada de administrar los servicios turísticos.

Sus funciones principales son:

Crear una colección List<ServicioTuristico>.

Agregar servicios turísticos de distintas categorías.

Retornar la colección para ser utilizada desde la clase principal.

La colección incluye ejemplos inspirados en atractivos turísticos de la Región de Los Lagos, como rutas gastronómicas, paseos lacustres y excursiones culturales.<br><br><br><br>












Main

Clase principal del proyecto.

Su función consiste en:

Crear una instancia de GestorServicios.

Obtener la colección de servicios turísticos.

Recorrer la lista utilizando un ciclo for-each.

Mostrar la información de cada objeto mediante el método mostrarInformacion().

Gracias al polimorfismo, cada objeto ejecuta automáticamente la versión correspondiente de dicho método según su tipo.<br><br><br><br>













▶️ Instrucciones para ejecutar el proyecto<br><br>






1.Clonar el repositorio desde GitHub.

2.git clone https://https://github.com/cpintomartinezsoc-cmyk/Llanquihue-tour-S7.git

3.Abrir el proyecto en IntelliJ IDEA.

4.Verificar que todas las clases se encuentren organizadas en los paquetes correspondientes.

5.Ejecutar la clase:

6.ui/Main.java

7.Observar en la consola la información correspondiente a todos los servicios turísticos creados.<br><br><br><br>













🧪 Prueba realizada

Repositorio GitHub: https://github.com/cpintomartinezsoc-cmyk/Llanquihue-tour-S7.git

Fecha de entrega: [06/07/2026]

