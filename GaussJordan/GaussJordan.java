

public class GaussJordan {

    /**
     * Resuelve el sistema aplicando el método de Gauss-Jordan mostrando los pasos clave.
     */
    public static double[] resolver(double[][] matriz) {
        int n = matriz.length;

        // Paso 0: Mostrar matriz inicial
        PresentacionResultados.mostrarMatriz(matriz, "Paso 0: Matriz Aumentada Inicial [A | b]");

        // Paso 1: Reutilización inteligente (Triangulación superior con Gauss)
        Gauss.eliminacionGaussiana(matriz);
        PresentacionResultados.mostrarMatriz(matriz, "Paso 1: Triangulación Superior (Eliminación Gaussiana)");

        // Paso 2: Normalización y barrido superior (Fase Jordan)
        for (int i = n - 1; i >= 0; i--) {
            double pivote = matriz[i][i];

            // Normalizar el renglón dividiendo entre el pivote (diagonal principal = 1)
            for (int k = i; k <= n; k++) {
                matriz[i][k] /= pivote;
            }

            // Anular los coeficientes ubicados por encima de la diagonal principal
            for (int j = i - 1; j >= 0; j--) {
                double factor = matriz[j][i];
                for (int k = i; k <= n; k++) {
                    matriz[j][k] -= factor * matriz[i][k];
                }
            }
        }

        // Mostrar matriz reducida final (Forma Escalonada Reducida / Identidad)
        PresentacionResultados.mostrarMatriz(matriz, "Paso 2: Normalización y Eliminación Superior (Matriz Identidad)");

        // Paso 3: Lectura directa de resultados
        double[] soluciones = new double[n];
        for (int i = 0; i < n; i++) {
            soluciones[i] = matriz[i][n];
        }

        return soluciones;
    }
}