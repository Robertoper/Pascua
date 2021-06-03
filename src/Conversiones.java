import java.util.Scanner;

public class Conversiones {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        double num=3.5;
        int x;
        int y;
        int z;

        x= (int) Math.round(num);    //  x = 4

        y= (int) Math.ceil(num);        // y = 4

        z = (int) Math.floor(num);      //  z = 3

        System.out.println("x = "+x);
        System.out.println("y = "+y);
        System.out.println("z = "+z);

        int num1;

        char c;

        num1 = (int) 'A';                //num1 = 65

        c = (char) 65;                    // c = ‘A’

        c = (char) ((int) 'A' + 1);  // c = ’B’

        System.out.println(num1);
        System.out.println(c);



        System.out.println("Introduzca un numero: ");
        String cad =teclado.next();
        int num2;
        num2=Byte.parseByte(cad);

        int numShort;
        numShort=Short.parseShort(cad);

        int numInteger;
        numInteger=Integer.parseInt(cad);

        int numLong;
        numLong= (int) Long.parseLong(cad);

        int numFloat;
        numFloat= (int) Float.parseFloat(cad);

        int numDouble;
        numDouble= (int) Double.parseDouble(cad);

        System.out.println(num2);
        System.out.println(numShort);
        System.out.println(numInteger);
        System.out.println(numLong);
        System.out.println(numFloat);
        System.out.println(numDouble);


        System.out.println("Introduzca un numero: ");
        String cadena =teclado.next();
        byte n=Byte.parseByte(cadena);





    }
}
