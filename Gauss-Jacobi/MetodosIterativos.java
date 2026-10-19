

public class MetodosIterativos {

    // Método de Jacobi
    public static void resolverJacobi(double[][] A, double[] b, double[] x0, double tol) {
        int n = b.length;
        double[] xOld = x0.clone();
        double[] xNew = new double[n];
        int iteracion = 0;
        double error;

        System.out.println("=== MÉTODO DE JACOBI ===");
        System.out.printf("%-10s %-12s %-12s %-12s %-12s\n", "Iteración", "x", "y", "z", "Error");
        System.out.printf("%-10d %-12.6f %-12.6f %-12.6f %-12s\n", iteracion, xOld[0], xOld[1], xOld[2], "-");

        do {
            iteracion++;
            for (int i = 0; i < n; i++) {
                double suma = 0.0;
                for (int j = 0; j < n; j++) {
                    if (i != j) {
                        suma += A[i][j] * xOld[j];
                    }
                }
                xNew[i] = (b[i] - suma) / A[i][i];
            }

            error = 0.0;
            for (int i = 0; i < n; i++) {
                double diff = Math.abs(xNew[i] - xOld[i]);
                if (diff > error) {
                    error = diff;
                }
            }

            System.out.printf("%-10d %-12.6f %-12.6f %-12.6f %-12.6f\n", iteracion, xNew[0], xNew[1], xNew[2], error);
            System.arraycopy(xNew, 0, xOld, 0, n);

        } while (error > tol && iteracion < 100);

        System.out.println();
    }

    // Método de Gauss-Seidel
    public static void resolverGaussSeidel(double[][] A, double[] b, double[] x0, double tol) {
        int n = b.length;
        double[] x = x0.clone();
        int iteracion = 0;
        double error;

        System.out.println("=== MÉTODO DE GAUSS-SEIDEL ===");
        System.out.printf("%-10s %-12s %-12s %-12s %-12s\n", "Iteración", "x", "y", "z", "Error");
        System.out.printf("%-10d %-12.6f %-12.6f %-12.6f %-12s\n", iteracion, x[0], x[1], x[2], "-");

        do {
            iteracion++;
            error = 0.0;

            for (int i = 0; i < n; i++) {
                double suma = 0.0;
                for (int j = 0; j < n; j++) {
                    if (i != j) {
                        suma += A[i][j] * x[j];
                    }
                }
                double xAnterior = x[i];
                x[i] = (b[i] - suma) / A[i][i];

                double diff = Math.abs(x[i] - xAnterior);
                if (diff > error) {
                    error = diff;
                }
            }

            System.out.printf("%-10d %-12.6f %-12.6f %-12.6f %-12.6f\n", iteracion, x[0], x[1], x[2], error);

        } while (error > tol && iteracion < 100);

        System.out.println();
    }
}