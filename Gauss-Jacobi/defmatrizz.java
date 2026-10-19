

public class defmatrizz {

    // Matriz aumentada combinada (A | b) basada en tu ejemplo original adaptada al sistema actual
    public static double[][] defmatriz() {
        return new double[][] {
                { 5.0, 1.0, 1.0, 7.0 },
                { 1.0, 4.0, 1.0, 6.0 },
                { 1.0, 2.0, 5.0, 8.0 }
        };
    }

    // Extrae la matriz de coeficientes A
    public static double[][] getMatrizA() {
        double[][] matrizCompleta = defmatriz();
        double[][] A = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                A[i][j] = matrizCompleta[i][j];
            }
        }
        return A;
    }

    // Extrae el vector independiente b
    public static double[] getVectorB() {
        double[][] matrizCompleta = defmatriz();
        double[] b = new double[3];
        for (int i = 0; i < 3; i++) {
            b[i] = matrizCompleta[i][3];
        }
        return b;
    }

    // Vector de aproximación inicial X(0) = [0, 0, 0]^T
    public static double[] getVectorInicial() {
        return new double[] { 0.0, 0.0, 0.0 };
    }

    // Tolerancia de error establecida ε = 0.0001
    public static double getTolerancia() {
        return 0.0001;
    }
}