
public class SimpsonCompuesto {

    private static double calcularSimpson(double a, double b, int n) {
        double h = TrapecioCompuesto.calcularH(a, b, n);
        double sumaImpares = 0.0;
        double sumaPares = 0.0;

        for (int k = 1; k < n; k++) {
            double xk = a + k * h;
            // Evaluamos si el índice k es impar o par
            if (k % 2 != 0) {
                sumaImpares += TrapecioCompuesto.funcion(xk);
            } else {
                sumaPares += TrapecioCompuesto.funcion(xk);
            }
        }

        double sumaTotal = TrapecioCompuesto.funcion(a) + 4 * sumaImpares
                + 2 * sumaPares + TrapecioCompuesto.funcion(b);
        return (h / 3) * sumaTotal;
    }

    public static double integrarConTolerancia(double a, double b, double tolerancia) {
        int n = 2;
        int iteracion = 1;
        double integralAnterior = calcularSimpson(a, b, n);
        double errorAbsoluto = 999.0;
        System.out.println("                   MÉTODO DE SIMPSON 1/3 COMPUESTO                        ");
        System.out.printf("%-10s | %-12s | %-25s | %-15s%n", "Iteración", "Subintervalos (n)", "Integral", "Error Absoluto");
        System.out.printf("%-10d | %-12d | %-25.15f | %-15s%n", iteracion, n, integralAnterior, "---");

        while (errorAbsoluto > tolerancia) {
            iteracion++;
            n *= 2;
            double integralNueva = calcularSimpson(a, b, n);
            errorAbsoluto = Math.abs(integralNueva - integralAnterior);

            System.out.printf("%-10d | %-12d | %-25.15f | %-15.15f%n", iteracion, n, integralNueva, errorAbsoluto);

            integralAnterior = integralNueva;
        }
        return integralAnterior;
    }
}