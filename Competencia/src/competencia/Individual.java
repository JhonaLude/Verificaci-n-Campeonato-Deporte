/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package competencia;

/**
 *
 * @author alexa
 */
public class Individual {

    private int ranking;
    private String nombreDeportivo;
    private String especialidad;
    private int idClubAfiliado;
    private int idEstadActual;

    // Constructor, getters y setters
    public Individual(int ranking, String nombreDeportivo, String especialidad, int idClubAfiliado, int idEstadActual) {
        this.ranking = ranking;
        this.nombreDeportivo = nombreDeportivo;
        this.especialidad = especialidad;
        this.idClubAfiliado = idClubAfiliado;
        this.idEstadActual = idEstadActual;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public String getNombreDeportivo() {
        return nombreDeportivo;
    }

    public void setNombreDeportivo(String nombreDeportivo) {
        this.nombreDeportivo = nombreDeportivo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getIdClubAfiliado() {
        return idClubAfiliado;
    }

    public void setIdClubAfiliado(int idClubAfiliado) {
        this.idClubAfiliado = idClubAfiliado;
    }

    public int getIdEstadActual() {
        return idEstadActual;
    }

    public void setIdEstadActual(int idEstadActual) {
        this.idEstadActual = idEstadActual;
    }
}
