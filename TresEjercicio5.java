import java.util.Scanner;
public class TresEjercicio5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Por favor, dime la base del rectángulo en metros: ");
        double base = Double.parseDouble( System.console().readLine() );
        System.out.print("Por favor, dime la altura del rectángulo en metros: ");
        double altura = Double.parseDouble( System.console().readLine() );
        double area;
        area = base*altura;
        System.out.printf("El area del rectángulo es igual a: %.2f m2",area);
        s.close();
    }
}
