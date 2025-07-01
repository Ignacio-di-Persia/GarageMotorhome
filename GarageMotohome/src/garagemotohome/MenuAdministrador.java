package garagemotohome;

import java.util.Scanner;

public class MenuAdministrador implements Menu{

    Login menu = new Login();
    MenuEmpleado menuEmpleado = new MenuEmpleado();
    MenuSocio menuSocio = new MenuSocio();

    public void mostrarOpciones(Administrador administrador) {
        int opcion;
        int codigoUsuario;

        do {
            Menu();
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\nInformación del Administrador:");
                    System.out.println(administrador.toString());
                    break;

                case 2:
                    codigoUsuario = solicitarCodigo("EMPLEADO");
                    Empleados empleadoEncontrado = menu.obtenerEmpleadoPorCodigo(codigoUsuario);
                    validarCodigo(empleadoEncontrado);
                    break;

                case 3:
                    codigoUsuario = solicitarCodigo("SOCIO");
                    Socios socioEncontrado = menu.obtenerSocioPorCodigo(codigoUsuario);
                    validarCodigo(socioEncontrado);
                    break;

                case 4:
                    System.out.println("Volviendo al menú principal...");
                    break;

                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
        } while (opcion != 4);
    }

    @Override
    public void Menu() {
        System.out.println("\n----- MENU ADMINISTRADOR -----");
        System.out.println("1. Ver información del Administrador");
        System.out.println("2. Consultar informacion de Empleado por codigo:");
        System.out.println("3. Consultar informacion de Socio por codigo:");
        System.out.println("4. Volver al menú principal");
        System.out.print("Ingrese una opción: ");
    }
    
    private void validarCodigo(Empleados em){
        if (em != null) {
            menuEmpleado.mostrarOpciones(em);
        }else{
            System.out.println("El codigo ingresado no pertenece a un socio");
        }
    }
    
    private void validarCodigo(Socios soc){
        if (soc != null) {
            menuSocio.mostrarOpciones(soc);
        } else {
            System.out.println("El codigo ingresado no pertenece a un socio");
        }
    }
}
