public class Profesor extends Comision{

    private String profesor;
    private String materia;

    public Profesor (String comision, String profesor, String materia){
        super(comision);
        this.profesor = profesor;
        this.materia = materia;

    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
}
