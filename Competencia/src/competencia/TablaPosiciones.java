/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package competencia;

/**
 *
 * @author alexa
 */
public class TablaPosiciones {

    private EquipoCampeonato equipo;
    private int partidosJugados;
    private int victorias;
    private int empates;
    private int derrotas;
    private int golesFavor;
    private int golesContra;
    private int puntos;

    public TablaPosiciones(EquipoCampeonato equipo) {
        this.equipo = equipo;
        this.partidosJugados = 0;
        this.victorias = 0;
        this.empates = 0;
        this.derrotas = 0;
        this.golesFavor = 0;
        this.golesContra = 0;
        this.puntos = 0;
    }

    public void actualizarEstadisticas(int golesFavor, int golesContra) {
        this.partidosJugados++;
        this.golesFavor += golesFavor;
        this.golesContra += golesContra;

        if (golesFavor > golesContra) {
            victorias++;
            puntos += 3;
        } else if (golesFavor == golesContra) {
            empates++;
            puntos += 1;
        } else {
            derrotas++;
        }
    }

    // Getters y setters
    public EquipoCampeonato getEquipo() {
        return equipo;
    }

    @Override
    public String toString() {
        return equipo.getNombreEquipo()
                + " - Puntos: " + puntos
                + ", GF: " + golesFavor
                + ", GC: " + golesContra;
    }
}
