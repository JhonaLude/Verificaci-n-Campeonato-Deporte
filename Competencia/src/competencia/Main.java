/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package competencia;

/**
 *
 * @author alexa
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Campeonato> campeonatos = new ArrayList<>();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Crear nuevo campeonato");
            System.out.println("2. Registrar resultado");
            System.out.println("3. Mostrar encuentros programados");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    crearCampeonato(scanner, campeonatos);
                    break;
                case 2:
                    registrarResultado(scanner, campeonatos);
                    break;
                case 3:
                    mostrarEncuentros(scanner, campeonatos);
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opcion no valida. Por favor, seleccione una opcion entre 1 y 4.");
                    break;
            }
        }
    }

    private static void crearCampeonato(Scanner scanner, List<Campeonato> campeonatos) {
        System.out.print("Ingrese el nombre del campeonato: ");
        String nombreCampeonato = scanner.nextLine();

        System.out.print("Ingrese el ID del campeonato: ");
        int idCampeonato = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Ingrese la cantidad de equipos para el campeonato: ");
        int numEquipos = scanner.nextInt();
        scanner.nextLine();

        Campeonato campeonato = new Campeonato(idCampeonato, new Date(), new Date(), "M", nombreCampeonato, 2, 2, 2, 1);

        for (int i = 0; i < numEquipos; i++) {
            System.out.print("Ingrese el nombre del equipo " + (i + 1) + ": ");
            String nombreEquipo = scanner.nextLine();
            EquipoCampeonato equipo = new EquipoCampeonato(idCampeonato, nombreEquipo);

            System.out.print("Ingrese la cantidad de jugadores para el equipo " + (i + 1) + ": ");
            int numJugadores = scanner.nextInt();
            scanner.nextLine();

            for (int j = 0; j < numJugadores; j++) {
                System.out.println("Jugador " + (j + 1) + ":");
                System.out.print("  Nombre: ");
                String nombre = scanner.nextLine();

                System.out.print("  Apellido: ");
                String apellido = scanner.nextLine();

                System.out.print("  Cedula: ");
                String cedula = scanner.nextLine();

                Date fechaNacimiento = null;
                while (fechaNacimiento == null) {
                    System.out.print("  Fecha de nacimiento (dd/MM/yyyy): ");
                    String fechaNacimientoStr = scanner.nextLine();
                    try {
                        fechaNacimiento = new SimpleDateFormat("dd/MM/yyyy").parse(fechaNacimientoStr);
                    } catch (ParseException e) {
                        System.out.println("Fecha invalida, intente de nuevo.");
                    }
                }

                System.out.print("  Nacionalidad: ");
                String nacionalidad = scanner.nextLine();

                System.out.print("  Sexo: ");
                String sexo = scanner.nextLine();

                System.out.print("  Calle: ");
                String calle = scanner.nextLine();

                System.out.print("  Celular: ");
                String celular = scanner.nextLine();

                int idJugador = (i + 1) * 10 + j + 1;
                Jugador jugador = new Jugador(nombre, apellido, cedula, fechaNacimiento, "ID" + idJugador, nacionalidad, sexo, calle, celular, 0, 0, 0);
                equipo.agregarJugador(jugador);
            }

            campeonato.agregarEquipo(equipo);
        }

        campeonato.programarEncuentros();
        campeonatos.add(campeonato);
        System.out.println("Campeonato creado exitosamente.");
    }

    private static void registrarResultado(Scanner scanner, List<Campeonato> campeonatos) {
        System.out.print("Ingrese el ID del campeonato para registrar un resultado: ");
        int campeonatoId = scanner.nextInt();
        scanner.nextLine();

        Campeonato campeonatoSeleccionado = campeonatos.stream()
                .filter(c -> c.getIdCampeonato() == campeonatoId)
                .findFirst()
                .orElse(null);

        if (campeonatoSeleccionado != null) {
            System.out.print("Ingrese el ID del encuentro para registrar un resultado: ");
            int idEncuentro = scanner.nextInt();
            scanner.nextLine();

            Encuentro encuentroSeleccionado = campeonatoSeleccionado.getEncuentros().stream()
                    .filter(e -> e.getIdEncuentro() == idEncuentro)
                    .findFirst()
                    .orElse(null);

            if (encuentroSeleccionado != null) {
                System.out.print("Ingrese los goles del equipo local: ");
                int golesLocal = scanner.nextInt();

                System.out.print("Ingrese los goles del equipo visitante: ");
                int golesVisitante = scanner.nextInt();
                scanner.nextLine();

                boolean esEmpate = golesLocal == golesVisitante;
                Resultado resultado = new Resultado(idEncuentro, golesLocal, golesVisitante, esEmpate);

                encuentroSeleccionado.registrarResultado(resultado);
                campeonatoSeleccionado.actualizarClasificacion(encuentroSeleccionado);

                System.out.println("Tabla de Posiciones del Campeonato:");
                List<TablaPosiciones> tablaPosiciones = campeonatoSeleccionado.getTablaPosiciones();
                for (TablaPosiciones posicion : tablaPosiciones) {
                    System.out.println(posicion);
                }
            } else {
                System.out.println("Encuentro no encontrado.");
            }
        } else {
            System.out.println("Campeonato no encontrado.");
        }
    }

    private static void mostrarEncuentros(Scanner scanner, List<Campeonato> campeonatos) {
        System.out.print("Ingrese el ID del campeonato para mostrar los encuentros programados: ");
        int campeonatoId = scanner.nextInt();
        scanner.nextLine();

        Campeonato campeonatoSeleccionado = campeonatos.stream()
                .filter(c -> c.getIdCampeonato() == campeonatoId)
                .findFirst()
                .orElse(null);

        if (campeonatoSeleccionado != null) {
            System.out.println("Encuentros programados para el campeonato " + campeonatoSeleccionado.getNombre() + ":");
            for (Encuentro encuentro : campeonatoSeleccionado.getEncuentros()) {
                System.out.println(encuentro);
            }
        } else {
            System.out.println("Campeonato no encontrado.");
        }
    }
}

