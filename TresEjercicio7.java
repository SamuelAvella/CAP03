import java.util.Scanner;
public class TresEjercicio7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double iva, total;
        System.out.print("Por favor, indique el valor de la base imponible de su producto: ");
        double base = Double.parseDouble( System.console().readLine() );
        iva= base*0.21;
        total = base+iva;
        System.out.printf("%-14s\t%5.2f%n", "Base imponible",base);
        System.out.printf("%-14s\t%5.2f%n", "IVA",iva);
        System.out.printf("---------------------%n");
        System.out.printf("%14s\t%5.2f%n", "Total",total);
        s.close();
    }
}
