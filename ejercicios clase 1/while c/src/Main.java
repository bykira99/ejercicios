import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        num(5, 14);
    }

    public static int num(int a, int b) {
        int val = 0;
        String entradaTeclado = "";
        String par = "par";
        String impar = "impar";
        System.out.println("Ingrese par o impar de acuerdo a lo que quiere ver");
        Scanner entradaEscaner = new Scanner(System.in);
        entradaTeclado = entradaEscaner.next();
        if (entradaTeclado.equals(par)) {
            val = 0;
            System.out.println("MOSTRAR PAR");
        } else if (entradaTeclado.equals(impar)) {
            val = 1;
            System.out.println("MOSTRAR IMPAR");
        }
        while (a <= b) {
            if (val == 0) {
                if (a % 2 == 0) {
                    System.out.println(a);
                }
            } else if (val == 1) {
                if (a % 2 != 0) {
                    System.out.println(a);
                }
            }
            a++;
        }
        return a;
    }
}