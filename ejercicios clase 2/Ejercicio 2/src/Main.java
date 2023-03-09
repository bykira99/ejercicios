import java.util.Scanner;

public class Main {
    private static String abc = "abcdefghijklmnopqrstuvwxyz ";
    public static void main(String[] args) {

        while (true) {
            System.out.println("CIFRADO CESAR\n1- Encriptar\n2- Desncriptar\n");
            switch (entradaTeclado()) {
                case "1": {
                    System.out.println("Ingrese un String\n");
                    String stringTexto = entradaTeclado();
                    System.out.println("El String cifrado es: " + encriptar(stringTexto));
                    break;
                }
                case "2": {
                    System.out.println("Ingrese un String\n");
                    String stringTexto = entradaTeclado();
                    System.out.println("El String descifrado es: " + desencriptar(stringTexto));
                    break;
                }
                default:
                    System.out.println("Opción incorrecta\n");
            }
        }
    }

    public static String entradaTeclado() {
        Scanner tipeoScanner = new Scanner(System.in);
        String tipeoString = tipeoScanner.nextLine();
        return tipeoString;
    }


    public static String encriptar(String texto) {
        String nuevoTexto = "";
        for (int c = 0; c < texto.length(); c++) {
            for (int k = 0; k < abc.length(); k++) {
                if (texto.charAt(c) == abc.charAt(k)) {
                    if (k != abc.length() - 1 && k != abc.length() - 2) {
                        nuevoTexto += abc.charAt(k + 2);
                    } else if (k == abc.length() - 2) {
                        nuevoTexto += abc.charAt(0);
                    } else if (k == abc.length() - 1) {
                        nuevoTexto += abc.charAt(1);
                    }
                }
            }
        }
        return nuevoTexto;
    }

    public static String desencriptar(String texto) {
        String nuevoTexto = "";
        for (int c = 0; c < texto.length(); c++) {
            for (int k = 0; k < abc.length(); k++) {
                if (texto.charAt(c) == abc.charAt(k)) {
                    if (k != 0 && k != 1) {
                        nuevoTexto += abc.charAt(k - 2);
                    } else if (k == 0) {
                        nuevoTexto += abc.charAt(abc.length() - 2);
                    } else if (k == 1) {
                        nuevoTexto += abc.charAt(abc.length() - 1);
                    }
                }
            }
        }
        return nuevoTexto;
    }

}