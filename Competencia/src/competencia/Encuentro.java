/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package competencia;

/**
 *
 * @author alexa
 */
public class Encuentro {

    private int idEncuentro;
    private EquipoCampeonato equipoLocal;
    private EquipoCampeonato equipoVisitante;
    private Resultado resultado;

    public Encuentro(int idEncuentro, EquipoCampeonato equipoLocal, EquipoCampeonato equipoVisitante) {
        this.idEncuentro = idEncuentro;
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
    }

    public void registrarResultado(Resultado resultado) {
        this.resultado = resultado;
    }

    // Getters y setters
    public int getIdEncuentro() {
        return idEncuentro;
    }

    public EquipoCampeonato getEquipoLocal() {
        return equipoLocal;
    }

    public EquipoCampeonato getEquipoVisitante() {
        return equipoVisitante;
    }

    public Resultado getResultado() {
        return resultado;
    }

    @Override
    public String toString() {
        return "Encuentro " + idEncuentro + ": "
                + equipoLocal.getNombreEquipo() + " vs "
                + equipoVisitante.getNombreEquipo();
    }

}
