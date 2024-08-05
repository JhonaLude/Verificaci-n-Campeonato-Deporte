/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package competencia;

/**
 *
 * @author alexa
 */
import java.util.List;

public class Jornadas {

    private int idJornadas;
    private String nombre;
    private List<FechaDeJuego> fechasDeJuego;

    // Constructor, getters y setters
    public Jornadas(int idJornadas, String nombre, List<FechaDeJuego> fechasDeJuego) {
        this.idJornadas = idJornadas;
        this.nombre = nombre;
        this.fechasDeJuego = fechasDeJuego;
    }

    public int getIdJornadas() {
        return idJornadas;
    }

    public void setIdJornadas(int idJornadas) {
        this.idJornadas = idJornadas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<FechaDeJuego> getFechasDeJuego() {
        return fechasDeJuego;
    }

    public void setFechasDeJuego(List<FechaDeJuego> fechasDeJuego) {
        this.fechasDeJuego = fechasDeJuego;
    }

    public void programaPartidos() {
        // Implementación pendiente
    }
}
