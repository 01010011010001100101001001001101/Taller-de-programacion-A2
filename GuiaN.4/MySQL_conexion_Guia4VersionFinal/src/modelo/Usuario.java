package modelo;
/**
 *
 * @author Thomas Sanmiguel y Sebastián Revelo
 */
public class Usuario {
    private long nroID;
    private String tipoID;
    private String nombres;
    private int edad;
    private String correo;
    private long celular;
    private int semestre;
    private String carrera;
    public Usuario(long nroID, String tipoID, String nombres, int edad, String correo, long celular, int semestre, String carrera) {
        this.nroID = nroID;
        this.tipoID = tipoID;
        this.nombres = nombres;
        this.edad = edad;
        this.correo = correo;
        this.celular = celular;
        this.semestre = semestre;
        this.carrera = carrera;
    }
    public Usuario() {
    }
    public long getNroID() {
        return nroID;
    }
    public void setNroID(long nroID) {
        this.nroID = nroID;
    }
    public String getTipoID() {
        return tipoID;
    }
    public void setTipoID(String tipoID) {
        this.tipoID = tipoID;
    }
    public String getNombres() {
        return nombres;
    }
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public long getCelular() {
        return celular;
    }
    public void setCelular(long celular) {
        this.celular = celular;
    }
    public int getSemestre() {
        return semestre;
    }
    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    public String getCarrera() {
        return carrera;
    }
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    } 
}