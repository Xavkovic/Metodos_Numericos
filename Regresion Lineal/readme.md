
# Regresión Lineal por Mínimos Cuadrados

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
   cd /Regresion Lineal
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
D:\Metodos_Numericos\Regresion Lineal Por Minimos Cuadrados>java Main
--- VALORES DE PRUEBA ---
X = [1.0, 2.0, 3.0, 4.0, 5.0]
Y = [2.0, 4.0, 5.0, 4.5, 6.0]

--- RESULTADOS DE MINIMOS CUADRADOS Y CORRELACION ---
Sumatorias: n=5, X= 15.0, Y= 21.5, X2= 55.0, Y2= 101.3, XY= 73.0
Pendiente (beta1): 0.8500
Ordenada al origen (beta0): 1.7500
Modelo obtenido: Y = 1.7500 + 0.8500X
Coeficiente de Pearson (r): 0.9061
Coeficiente de Determinacion (r2): 0.8210

--- PRUEBA DE PREDICCION ---
Para X = 6.0, el valor estimado de Y es: 6.8500

```

## 5. Desarrollador
**By:** Xavier Adair Gutierrez Rivera
