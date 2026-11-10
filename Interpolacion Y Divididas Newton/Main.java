import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Datos de prueba: Puntos correspondientes a la función f(x) = x^2
        double[] x = {1.0, 2.0, 3.0};
        double[] y = {1.0, 4.0, 9.0};

        // Punto a evaluar
        double xEval = 2.5;

        System.out.println("========================================");
        System.out.println("     COMPARACIÓN DE MÉTODOS NUMÉRICOS    ");
        System.out.println("========================================");
        System.out.println("Función base: f(x) = x^2");

        // 1. Imprimir el conjunto de nodos
        System.out.println("\n--- 1. CONJUNTO DE NODOS (PUNTOS) ---");
        for (int i = 0; i < x.length; i++) {
            System.out.printf("Punto %d -> x = %.1f, y = %.1f\n", i, x[i], y[i]);
        }

        System.out.println("\nPunto de evaluación (xEval): " + xEval);
        System.out.println("----------------------------------------\n");

        // --- 2. Ejecución Interpolación de Lagrange ---
        try {
            double resultadoLagrange = InterpolacionLagrange.interpolacionLagrange(x, y, xEval);
            System.out.println("--> Método de Lagrange:");
            System.out.println("    El valor interpolado para x = " + xEval + " es: " + resultadoLagrange);
        } catch (IllegalArgumentException e) {
            System.err.println("Error en Lagrange: " + e.getMessage());
        }

        System.out.println();

        // --- 3. Ejecución Interpolación de Newton y Matriz de Diferencias ---
        try {
            // Calcula la matriz de diferencias divididas
            double[][] tablaNewton = InterpolacionNewton.calcularDiferenciasDivididas(x, y);

            System.out.println("--> Método de Newton (Diferencias Divididas):");

            // Imprime la matriz en formato tabla estructurada
            InterpolacionNewton.imprimirTabla(x, tablaNewton);

            // Opcional: Imprimir la matriz 2D en crudo (raw matrix)
            System.out.println("\n[Matriz bidimensional interna (double[][])]:");
            for (double[] fila : tablaNewton) {
                System.out.println(Arrays.toString(fila));
            }

            // Evalúa el polinomio de Newton
            double resultadoNewton = InterpolacionNewton.evaluarPolinomio(x, tablaNewton, xEval);
            System.out.println("\n    El valor interpolado para x = " + xEval + " es: " + resultadoNewton);
        } catch (IllegalArgumentException e) {
            System.err.println("Error en Newton: " + e.getMessage());
        }

        System.out.println("\n========================================");
    }
}