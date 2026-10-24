public class MainTrap {
    public static void main(String[] args) {
        double a = 0.0;
        double b = 2.0;
        double tolerancia = 0.0001;

        System.out.println("          MÉTODO DE INTEGRACIÓN NUMÉRICA          ");

        // 1. Ejecución del método de Trapecio Compuesto
        double resultadoTrapecio = TrapecioCompuesto.integrarConTolerancia(a, b, tolerancia);
        System.out.println("\n>>> Resultado final (Trapecio Compuesto): " + resultadoTrapecio);


        // 2. Ejecución del método de Simpson 1/3 Compuesto
        double resultadoSimpson = SimpsonCompuesto.integrarConTolerancia(a, b, tolerancia);
        System.out.println("\n>>> Resultado final (Simpson 1/3 Compuesto): " + resultadoSimpson);
    }
}