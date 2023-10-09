public class TresEjercicio2 {
    public static void main(String[] args) {
        System.out.print("Por favor, introduzca la cantidad de euros que desee convertir a pesetas: ");
        int euros = Integer.parseInt( System.console().readLine() );
        System.out.printf("%.2f euros son %d", euros,Math.round(euros*166.386));
    }
}
