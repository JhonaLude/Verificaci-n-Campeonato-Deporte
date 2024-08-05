/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package competencia;

/**
 *
 * @author alexa
 */
import java.util.Date;

public class Persona {

    private String nombre;
    private String apellido;
    private String cedula;
    private Date fechaNacimiento;
    private String idPersona;
    private String nacionalidad;
    private String sexo;
    private String calle;
    private String celular;
    private String telefono; 

    // Constructor
    public Persona(String nombre, String apellido, String cedula, Date fechaNacimiento,
                   String idPersona, String nacionalidad, String sexo,
                   String calle, String celular) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.fechaNacimiento = fechaNacimiento;
        this.idPersona = idPersona;
        this.nacionalidad = nacionalidad;
        this.sexo = sexo;
        this.calle = calle;
        this.celular = celular;
        // Inicializa telefono si es necesario
    }

    // Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(String idPersona) {
        this.idPersona = idPersona;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Persona{"
                + "nombre='" + nombre + '\''
                + ", apellido='" + apellido + '\''
                + ", cedula='" + cedula + '\''
                + ", fechaNacimiento=" + fechaNacimiento
                + ", idPersona='" + idPersona + '\''
                + ", nacionalidad='" + nacionalidad + '\''
                + ", sexo='" + sexo + '\''
                + ", calle='" + calle + '\''
                + ", celular='" + celular + '\''
                + ", telefono='" + telefono + '\''
                + '}';
    }
}


