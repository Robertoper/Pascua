import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        int valor;
        Scanner teclado=new Scanner(System.in);
        System.out.println("INTRODUZCA UN NÚMERO ENTERO: ");
        valor=teclado.nextInt();
        System.out.println("Número: "+valor);

        for (int contador=1;contador<=valor;contador++){
            System.out.print(contador+" ");
        }
        System.out.println(" ");
        System.out.println("La suma es: "+valor);
    }
}
