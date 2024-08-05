/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package competencia;

/**
 *
 * @author alexa
 */
public class EstadisticaCiclismo extends Estadistica {

    private float tiempo;
    private int vueltas;
    private int victorias;
    private int podios;

    // Constructor, getters y setters
    public EstadisticaCiclismo(int idEstadistica, int puntosHastaJugar, int puntosDespuesJugar, int puntosPorPartido, int puntosPorVictoria, int puntosPorGanar, int tiempo, int vueltas, int victorias, int podios) {
        super(idEstadistica, puntosHastaJugar, puntosDespuesJugar, puntosPorPartido, puntosPorVictoria, puntosPorGanar);
        this.tiempo = tiempo;
        this.vueltas = vueltas;
        this.victorias = victorias;
        this.podios = podios;
    }

    public float getTiempo() {
        return tiempo;
    }

    public void setTiempo(float tiempo) {
        this.tiempo = tiempo;
    }
    
    public int getVueltas() {
        return vueltas;
    }

    public void setVueltas(int vueltas) {
        this.vueltas = vueltas;
    }

    public int getVictorias() {
        return victorias;
    }

    public void setVictorias(int victorias) {
        this.victorias = victorias;
    }

    public int getPodios() {
        return podios;
    }

    public void setPodios(int podios) {
        this.podios = podios;
    }
}
