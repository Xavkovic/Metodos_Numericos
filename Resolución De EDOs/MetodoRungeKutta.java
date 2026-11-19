public class MetodoRungeKutta {

    public static double evaluarFuncion(double x, double y) {
        // Implementación de f(x, y) = x + y
        return x + y;
    }

    public static double solucionExacta(double x) {
        // Solución analítica para y' = x + y, y(0) = 1
        return 2.0 * Math.exp(x) - x - 1.0;
    }

    public static void ejecutar(double h) {
        double x0 = 0.0;
        double y0 = 1.0;
        double xFinal = 0.3;

        int nPasos = (int) Math.round((xFinal - x0) / h);
        double x = x0;
        double y = y0;

        System.out.println("=== MÉTODO DE RUNGE-KUTTA RK4 (h = " + h + ") | f(x,y) = x + y ===");
        System.out.println("n\t x_n\t\t y_n (RK4)\t y_exacta\t Error Abs.");
        System.out.println("--------------------------------------------------------------------");
        System.out.printf("%d\t %.4f\t\t %.6f\t %.6f\t %.6f\n", 0, x, y, solucionExacta(x), 0.0);

        for (int i = 0; i < nPasos; i++) {
            double k1 = evaluarFuncion(x, y);
            double k2 = evaluarFuncion(x + 0.5 * h, y + 0.5 * h * k1);
            double k3 = evaluarFuncion(x + 0.5 * h, y + 0.5 * h * k2);
            double k4 = evaluarFuncion(x + h, y + h * k3);

            y = y + (h / 6.0) * (k1 + 2.0 * k2 + 2.0 * k3 + k4);
            x = x + h;

            double exacta = solucionExacta(x);
            double errorAbs = Math.abs(exacta - y);

            System.out.printf("%d\t %.4f\t\t %.6f\t %.6f\t %.6f\n", (i + 1), x, y, exacta, errorAbs);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ejecutar(0.1);
    }
}