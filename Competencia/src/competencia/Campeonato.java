/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package competencia;

/**
 *
 * @author alexa
 */
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Campeonato {

    private int idCampeonato;
    private Date fechaInicio;
    private Date fechaFin;
    private String genero;
    private String nombre;
    private int numeroClasificadosPorGrupo;
    private int numeroEquiposPorGrupo;
    private int numeroGrupos;
    private int numeroVueltas;
    private List<EquipoCampeonato> equipos;
    private List<Encuentro> encuentros;
    private List<TablaPosiciones> tablaPosiciones;

    public Campeonato(int idCampeonato, Date fechaInicio, Date fechaFin, String genero, String nombre,
            int numeroClasificadosPorGrupo, int numeroEquiposPorGrupo, int numeroGrupos,
            int numeroVueltas) {
        this.idCampeonato = idCampeonato;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.genero = genero;
        this.nombre = nombre;
        this.numeroClasificadosPorGrupo = numeroClasificadosPorGrupo;
        this.numeroEquiposPorGrupo = numeroEquiposPorGrupo;
        this.numeroGrupos = numeroGrupos;
        this.numeroVueltas = numeroVueltas;
        this.equipos = new ArrayList<>();
        this.encuentros = new ArrayList<>();
        this.tablaPosiciones = new ArrayList<>();
    }

    // Método para agregar un equipo al campeonato
    public void agregarEquipo(EquipoCampeonato equipo) {
        equipos.add(equipo);
        
        // Crea una nueva entrada en la tabla de posiciones para el equipo
        tablaPosiciones.add(new TablaPosiciones(equipo));
    }

    public void programarEncuentros() {
        for (int vuelta = 0; vuelta < numeroVueltas; vuelta++) {
            for (int i = 0; i < equipos.size(); i++) {
                for (int j = i + 1; j < equipos.size(); j++) {
                    encuentros.add(new Encuentro(encuentros.size() + 1, equipos.get(i), equipos.get(j)));
                }
            }
        }
    }

    public void actualizarClasificacion(Encuentro encuentro) {
        Resultado resultado = encuentro.getResultado();
        actualizarTablaPosiciones(encuentro.getEquipoLocal(), resultado.getGolesLocal(), resultado.getGolesVisitante());
        actualizarTablaPosiciones(encuentro.getEquipoVisitante(), resultado.getGolesVisitante(), resultado.getGolesLocal());
    }

    public void actualizarTablaPosiciones(EquipoCampeonato equipo, int golesFavor, int golesContra) {
        TablaPosiciones posicion = tablaPosiciones.stream()
                .filter(tp -> tp.getEquipo().equals(equipo))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Equipo no encontrado en la tabla de posiciones"));

        posicion.actualizarEstadisticas(golesFavor, golesContra);
    }

    // Getters y setters
    public List<Encuentro> getEncuentros() {
        return encuentros;
    }

    public int getIdCampeonato() {
        return idCampeonato;
    }

    public List<TablaPosiciones> getTablaPosiciones() {
        return tablaPosiciones;
    }

    String getNombre() {
        return nombre;
    }
}

