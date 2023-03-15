public class Main {
    public static void main(String[] args) {

        Comision comision1 = new Comision("Comision A");

        Alumnado alumno1 = new Alumnado(comision1.getComision(),"Alan", "Brandan", "41563641");
        Profesor profesor1 = new Profesor(comision1.getComision(), "Pepe", "Música");

        System.out.println(alumno1.getComision());
        System.out.println(profesor1.getComision());



    }
}