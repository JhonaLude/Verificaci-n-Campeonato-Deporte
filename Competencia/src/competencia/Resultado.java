/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package competencia;

/**
 *
 * @author alexa
 */
public class Resultado {
    private int idResultado;
    private int golesLocal;
    private int golesVisitante;
    private boolean esEmpate;

    public Resultado(int idResultado, int golesLocal, int golesVisitante, boolean esEmpate) {
        this.idResultado = idResultado;
        this.golesLocal = golesLocal;
        this.golesVisitante = golesVisitante;
        this.esEmpate = esEmpate;
    }

    // Getters y setters
    public int getIdResultado() {
        return idResultado;
    }

    public int getGolesLocal() {
        return golesLocal;
    }

    public int getGolesVisitante() {
        return golesVisitante;
    }

    public boolean isEsEmpate() {
        return esEmpate;
    }
}

