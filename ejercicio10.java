import java.util.Scanner;
public class ejercicio10 {
    public static void main(String[]arg) {
        int nota1;
        int nota2;
        int nota3;
        int nota4;
        int nota5;

        System.out.print("Ingresa la nota 1: ");
        Scanner numl = new Scanner(System.in);
        nota1 = numl.nextInt();
        System.out.print("Ingresa la nota 2: ");
        Scanner num2 = new Scanner(System.in);
        nota2 = num2.nextInt();
        System.out.print("Ingresa la nota 3: ");
        Scanner num3 = new Scanner(System.in);
        nota3 = num3.nextInt();
        System.out.print("Ingresa la nota 4: ");
        Scanner num4 = new Scanner(System.in);
        nota4 = num4.nextInt();
        System.out.print("Ingresa la nota 5: ");
        Scanner num5 = new Scanner(System.in);
        nota5 = num5.nextInt();
        int prom = (nota1 + nota2 + nota3 + nota4 + nota5) / 5;
        System.out.println("El promedio de las notas es: " + prom);  
      }
    
} //GAGO RAMOS EDUARDO JESÚS
