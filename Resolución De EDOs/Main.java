
public class Main {

    public static void main(String[] args) {
        double[] tamañosPaso = {0.1, 0.05, 0.01};

        System.out.println("********************************************************************");
        System.out.println("             ANÁLISIS EXPERIMENTAL DE REFINAMIENTO DE MALLA         ");
        System.out.println("********************************************************************\n");

        for (double h : tamañosPaso) {
            MetodoEuler.ejecutar(h);
        }

        System.out.println("********************************************************************\n");

        for (double h : tamañosPaso) {
            MetodoRungeKutta.ejecutar(h);
        }
    }
}