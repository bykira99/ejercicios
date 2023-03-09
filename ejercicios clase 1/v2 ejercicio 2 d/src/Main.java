import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("DETERMINAR SI UNA PERSONA PERTENECE AL GRUPO DE INGRESOS ALTOS");
            if (ingresosMensuales() == true) {
                System.out.println("Pertenece al grupo de INGRESOS ALTOS");
            } else if (cantidadVehiculos() == true) {
                System.out.println("Pertenece al grupo de INGRESOS ALTOS");
            } else if (cantidadInmuebles() == true) {
                System.out.println("Pertenece al grupo de INGRESOS ALTOS");
            } else if (lujos() == true) {
                System.out.println("Pertenece al grupo de INGRESOS ALTOS");
            } else {
                System.out.println("No pertenece al grupo de INGRESOS ALTOS");
            }
        }
    }

    public static boolean ingresosMensuales() {

        System.out.println("¿Cuál es la suma de\n" +
                "los ingresos totales\n" +
                "del hogar?");
        if (metodoEntrada() > 489083) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean cantidadVehiculos() {
        System.out.println("¿Usted o alguien de su hogar\n" +
                " posee vehículos con menos\n" +
                "de 5 años de antigüedad?");
        String respuesta = metodoEntradaString();
        if (respuesta.equals("si")) {
            System.out.println("¿Cuántos vehiculos posee?");
            if (metodoEntrada() >= 3) {
                return true;
            } else {
                return false;
            }
        } else if (respuesta.equals("no")) {
            return false;
        } else {
            return cantidadVehiculos();
        }
    }

    public static boolean cantidadInmuebles() {
        System.out.println("¿Usted o alguien de su hogar, " +
                "posee inmuebles?");
        String respuesta = metodoEntradaString();
        if (respuesta.equals("si")) {
            System.out.println("¿Cuántos inmuebles posee?");
            if (metodoEntrada() >= 3) {
                return true;
            } else {
                return false;
            }
        } else if (respuesta.equals("no")) {
            return false;
        } else {
            return cantidadInmuebles();
        }
    }

    public static boolean lujos() {
        System.out.println("¿Usted o alguien de su hogar,\n" +
                "posee una embarcación, aeronave\n" +
                "de lujo o es titular de activos\n" +
                "societarios?\n");
        String respuesta = metodoEntradaString();
        if (respuesta.equals("si")) {
            return true;
        } else if (respuesta.equals("no")) {
            return false;
        } else {
            return lujos();
        }
    }

    public static int metodoEntrada() {
        int entradaTeclado;
        Scanner entradaEscaner = new Scanner(System.in);
        entradaTeclado = entradaEscaner.nextInt();
        return entradaTeclado;
    }

    public static String metodoEntradaString() {
        String entradaTeclado;
        Scanner entradaEscaner = new Scanner(System.in);
        entradaTeclado = entradaEscaner.next();
        return entradaTeclado;
    }
}