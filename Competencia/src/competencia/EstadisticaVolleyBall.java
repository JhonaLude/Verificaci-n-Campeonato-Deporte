/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package competencia;

/**
 *
 * @author alexa
 */
public class EstadisticaVolleyBall extends EstadisticaJugador {

    private int puntos;
    private int bloqueos;
    private int saques;

    // Constructor, getters y setters
    public EstadisticaVolleyBall(int idEstadistica, int puntosHastaJugar, int puntosDespuesJugar, int puntosPorPartido, int puntosPorVictoria, int puntosPorGanar, int partidosJugados, int puntos, int bloqueos, int saques) {
        super(idEstadistica, puntosHastaJugar, puntosDespuesJugar, puntosPorPartido, puntosPorVictoria, puntosPorGanar, partidosJugados, puntos);
        this.bloqueos = bloqueos;
        this.saques = saques;
    }

    public int getBloqueos() {
        return bloqueos;
    }

    public void setBloqueos(int bloqueos) {
        this.bloqueos = bloqueos;
    }

    public int getSaques() {
        return saques;
    }

    public void setSaques(int saques) {
        this.saques = saques;
    }
}
