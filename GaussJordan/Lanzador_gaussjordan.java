
public class Lanzador_gaussjordan {
    public static void main(String[] args) {
        // 1. Mandamos llamar a la función que nos entrega la matriz aumentada [A | b]
        double[][] matriz = defmatrizz.defmatriz();

        // 2. Aplicar el método de Gauss-Jordan (reutiliza Gauss, normaliza y resuelve)
        double[] soluciones = GaussJordan.resolver(matriz);

        // 3. Imprimir resultados finales en consola de manera limpia
        System.out.println("Soluciones del sistema (Gauss-Jordan):");
        for (int i = 0; i < soluciones.length; i++) {
            System.out.println("x" + (i + 1) + " = " + soluciones[i]);
        }
    }
}