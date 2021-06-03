import java.util.Random;

public class Ejercicio2 {
    public static void main(String[] args) {
        int dado1;
        int dado2;
        int valor1;
        int valor2;

        do {
            System.out.println("¡AQUI VAN LAS TIRADAS!");
            Random numeroAleatorio= new Random();
            int valorDado1= numeroAleatorio.nextInt(6)+1;
            int valorDado2= numeroAleatorio.nextInt(6)+1;
            valor1=valorDado1;
            valor2=valorDado2;
            System.out.println("Dado#1= "+ valorDado1);
            System.out.println("Dado#2= "+ valorDado2);
            System.out.println("El total es: "+(valorDado1+valorDado2));

        }while (valor1 != valor2);



    }
}
