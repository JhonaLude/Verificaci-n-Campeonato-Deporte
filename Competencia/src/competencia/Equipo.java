/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package competencia;

/**
 *
 * @author alexa
 */
import java.util.ArrayList;
import java.util.List;

public class Equipo {

    private String colorUniforme;
    private String genero;
    private int idEquipo;
    private String nombre;
    private String sobrenombre;
    private List<Jugador> jugadores;  

    // Constructor
    public Equipo(String colorUniforme, String genero, int idEquipo,
            String nombre, String sobrenombre) {
        this.colorUniforme = colorUniforme;
        this.genero = genero;
        this.idEquipo = idEquipo;
        this.nombre = nombre;
        this.sobrenombre = sobrenombre;
        this.jugadores = new ArrayList<>();  
    }

    // Getters
    public String getColorUniforme() {
        return colorUniforme;
    }

    public String getGenero() {
        return genero;
    }

    public int getIdEquipo() {
        return idEquipo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSobrenombre() {
        return sobrenombre;
    }

    // Setters
    public void setColorUniforme(String colorUniforme) {
        this.colorUniforme = colorUniforme;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setIdEquipo(int idEquipo) {
        this.idEquipo = idEquipo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSobrenombre(String sobrenombre) {
        this.sobrenombre = sobrenombre;
    }

    // Método para actualizar estadísticas 
    public void actualizarEstadisticas(int golesFavor, int golesContra, boolean victoria) {
        System.out.println("Actualizando estadísticas del equipo:");
        System.out.println("Goles a favor: " + golesFavor);
        System.out.println("Goles en contra: " + golesContra);
        System.out.println("Victoria: " + (victoria ? "Sí" : "No"));
    }

    // Método para agregar jugadores
    public void agregarJugador(Jugador jugador) {
        this.jugadores.add(jugador);
    }

    @Override
    public String toString() {
        return "Equipo{"
                + "colorUniforme='" + colorUniforme + '\''
                + ", genero='" + genero + '\''
                + ", idEquipo=" + idEquipo
                + ", nombre='" + nombre + '\''
                + ", sobrenombre='" + sobrenombre + '\''
                + ", jugadores=" + jugadores 
                + '}';
    }
}
