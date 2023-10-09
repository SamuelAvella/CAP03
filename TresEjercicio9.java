import java.util.Scanner;
public class TresEjercicio9 {
    public static void main(String[] args) {
         Scanner s=  new Scanner(System.in);
         System.out.print("Introduzca el radio del cono en metros: ");
         Double radio = Double.parseDouble( System.console().readLine() );
         System.out.print("Introduzca la altura del cono en metros: ");
         Double altura = Double.parseDouble( System.console().readLine() );
         double volumen;
         volumen = 0.3333*3.1416*(radio*radio)*altura;
         System.out.printf("%.2f",volumen,"El volumen del cono es igual a: "+volumen);
         s.close();
    }
}
