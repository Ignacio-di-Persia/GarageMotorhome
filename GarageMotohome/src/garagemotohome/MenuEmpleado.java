
package garagemotohome;

import java.util.Scanner;

public class MenuEmpleado implements Menu{
    public void mostrarOpciones(Empleados empleado) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            Menu();
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\nInformación del Empleado:");
                    System.out.println(empleado.toString());
                    break;

                case 2:
                    System.out.println("\nZonas:");
                    for (EmpleadoZona relacion : empleado.getRelacionEmpleadoZona()) {
                        System.out.print("+ La zona asignada es: [ " + relacion.getZonas().getLetraZona() + "] \nAl empleado: " + relacion.getEmpleado().getNombre()+ " y su especialidad es: " +relacion.getEmpleado().getEspecialidad()+ "\n");
                       }
                    break;

                case 3:
                    System.out.println("Volviendo al menú principal...");
                    break;

                default:
                    System.out.println("Opción inválida.");
                    break;
            }

        } while (opcion != 3);
    }

    @Override
    public void Menu() {
        System.out.println("\n----- MENU EMPLEADO -----");
        System.out.println("1. Ver información del empleado");
        System.out.println("2. Ver zonas que le pretenecen");
        System.out.println("3. Volver al menú principal");
        System.out.print("Ingrese una opción: ");
    }
}
