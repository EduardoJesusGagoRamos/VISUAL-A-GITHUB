import java.util.Scanner;
public class ejercicio8 {
    public static void main(String[]arg) {
        int b;
        int h;
        
        System.out.print("Ingresa la base: ");
        Scanner numb = new Scanner(System.in);
        b = numb.nextInt();
        System.out.print("Ingresa la altura: ");
        Scanner numh = new Scanner(System.in);
        h = numh.nextInt();
        int per = 2 * b + 2 * h;
        System.out.println("El perimetro del romboide es: " + per);
        int are = b * h;
        System.out.println("El area del romboide es: " + are);  
      }
    
} //GAGO RAMOS EDUARDO JESÚS
