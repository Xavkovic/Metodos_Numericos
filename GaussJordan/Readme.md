# Sistema de Resolución de Ecuaciones Lineales (Método de Gauss-Jordan)

## 1. Lenguaje de Programación Utilizado
* **Java** (Es obligatorio **tener instalado el Java JDK** en tu equipo para poder compilar y ejecutar el programa).

## 2. Requisitos Previos
Asegúrate de tener instalado el Java JDK. Puedes verificarlo abriendo una terminal (CMD o PowerShell) y ejecutando:
```bash
java -version
```

## 3. Pasos para Compilar y Ejecutar
Sigue estos pasos en la terminal:

1. Ubícate dentro de la carpeta que contiene los archivos fuente:
   ```bash
   cd GaussJordan
   ```
2. Compila todos los archivos del proyecto:
   ```bash
   javac *.java
   ```
3. Ejecuta el programa principal con su respectivo paquete:
   ```bash
   java Lanzador_gaussjordan
   ```

## 4. Ejemplo de Prueba y Salida por Consola
Al ejecutar el programa, obtendrás la siguiente salida:
```text
-----------------------------------------
 Paso 0: Matriz Aumentada Inicial [A | b]
-----------------------------------------
[    3.000   -0.100   -0.200 |   16.700 ]
[    0.100    7.000   -0.300 |   48.700 ]
[    0.300   -0.200   10.000 |   30.400 ]

-----------------------------------------
 Paso 1: Triangulación Superior (Eliminación Gaussiana)
-----------------------------------------
[    3.000   -0.100   -0.200 |   16.700 ]
[    0.000    7.003   -0.293 |   48.143 ]
[    0.000    0.000   10.012 |   30.036 ]

-----------------------------------------
 Paso 2: Normalización y Eliminación Superior (Matriz Identidad)
-----------------------------------------
[    1.000    0.000    0.000 |    6.000 ]
[    0.000    1.000    0.000 |    7.000 ]
[    0.000    0.000    1.000 |    3.000 ]
Soluciones del sistema (Gauss-Jordan):
x1 = 6.0
x2 = 7.000000000000002
x3 = 3.0000000000000004
```
```text
By: Xavier Adair Gutierrez Rivera
```
