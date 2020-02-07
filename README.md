# Laboratorio 3

Implementación de los retos 1 y 2, servidores de HTTP.

## Links directos a cada repositorio: 

[Reto 1](https://github.com/svega99/AREPLAB3RETO1)

[Reto 2](https://github.com/svega99/AREPLAB3RETO2)

## Empezando

Para ver los programas en la web solo es necesario abrir heroku, si se desea ver el codigo fuente o correrlo desde el local sere necesario tener git y heroku en su computador.

### Prerrequisitos


#### Git
Para descargar el programa se necesita git, para comprobar si esta instalado desde la linea de comandos:

```
> git --version

git version 2.21.0.windows.1
```

#### Heroku
La pagina web esta alojada en heroku, para comprobar si esta instalado desde la linea de comandos:

```
> heroku -v

heroku/7.37.0 win32-x64 node-v12.13.0

```

### Instalación

Para instalar el repositorio con los calentamientos se instala en la ruta deseada desde git de esta forma

```
> git clone https://github.com/svega99/AREPLAB3.git

```

 Para instalar el repositorio con el reto numero 1:
 
 ```
> git clone https://github.com/svega99/AREPLAB3RETO1.git

```

 Para instalar el repositorio con el reto numero 2:

```
> git clone https://github.com/svega99/AREPLAB3RETO2.git

```


Para compilar desde maven:

```
> mvn package
```
 
## Ejecutando el programa

Link a heroku del reto 1: 
[![Heroku](https://camo.githubusercontent.com/be46aee4f8d55e322c3e7db60ea23a4deb5427c9/68747470733a2f2f6865726f6b752d62616467652e6865726f6b756170702e636f6d2f3f6170703d6865726f6b752d6261646765)](https://aqueous-island-76236.herokuapp.com/index.html)

En el reto 1 a parte de la ruta principal index.html, se encuentran otros archivos que también pueden ser cargados como /file.html, /labinformatica.png y /logo.jpg.


Link a heroku del reto 2: 
[![Heroku](https://camo.githubusercontent.com/be46aee4f8d55e322c3e7db60ea23a4deb5427c9/68747470733a2f2f6865726f6b752d62616467652e6865726f6b756170702e636f6d2f3f6170703d6865726f6b752d6261646765)](https://still-woodland-01460.herokuapp.com/)


Si quiere ejecutar cualquier programa desde local se puede poner en la linea de comandos desde la ruta del proyecto:

```
> mvn clean install
...
> heroku local web

```


## Corriendo los tests

Para correr los tests:

```
> mvn test
...
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running edu.escuelaing.app.CalculatorTest
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.048 s - in edu.escuelaing.app.CalculatorTest
[INFO] Running edu.escuelaing.app.LinkedListTest
[INFO] Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0 s - in edu.escuelaing.app.LinkedListTest
[INFO]
[INFO] Results:
[INFO]
[INFO] Tests run: 6, Failures: 0, Errors: 0, Skipped: 0
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  7.922 s
[INFO] Finished at: 2020-01-30T10:49:33-05:00
[INFO] ------------------------------------------------------------------------
```

El programa usa dos clases de test. ```LinkedListTest``` prueba el funcionamiento de la LinkedList y ```CalculatorTest``` prueba que la media y la desviación estandar se calculen de la forma adecuada.

## Diseño

[DISEÑO.pdf](DISEÑO.pdf)

## Authors

* **Santiago Vega Romero**  - [svega99](https://github.com/svega99)

## License

This project is licensed under the GNU General Public License v3.0 - see the [LICENSE](LICENSE) file for details
