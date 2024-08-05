/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package competencia;

/**
 *
 * @author alexa
 */
public class EstadisticaTenisDeMesa extends Estadistica {

    private int setsGanados;
    private int setsPerdidos;
    private int puntosGanados;
    private int puntosPerdidos;

    // Constructor, getters y setters
    public EstadisticaTenisDeMesa(int idEstadistica, int puntosHastaJugar, int puntosDespuesJugar, int puntosPorPartido, int puntosPorVictoria, int puntosPorGanar, int setsGanados, int setsPerdidos, int puntosGanados, int puntosPerdidos) {
        super(idEstadistica, puntosHastaJugar, puntosDespuesJugar, puntosPorPartido, puntosPorVictoria, puntosPorGanar);
        this.setsGanados = setsGanados;
        this.setsGanados = setsPerdidos;
        this.puntosGanados = puntosGanados;
        this.puntosPerdidos = puntosPerdidos;
    }

    public int getSetsGanados() {
        return setsGanados;
    }

    public void setSetsGanados(int setsGanados) {
        this.setsGanados = setsGanados;
    }

    public int getSetsPerdidos() {
        return setsPerdidos;
    }

    public void setSetsPerdidos(int setsPerdidos) {
        this.setsPerdidos = setsPerdidos;
    }

    public int getPuntosGanados() {
        return puntosGanados;
    }

    public void setPuntosGanados(int puntosGanados) {
        this.puntosGanados = puntosGanados;
    }

    public int getPuntosPerdidos() {
        return puntosPerdidos;
    }

    public void setPuntosPerdidos(int puntosPerdidos) {
        this.puntosPerdidos = puntosPerdidos;
    }
}
