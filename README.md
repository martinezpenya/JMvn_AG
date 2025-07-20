# Ejercicio1

Un proyecto Java sencillo que imprime `Hola Mundo!` en la consola.

## Requisitos

- Java 17 o superior
- Maven 3.6+

## Compilar

Para compilar el proyecto, ejecuta:

```sh
mvn clean compile
```

## Ejecutar

Para ejecutar el programa:

```sh
mvn exec:java -Dexec.mainClass="es.martinezpenya.Ejercicio1"
```

O, si prefieres ejecutar la clase compilada directamente:

```sh
java -cp target/classes es.martinezpenya.Ejercicio1
```

## Pruebas

Para ejecutar los tests:

```sh
mvn test
```

## Estructura del proyecto

- `src/main/java/es/martinezpenya/Ejercicio1.java` — Clase principal que imprime `Hola Mundo!`
- `src/test/java/es/martinezpenya/Ejercicio1Test.java` — Test JUnit para la clase principal

## Licencia

Este proyecto está licenciado bajo la [Licencia Creative Commons Atribución-NoComercial-CompartirIgual 4.0 Internacional (CC BY-NC-SA 4.0)](https://creativecommons.org/licenses/by-nc-sa/4.0/).
