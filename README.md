Analizador de lenguaje de juego con ANTLR4

Descripción
Este proyecto implementa un analizador léxico, sintáctico e intérprete para un lenguaje de definición de juegos, utilizando ANTLR4 y JavaScript.

El lenguaje permite definir juegos con escenas y acciones como mostrar mensajes.

Instalación
1. Clonar el repositorio
2. Para Ejecutar, hay dos opciones, la primera:

npm install

Ejecución

npm start

En el llegado caso de que le de error, o no logre ejecutarlo corrextamente a causa de que se cree una carpeta demas luego de haberse clonado el repositorio, entonces puede probar con:

cd 53446-recuperatorio-main

Luego, seguir con npm start

El programa lee el archivo input.txt y procesa su contenido.

Funcionalidades

- Análisis léxico (tabla de tokens)
- Análisis sintáctico
- Detección de errores
- Generación de árbol de derivación
- Interpretación del lenguaje (visitor)

