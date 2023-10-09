import java.util.Scanner;
public class TresEjercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la cantidad de megabytes(Mb) que quieras convertir a kilobytes(Kb): ");
        int Mb = Integer.parseInt(System.console().readLine());
        int conversor;
        conversor = Mb*1000;
        System.out.print(Mb+"Mb equivalen a "+conversor+"Kb");
        sc.close();
    }
}
