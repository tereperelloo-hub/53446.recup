Analizador de lenguaje de juego con ANTLR4

Descripción
Este proyecto implementa un analizador léxico, sintáctico e intérprete para un lenguaje de definición de juegos, utilizando ANTLR4 y JavaScript.

El lenguaje permite definir juegos con escenas y acciones como mostrar mensajes.

Instalación
1. Clonar el repositorio
git clone https://github.com/tereperelloo-hub/53446.recup.git

2. Para Ejecutar, hay dos opciones, la primera:

npm install

Ejecución

npm start

En el llegado caso de que le de error, o no logre ejecutarlo correctamente, una causa puede ser que se cree una carpeta demas, luego de haberse clonado el repositorio, entonces puede probar con:

cd 53446.recup

Luego, seguir con npm start

En algunos casos, al descargar el proyecto como archivo ZIP, puede generarse una carpeta adicional (por ejemplo 53446.recup-main).

En ese caso, asegurarse de ubicarse en la carpeta donde se encuentra el archivo package.json antes de ejecutar los comandos.

Para verificarlo, se puede usar:

dir

Si aparece package.json, entonces estás en la carpeta correcta.

El programa lee el archivo input.txt y procesa su contenido.

Funcionalidades

- Análisis léxico (tabla de tokens)
- Análisis sintáctico
- Detección de errores
- Generación de árbol de derivación
- Interpretación del lenguaje (visitor)

