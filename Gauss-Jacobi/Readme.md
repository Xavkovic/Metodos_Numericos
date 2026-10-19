# Sistema de Resolución de Ecuaciones Lineales (Método de Gauss Siedel-Jacobi)

## 1. Lenguaje de Programación Utilizado
- **Java** (Es obligatorio **tener instalado el Java JDK** en tu equipo para poder compilar y ejecutar el programa).

## 2. Requisitos Previos
Asegúrate de tener instalado el Java JDK. Puedes verificarlo abriendo una terminal (CMD o PowerShell) y ejecutando:
```bash
java -version
```

## 3. Pasos para Compilar y Ejecutar
Sigue estos pasos en la terminal:

1. Ubícate dentro de la carpeta que contiene los archivos fuente:
   ```bash
   cd /Gauss-Jacobi
   ```
2. Compila todos los archivos del proyecto:
   ```bash
   javac *.java
   ```
3. Ejecuta el programa principal con su respectivo paquete:
   ```bash
   java Main
   ```

## 4. Ejemplo de Prueba y Salida por Consola
Al ejecutar el programa, obtendrás la siguiente salida:
```text
  SELECCIONE EL MÉTODO DE RESOLUCIÓN
1. Método de Jacobi
2. Método de Gauss-Seidel
3. Salir
Ingrese una opción (1-3): 1

=== MÉTODO DE JACOBI ===
Iteración  x            y            z            Error
0          0.000000     0.000000     0.000000     -
1          1.400000     1.500000     1.600000     1.600000
2          0.780000     0.750000     0.720000     0.880000
3          1.106000     1.125000     1.144000     0.424000
4          0.946200     0.937500     0.928800     0.215200
5          1.026740     1.031250     1.035760     0.106960
6          0.986598     0.984375     0.982152     0.053608
7          1.006695     1.007813     1.008930     0.026778
8          0.996651     0.996094     0.995536     0.013394
9          1.001674     1.001953     1.002232     0.006696
10         0.999163     0.999023     0.998884     0.003348
11         1.000419     1.000488     1.000558     0.001674
12         0.999791     0.999756     0.999721     0.000837
13         1.000105     1.000122     1.000140     0.000419
14         0.999948     0.999939     0.999930     0.000209
15         1.000026     1.000031     1.000035     0.000105
16         0.999987     0.999985     0.999983     0.000052

   SELECCIONE EL MÉTODO DE RESOLUCIÓN
1. Método de Jacobi
2. Método de Gauss-Seidel
3. Salir
Ingrese una opción (1-3): 2

=== MÉTODO DE GAUSS-SEIDEL ===
Iteración  x            y            z            Error
0          0.000000     0.000000     0.000000     -
1          1.400000     1.150000     0.860000     1.400000
2          0.998000     1.035500     0.986200     0.402000
3          0.995660     1.004535     0.999054     0.030965
4          0.999282     1.000416     0.999977     0.004119
5          0.999921     1.000025     1.000006     0.000639
6          0.999994     1.000000     1.000001     0.000072

   SELECCIONE EL MÉTODO DE RESOLUCIÓN
1. Método de Jacobi
2. Método de Gauss-Seidel
3. Salir
```

## 5. Desarrollador
**By:** Xavier Adair Gutierrez Rivera
