public class TresEjercicio4 {
    public static void main(String[] args) {
        System.out.print("Por favor, dime un primer número: ");
        double num1 = Double.parseDouble( System.console().readLine() );
        System.out.print("Por favor, dime un segundo número: ");
        double num2 = Double.parseDouble( System.console().readLine() );
        System.out.printf("x = %.1f\n", num1);
        System.out.printf("y = %.1f\n", num2);
        System.out.printf("x + y = %.1f\n", num1+num2);
        System.out.printf("x - y = %.2f\n", num1-num2);
        System.out.printf("x * y = %.2f\n", num1*num2);
        System.out.printf("x / y = %.5f\n", num1/num2);        
    }
}
