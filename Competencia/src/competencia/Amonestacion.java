/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package competencia;

/**
 *
 * @author alexa
 */
public class Amonestacion {

    private int idAmonestacion;
    private String nombre;

    // Constructor, getters y setters
    public Amonestacion(int idAmonestacion, String nombre) {
        this.idAmonestacion = idAmonestacion;
        this.nombre = nombre;
    }

    public int getIdAmonestacion() {
        return idAmonestacion;
    }

    public void setIdAmonestacion(int idAmonestacion) {
        this.idAmonestacion = idAmonestacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
