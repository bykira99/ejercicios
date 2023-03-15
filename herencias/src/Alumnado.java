import java.util.PrimitiveIterator;

public class Alumnado extends Comision{

    private String nombreAlumno;
    private String apellidoAlumno;
    private String dniAlumno;

    public Alumnado(String comision, String nombreAlumno, String apellidoAlumno, String dniAlumno){
        super(comision);
        this.nombreAlumno = nombreAlumno;
        this.apellidoAlumno = apellidoAlumno;
        this.dniAlumno= dniAlumno;

    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public String getApellidoAlumno() {
        return apellidoAlumno;
    }

    public void setApellidoAlumno(String apellidoAlumno) {
        this.apellidoAlumno = apellidoAlumno;
    }

    public String getDniAlumno() {
        return dniAlumno;
    }

    public void setDniAlumno(String dniAlumno) {
        this.dniAlumno = dniAlumno;
    }
}
