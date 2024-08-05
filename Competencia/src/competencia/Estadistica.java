/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package competencia;

/**
 *
 * @author alexa
 */
public class Estadistica {

    private int idEstadistica;
    private int puntosHastaJugar;
    private int puntosDespuesJugar;
    private int puntosPorPartido;
    private int puntosPorVictoria;
    private int puntosPorGanar;

    // Constructor, getters y setters
    public Estadistica(int idEstadistica, int puntosHastaJugar, int puntosDespuesJugar, 
                       int puntosPorPartido, int puntosPorVictoria, int puntosPorGanar) {
        this.idEstadistica = idEstadistica;
        this.puntosHastaJugar = puntosHastaJugar;
        this.puntosDespuesJugar = puntosDespuesJugar;
        this.puntosPorPartido = puntosPorPartido;
        this.puntosPorVictoria = puntosPorVictoria;
        this.puntosPorGanar = puntosPorGanar;
    }

    public int getIdEstadistica() {
        return idEstadistica;
    }

    public void setIdEstadistica(int idEstadistica) {
        this.idEstadistica = idEstadistica;
    }

    public int getPuntosHastaJugar() {
        return puntosHastaJugar;
    }

    public void setPuntosHastaJugar(int puntosHastaJugar) {
        this.puntosHastaJugar = puntosHastaJugar;
    }

    public int getPuntosDespuesJugar() {
        return puntosDespuesJugar;
    }

    public void setPuntosDespuesJugar(int puntosDespuesJugar) {
        this.puntosDespuesJugar = puntosDespuesJugar;
    }

    public int getPuntosPorPartido() {
        return puntosPorPartido;
    }

    public void setPuntosPorPartido(int puntosPorPartido) {
        this.puntosPorPartido = puntosPorPartido;
    }

    public int getPuntosPorVictoria() {
        return puntosPorVictoria;
    }

    public void setPuntosPorVictoria(int puntosPorVictoria) {
        this.puntosPorVictoria = puntosPorVictoria;
    }

    public int getPuntosPorGanar() {
        return puntosPorGanar;
    }

    public void setPuntosPorGanar(int puntosPorGanar) {
        this.puntosPorGanar = puntosPorGanar;
    }

    public void actualizarEstadistica(int golesFavor, int golesContra) {
        int puntosObtenidos = 0;

        // Asignar puntos de acuerdo al resultado
        if (golesFavor > golesContra) {
            // Victoria
            puntosObtenidos = puntosPorVictoria;
        } else if (golesFavor == golesContra) {
            // Empate
            puntosObtenidos = puntosPorPartido;
        }

        // Actualizar puntos
        puntosDespuesJugar += puntosObtenidos;
    }
}

