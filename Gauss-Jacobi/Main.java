
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Obtenemos los componentes utilizando la clase base defmatrizz
        double[][] A = defmatrizz.getMatrizA();
        double[] b = defmatrizz.getVectorB();
        double[] x0 = defmatrizz.getVectorInicial();
        double tolerancia = defmatrizz.getTolerancia();

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("   SELECCIONE EL MÉTODO DE RESOLUCIÓN     ");
            System.out.println("1. Método de Jacobi");
            System.out.println("2. Método de Gauss-Seidel");
            System.out.println("3. Salir");
            System.out.print("Ingrese una opción (1-3): ");

            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                System.out.println();

                switch (opcion) {
                    case 1:
                        MetodosIterativos.resolverJacobi(A, b, x0, tolerancia);
                        break;
                    case 2:
                        MetodosIterativos.resolverGaussSeidel(A, b, x0, tolerancia);
                        break;
                    case 3:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción no válida. Por favor, intente de nuevo.\n");
                        break;
                }
            } else {
                System.out.println("Entrada inválida. Debe ingresar un número entero.\n");
                scanner.next(); // Limpiar entrada inválida
                opcion = 0;
            }

        } while (opcion != 3);

        scanner.close();
    }
}