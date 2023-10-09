import java.util.Scanner;
public class TresEjercicio8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Por favor introduzca cuantas horas semanales trabaja: ");
        int horas = s.nextInt();
        int salario;
        salario = horas*12;
        System.out.print("Su salario semanala, en base a las horas trabajadas, es igual a: "+salario+" euros");
        s.close();
    }
}
