/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package competencia;

/**
 *
 * @author alexa
 */
public class Suspension {

    private int idSuspension;
    private String nombre;

    // Constructor, getters y setters
    public Suspension(int idSuspension, String nombre) {
        this.idSuspension = idSuspension;
        this.nombre = nombre;
    }

    public int getIdSuspension() {
        return idSuspension;
    }

    public void setIdSuspension(int idSuspension) {
        this.idSuspension = idSuspension;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
