# Programacion\_III\_Tarea3



\# Programación III – Tarea 3

\## Implementación de Pila y Ofuscación con ProGuard



Autor: Mario David Tereta Sapalun

0905-15-14297

Curso: Programación III

Semestre: 5to



---



\## Estructura del Proyecto



El proyecto está dividido en dos módulos Maven:



\- stack → Librería que contiene la implementación propia de la estructura de datos Pila.

\- stackHandler → Aplicación principal que utiliza la librería `stack` y aplica ofuscación con ProGuard.



Ambos proyectos se compilan completamente desde consola utilizando Maven.



---



\## Requisitos



\- JDK 8 o superior

\- Maven instalado

\- Consola (CMD o PowerShell)

\- JD-GUI para poder ver código ofuscado



para Ofuscación se uso ProGuard, ya que había intentado con YGuard con el primer proyecto, pero no funciono, opte este desde un principio.



Verificar instalación:



java -version

mvn -version



---



\## Paso 1 – Compilar la librería umg.edu.gt.data-structure.stack



Desde la raíz del proyecto, entrar a la carpeta del módulo:



cd umg.edu.gt.data-structure.stack



Compilar e instalar la librería en el repositorio local de Maven:



mvn clean install



Esto genera:



target/stack-1.0.0.jar



Y lo instala en el repositorio local para que `stackHandler` pueda utilizarlo.

---



\## Paso 2 – Compilar stackHandler (SIN ofuscación)



Entrar a la carpeta:



cd stackHandler

mvn clean package



Esto genera:



target/stackHandler-1.0.0.jar



---



\## ▶ Ejecutar versión NO ofuscada



Desde la carpeta stackHandler:



java -jar target/stackHandler-1.0.0.jar



Salida esperada:



(a+b) \* \[c-d] -> true

(\[)] -> false



---



\## Paso 3 – Generar versión OFUSCADA



Desde la carpeta stackHandler:



mvn clean package -P obfuscate



Esto genera:



target/stackHandler-1.0.0-obf.jar



---



\## ▶ Ejecutar versión OFUSCADA



Debido a la verificación estricta de bytecode en versiones modernas de Java, el JAR ofuscado se ejecuta con:



java -noverify -jar target/stackHandler-1.0.0-obf.jar "(a+b)"



Salida esperada:



(a+b) \* \[c-d] -> true

(\[)] -> false



---



\## Confirmación



\- Ambos proyectos compilan desde consola.

\- El JAR normal se ejecuta con `java -jar`.

\- El JAR ofuscado se ejecuta con `java -noverify -jar`.

\- La funcionalidad del programa se mantiene después de la ofuscación.



\## Confirmación

Breve análisis escrito explicando:



¿Qué tanto se dificulta la lectura? // La lectura aunque conserva mucha de su sintaxis original, hace que a simple vista al abrir no se entienda.



¿Se pierde claridad estructural? // La estructura por lo general sigue igual, no hay mucho cambio en ello.



¿Sigue siendo posible entender la lógica? // Para entender la lógica, si se tiene que leer el código original, porque al verso sin saber de que se trata, no se entiende de que va el código, aunque a simple vista tena un estructura clara.

