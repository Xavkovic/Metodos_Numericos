# Sistema Interpolacion Y Divididas Newton


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
   cd\Interpolacion Y Divididas Newton

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
========================================
     COMPARACIÓN DE MÉTODOS NUMÉRICOS
========================================
Función base: f(x) = x^2

--- 1. CONJUNTO DE NODOS (PUNTOS) ---
Punto 0 -> x = 1.0, y = 1.0
Punto 1 -> x = 2.0, y = 4.0
Punto 2 -> x = 3.0, y = 9.0

Punto de evaluación (xEval): 2.5
----------------------------------------

--> Método de Lagrange:
    El valor interpolado para x = 2.5 es: 6.25

--> Método de Newton (Diferencias Divididas):

--- TABLA DE DIFERENCIAS DIVIDIDAS ---
x_i     f[x_i]  Orden 1 Orden 2
-----------------------------------------------------
1.00    1.0000  3.0000  1.0000
2.00    4.0000  5.0000
3.00    9.0000

[Matriz bidimensional interna (double[][])]:
[1.0, 3.0, 1.0]
[4.0, 5.0, 0.0]
[9.0, 0.0, 0.0]

    El valor interpolado para x = 2.5 es: 6.25

========================================
```
```text
By: Xavier Adair Gutierrez Rivera
```
