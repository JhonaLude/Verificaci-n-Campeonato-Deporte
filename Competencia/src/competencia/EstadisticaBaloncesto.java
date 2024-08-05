/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package competencia;

/**
 *
 * @author alexa
 */
public class EstadisticaBaloncesto extends EstadisticaJugador {

    private int asistencias;
    private int canastas;
    private int faltas;
    private int rebotes;

    // Constructor, getters y setters
    public EstadisticaBaloncesto(int idEstadistica, int puntosHastaJugar, int puntosDespuesJugar, int puntosPorPartido, int puntosPorVictoria, int puntosPorGanar, int partidosJugados, int puntos, int asistencias ,int canastas, int faltas, int rebotes) {
        super(idEstadistica, puntosHastaJugar, puntosDespuesJugar, puntosPorPartido, puntosPorVictoria, puntosPorGanar, partidosJugados, puntos);
        this.asistencias = asistencias;
        this.canastas = canastas;
        this.faltas = faltas;
        this.rebotes = rebotes;
    }

    public void setAsistencias(int rebotes) {
        this.asistencias = rebotes;
    }

    public void getAsistencias(int rebotes) {
        this.asistencias = rebotes;
    }

    public int getCanastas() {
        return canastas;
    }

    public void setCanastas(int canastas) {
        this.canastas = canastas;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    public int getRebotes() {
        return rebotes;
    }

    public void setRebotes(int rebotes) {
        this.rebotes = rebotes;
    }

}
