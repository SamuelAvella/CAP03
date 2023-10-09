public class TresEjercicio1 {
    public static void main(String[] args) {
        System.out.print("Por favor, dime un primer número: ");
        int num1 = Integer.parseInt( System.console().readLine() );
        System.out.print("Por favor, dime un segundo número: ");
        int num2 = Integer.parseInt( System.console().readLine() );
        System.out.print("La multiplicación de "+num1+" * "+num2+" = "+(num1*num2));
    }
}
