import java.util.Scanner;
public class Tresejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la cantidad de megabytes(Mb) que quieras convertir a kilobytes(Kb): ");
        double Kb = Double.parseDouble(System.console().readLine());
        System.out.print(Kb+"Mb equivalen a "+(Kb/1000)+"Kb");
        sc.close();
    }
}
