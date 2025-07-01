
package garagemotohome;

import java.util.Scanner;

public class MenuSocio {
    
    
    public void mostrarOpciones(Socios socio) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n----- MENU SOCIO -----");
            System.out.println("1. Ver información del socio");
            System.out.println("2. Ver vehículos y estado");
            System.out.println("3. Ver garages comprados");
            System.out.println("4. Volver al menú principal");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println(socio.toString());
                    break;

                case 2:
                    System.out.println("\nVehículos:");
                    for (SocioVehiculosGarage relacion : socio.getSocioVehiculoGarage()) {
                        System.out.print(" - " + relacion.getVehiculo().getNombre() + " (" + relacion.getVehiculo().getMatricula() + ")");
                        if (relacion.estaEstacionado()) {
                            System.out.println(" | Estacionado en Garage: " + relacion.getGarageAsignado().getNumGarage()
                                    + " (" + (relacion.estaGarageEsComprado() ? "Comprado" : "Alquilado") + ")\n"
                                            + " - Fecha en la que se estaciono el vehiculo: "+ relacion.getFechaAsignado());
                        } else {
                            System.out.println(" | No estacionado");
                        }
                    }
                    break;

                case 3:
                    System.out.println("\nGarages Comprados:");
                    for (Garage g : socio.getGaragesComprados()) {
                        System.out.println(" - Garage: " + g.getNumGarage() + " (" + g.getAncho() + "m x " + g.getProfundidad() + "m)");
                    }
                    break;

                case 4:
                    System.out.println("Volviendo al menú principal...");
                    break;

                default:
                    System.out.println("Opción inválida.");
                    break;
            }

        } while (opcion != 4);
    }
}

