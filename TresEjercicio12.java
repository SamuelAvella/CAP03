import java.util.Scanner;
public class TresEjercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la nota del primer examen: ");
        double primero = Double.parseDouble(System.console().readLine());
        System.out.print("¿Qué nota quieres sacar en el trimestre? ");
        double Final = Double.parseDouble(System.console().readLine());
        double segundo = ((Final * 100) - (primero * 40)) / 60;
        System.out.printf("Para tener un %.2f en el trimestre necesitas sacar un %d\n en el segundo examen.",Final,(int)Math.round(segundo));
        sc.close();
    }
}
