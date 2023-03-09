import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String respuesta = "";
        while (true) {
            System.out.println("Qué ítem desea realizar\n" +
                    "1 - Dado un String y una letra,\n" +
                    " que cuente la cantidad de\n " +
                    "apariciones de la letra en el String\n" +
                    "2- Dados 3 número y un orden (asendente\n " +
                    " o decreciente) que ordene los mismo y\n" +
                    "los retorne en un vector de 3\n" +
                    "3- Dado un vector de números, y un número x,\n" +
                    "que sume todos los números >X y retorne el \n");

            respuesta = tipeoString();
            if (respuesta.equals("1")) {
                System.out.println("Ingrese un String y seguido un char");

                // System.out.println(tipeoString());

                // System.out.println(tipeoChar());

                if (primerMetodo(tipeoString(), tipeoChar()) == true) {
                    System.out.println("Metodo comprobado");
                }
            } else if (respuesta.equals("2")) {
                segundoMetodo();
            } else if (respuesta.equals("3")) {

                System.out.println("Ingrese tamaño del vector\n");
                int vector[] = new int[tipeoInt()];
                System.out.println("Ingrese los elementos del vector\n");
                for (int c = 0; c < vector.length; c++) {
                    vector[c] = tipeoInt();
                }
                System.out.println("Ingrese un número X\n");
                int x = tipeoInt();
                System.out.println("La suma de los elementos del vector mayores a " + x + " son: " + tercerMetodo(vector, x));

            }
        }
    }

    public static String tipeoString() {

        Scanner entradaScanner = new Scanner(System.in);
        String entradaTeclado = entradaScanner.nextLine();
        return entradaTeclado;
    }

    public static char tipeoChar() {

        Scanner entradaScanner = new Scanner(System.in);
        char entradaTeclado = entradaScanner.next().charAt(0);
        return entradaTeclado;
    }

    public static int tipeoInt() {
        Scanner entradaScanner = new Scanner(System.in);
        int entradaTeclado = entradaScanner.nextInt();
        return entradaTeclado;
    }

    public static boolean primerMetodo(String palabra, char letra) {
        int contador = 0;
        for (int c = 0; c < palabra.length(); c++) {
            if (palabra.charAt(c) == letra) {
                contador++;
            }
        }
        System.out.println("La letra " + letra + " aparece " + contador + " veces en el String: " + palabra);
        return true;
    }

    public static boolean segundoMetodo() {
        int respuesta = 0;
        int aux = 0;
        int arreglo[] = new int[3];
        System.out.println("Ingrese 3 números");
        for (int c = 0; c < 3; c++) {
            arreglo[c] = tipeoInt();

        }
        System.out.println("1 - ascendente\n2 - descendente");
        respuesta = tipeoInt();
        if (respuesta == 1) {
            for (int k = 0; k < 2; k++) {
                for (int d = 0; d < 2; d++) {
                    if (arreglo[d] > arreglo[d + 1]) {
                        aux = arreglo[d];
                        arreglo[d] = arreglo[d + 1];
                        arreglo[d + 1] = aux;
                    }
                }
            }
        } else if (respuesta == 2) {
            for (int k = 0; k < 2; k++) {
                for (int d = 0; d < 2; d++) {
                    if (arreglo[d] < arreglo[d + 1]) {
                        aux = arreglo[d];
                        arreglo[d] = arreglo[d + 1];
                        arreglo[d + 1] = aux;
                    }
                }
            }
        }
        System.out.println("Corroboramos el orden");
        for (int c = 0; c < 3; c++) {
            System.out.println("Posición " + c + ": " + arreglo[c]);
        }
        return true;
    }

    public static int tercerMetodo(int numeros[], int x) {
        int suma = 0;
        for (int c = 0; c < numeros.length; c++) {
            if (numeros[c] > x) {
                suma += numeros[c];
            }
        }
        return suma;
    }

}