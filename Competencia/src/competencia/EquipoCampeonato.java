/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package competencia;

import java.util.ArrayList;
import java.util.List;

public class EquipoCampeonato {

    private int idCampeonato;
    private String nombreEquipo;
    private List<Jugador> jugadores;

    public EquipoCampeonato(int idCampeonato, String nombreEquipo) {
        this.idCampeonato = idCampeonato;
        this.nombreEquipo = nombreEquipo;
        this.jugadores = new ArrayList<>();
    }

    public EquipoCampeonato(String color, String tipo, int idCampeonato, String nombreEquipo, String categoria) {
        this.idCampeonato = idCampeonato;
        this.nombreEquipo = nombreEquipo;
        this.jugadores = new ArrayList<>();
    }

    public int getIdCampeonato() {
        return idCampeonato;
    }

    public void setIdCampeonato(int idCampeonato) {
        this.idCampeonato = idCampeonato;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void agregarJugador(Jugador jugador) {
        this.jugadores.add(jugador);
    }

    @Override
    public String toString() {
        return "EquipoCampeonato{"
                + "idCampeonato=" + idCampeonato
                + ", nombreEquipo='" + nombreEquipo + '\''
                + ", jugadores=" + jugadores
                + '}';
    }
}
