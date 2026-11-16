
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] x = {1.0, 2.0, 3.0, 4.0, 5.0};
        double[] y = {2.0, 4.0, 5.0, 4.5, 6.0};

        System.out.println("--- VALORES DE PRUEBA ---");
        System.out.println("X = " + Arrays.toString(x));
        System.out.println("Y = " + Arrays.toString(y));
        System.out.println();

        double[] resultados = RegresionLineal.calcularMinimosCuadrados(x, y);

        double beta0 = resultados[0];
        double beta1 = resultados[1];

        double xTest = 6.0;
        double prediccion = RegresionLineal.predecir(beta0, beta1, xTest);

        System.out.println("\n--- PRUEBA DE PREDICCION ---");
        System.out.printf("Para X = %.1f, el valor estimado de Y es: %.4f%n", xTest, prediccion);
    }
}