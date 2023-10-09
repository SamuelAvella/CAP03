import java.util.Scanner;
public class TresEjercicio6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Por favor, dime la base del triángulo en metros: ");
        double base = Double.parseDouble( System.console().readLine() );
        System.out.print("Por favor, dime la altura del triángulo en metros: ");
        double altura = Double.parseDouble( System.console().readLine() );
        System.out.printf("El area del triángulo es igual a: %2.f m2",(base*altura)/2);
        s.close();
    }
}
