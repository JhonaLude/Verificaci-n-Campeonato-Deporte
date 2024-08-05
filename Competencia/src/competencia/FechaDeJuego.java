/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package competencia;

/**
 *
 * @author alexa
 */
import java.util.Date;

public class FechaDeJuego {

    private Date fecha;
    private int idFechaJuego;

    // Constructor, getters y setters
    public FechaDeJuego(Date fecha, int idFechaJuego) {
        this.fecha = fecha;
        this.idFechaJuego = idFechaJuego;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getIdFechaJuego() {
        return idFechaJuego;
    }

    public void setIdFechaJuego(int idFechaJuego) {
        this.idFechaJuego = idFechaJuego;
    }
}
