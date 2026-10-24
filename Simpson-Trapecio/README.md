#     MÉTODO DE INTEGRACIÓN NUMÉRICA (Simpson 1/3 Trapecio Compuesto)

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
   cd /Simpson-Trapecio
   ```
2. Compila todos los archivos del proyecto:
   ```bash
   javac *.java
   ```
3. Ejecuta el programa principal con su respectivo paquete:
   ```bash
   java MainTrap
   ```

## 4. Ejemplo de Prueba y Salida por Consola
Al ejecutar el programa, obtendrás la siguiente salida:
```text
          MÉTODO DE INTEGRACIÓN NUMÉRICA
                   MÉTODO DE TRAPECIO COMPUESTO
Iteración  | Subintervalos (n) | Integral                  | Error Absoluto
1          | 2            | 3.000000000000000         | ---
2          | 4            | 2.750000000000000         | 0.250000000000000
3          | 8            | 2.687500000000000         | 0.062500000000000
4          | 16           | 2.671875000000000         | 0.015625000000000
5          | 32           | 2.667968750000000         | 0.003906250000000
6          | 64           | 2.666992187500000         | 0.000976562500000
7          | 128          | 2.666748046875000         | 0.000244140625000
8          | 256          | 2.666687011718750         | 0.000061035156250

>>> Resultado final (Trapecio Compuesto): 2.66668701171875
                   MÉTODO DE SIMPSON 1/3 COMPUESTO
Iteración  | Subintervalos (n) | Integral                  | Error Absoluto
1          | 2            | 2.666666666666667         | ---
2          | 4            | 2.666666666666667         | 0.000000000000000

>>> Resultado final (Simpson 1/3 Compuesto): 2.6666666666666665
```

## 5. Desarrollador
**By:** Xavier Adair Gutierrez Rivera
