
public class PresentacionResultados {

    /**
     * Muestra el estado actual de la matriz aumentada [A | b] en consola.
     */
    public static void mostrarMatriz(double[][] matriz, String mensaje) {
        System.out.println("\n-----------------------------------------");
        System.out.println(" " + mensaje);
        System.out.println("-----------------------------------------");
        int n = matriz.length;
        for (int i = 0; i < n; i++) {
            System.out.print("[ ");
            for (int j = 0; j <= n; j++) {
                System.out.printf("%8.3f ", matriz[i][j]);
                if (j == n - 1) System.out.print("| ");
            }
            System.out.println("]");
        }
    }

    /**
     * Muestra las soluciones finales del sistema.
     */
    public static void mostrarResultados(double[] soluciones) {
        System.out.println("\n=========================================");
        System.out.println(" Soluciones Finales del Sistema");
        System.out.println("=========================================");
        for (int i = 0; i < soluciones.length; i++) {
            System.out.println("x" + (i + 1) + " = " + soluciones[i]);
        }
        System.out.println("=========================================");
    }
}