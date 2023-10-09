public class TresEjercicio3 {
    public static void main(String[] args) {
        System.out.print("Por favor, introduzca la cantidad de pesetas que desee convertir a euros: ");
        int pesetas = Integer.parseInt( System.console().readLine() );
        System.out.printf("%d pesetas son %.2f euros", pesetas,pesetas*0.006);
    }
}
