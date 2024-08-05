/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package competencia;

/**
 *
 * @author alexa
 */
public class Escenario {

    private int idEscenario;
    private String nombre;
    private String ubicacion;

    // Constructor, getters y setters
    public Escenario(int idEscenario, String nombre, String ubicacion) {
        this.idEscenario = idEscenario;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    public int getIdEscenario() {
        return idEscenario;
    }

    public void setIdEscenario(int idEscenario) {
        this.idEscenario = idEscenario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
}
