/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package competencia;

import java.util.Date;

public class Jugador extends Persona {

    private int goles;
    private int tarjetasAmarillas;
    private int tarjetasRojas;

    // Constructor
    public Jugador(String nombre, String apellido, String cedula, Date fechaNacimiento,
                   String idPersona, String nacionalidad, String sexo,
                   String calle, String celular, int goles, int tarjetasAmarillas, int tarjetasRojas) {
        super(nombre, apellido, cedula, fechaNacimiento, idPersona, nacionalidad, sexo, calle, celular);
        this.goles = goles;
        this.tarjetasAmarillas = tarjetasAmarillas;
        this.tarjetasRojas = tarjetasRojas;
    }

    // Getters y Setters
    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    public int getTarjetasAmarillas() {
        return tarjetasAmarillas;
    }

    public void setTarjetasAmarillas(int tarjetasAmarillas) {
        this.tarjetasAmarillas = tarjetasAmarillas;
    }

    public int getTarjetasRojas() {
        return tarjetasRojas;
    }

    public void setTarjetasRojas(int tarjetasRojas) {
        this.tarjetasRojas = tarjetasRojas;
    }

    // Métodos para registrar goles y tarjetas
    public void registrarGol() {
        this.goles++;
    }

    public void registrarTarjetaAmarilla() {
        this.tarjetasAmarillas++;
    }

    public void registrarTarjetaRoja() {
        this.tarjetasRojas++;
    }

    @Override
    public String toString() {
        return "Jugador{"
                + "nombre='" + getNombre() + '\''
                + ", apellido='" + getApellido() + '\''
                + ", cedula='" + getCedula() + '\''
                + ", fechaNacimiento=" + getFechaNacimiento()
                + ", idPersona='" + getIdPersona() + '\''
                + ", nacionalidad='" + getNacionalidad() + '\''
                + ", sexo='" + getSexo() + '\''
                + ", calle='" + getCalle() + '\''
                + ", celular='" + getCelular() + '\''
                + ", goles=" + goles
                + ", tarjetasAmarillas=" + tarjetasAmarillas
                + ", tarjetasRojas=" + tarjetasRojas
                + '}';
    }
}

