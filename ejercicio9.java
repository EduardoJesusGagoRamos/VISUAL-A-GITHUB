import java.util.Scanner;
public class ejercicio9 {
    public static void main(String[]arg) {
        int l;
        int m;
        int n;
        int o;
        int b;
        int B;
        int h;

        System.out.print("Ingresa el lado 1: ");
        Scanner numl = new Scanner(System.in);
        l = numl.nextInt();
        System.out.print("Ingresa el lado 2: ");
        Scanner numm = new Scanner(System.in);
        m = numm.nextInt();
        System.out.print("Ingresa el lado 3: ");
        Scanner numn = new Scanner(System.in);
        n = numn.nextInt();
        System.out.print("Ingresa el lado 4: ");
        Scanner numo = new Scanner(System.in);
        o = numo.nextInt();
        int per = l + m + n + o;
        System.out.println("El perimetro del trapecio es: " + per);
        System.out.print("Ingresa la base menor: ");
        Scanner numb = new Scanner(System.in);
        b = numb.nextInt();
        System.out.print("Ingresa la base mayor: ");
        Scanner numB = new Scanner(System.in);
        B = numB.nextInt();
        System.out.print("Ingresa la altura: ");
        Scanner numh = new Scanner(System.in);
        h = numh.nextInt();
        int area = h * (B + b) / 2;
        System.out.println("El area del trapecio es: " + area);  
      }
    
} //GAGO RAMOS EDUARDO JESÚS
