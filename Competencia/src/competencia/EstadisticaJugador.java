/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package competencia;

/**
 *
 * @author alexa
 */
public class EstadisticaJugador extends Estadistica {

    private int partidosJugados;
    private int puntos;

    // Constructor, getters y setters
    public EstadisticaJugador(int idEstadistica, int puntosHastaJugar, int puntosDespuesJugar, int puntosPorPartido, int puntosPorVictoria, int puntosPorGanar, int partidosJugados, int puntos) {
        super(idEstadistica, puntosHastaJugar, puntosDespuesJugar, puntosPorPartido, puntosPorVictoria, puntosPorGanar);
        this.partidosJugados = partidosJugados;
        this.puntos = puntos;
    }

    public int getPartidosJugados() {
        return partidosJugados;
    }

    public void setPartidosJugados(int partidosJugados) {
        this.partidosJugados = partidosJugados;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
}
