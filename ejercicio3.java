import java.util.Scanner;
public class ejercicio3 {
    public static void main(String[]arg) {
        int numero1;
        int numero2;
        int numero3;
        int numero4;
        int numero5;
        
        System.out.println("Ingresa el primero numero");
        Scanner num1 = new Scanner(System.in);
        numero1 = num1.nextInt();
        System.out.println("Ingresa el segundo numero");
        Scanner num2 = new Scanner(System.in);
        numero2 = num2.nextInt();
        System.out.println("Ingresa el tercer numero");
        Scanner num3 = new Scanner(System.in);
        numero3 = num3.nextInt();
        System.out.println("Ingresa el cuarto numero");
        Scanner num4 = new Scanner(System.in);
        numero4 = num4.nextInt();
        System.out.println("Ingresa el quinto numero");
        Scanner num5 = new Scanner(System.in);
        numero5 = num5.nextInt();
        int suma = numero1 + numero2 + numero3 + numero4 + numero5 ;
        System.out.println("La suma de los cinco numeros es: " + suma);
      }
    
} //GAGO RAMOS EDUARDO JESÚS
