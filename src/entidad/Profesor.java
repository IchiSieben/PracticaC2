/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author DesktopN°1
 */
public class Profesor {
    private Integer idProfesor;
    private String nombres;
    private String apellidos;
    private Integer sueldo;
    private Integer edad;

    public Integer getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(Integer idProfesor) {
        this.idProfesor = idProfesor;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Integer getSueldo() {
        return sueldo;
    }

    public void setSueldo(Integer sueldo) {
        this.sueldo = sueldo;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Profesor{" + "idProfesor=" + idProfesor + ", nombres=" + nombres + ", apellidos=" + apellidos + ", sueldo=" + sueldo + ", edad=" + edad + '}';
    }
    
    public String atributosProfesor(){
        return idProfesor+"|"+nombres+"|"+apellidos+"|"+sueldo+"|"+edad;
    }
    
    
}
