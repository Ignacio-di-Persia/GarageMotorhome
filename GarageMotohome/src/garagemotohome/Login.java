package garagemotohome;

import java.util.ArrayList;

public class Login implements Menu{

    private int opcion;
    private int codigoUsuario;
    private BaseDeDatos db;
    
    public Login(int opcion, int codigoUsuario) {
        this.opcion = opcion;
        this.codigoUsuario = codigoUsuario;
        
    }
     
    public Login() {
    }

    public void opcionesMenu() {
        do {
            Menu();
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    //pedir codigo de administrador
                    codigoUsuario = solicitarCodigo("ADMINISTRADOR");
                    Administrador administradorEncontrado = obtenerAdministradorPorCodigo(codigoUsuario);
                    validarUsuario(administradorEncontrado);
                    break;
                case 2:
                    //pedir codigo de empleado
                    codigoUsuario = solicitarCodigo("EMPLEADO");
                    Empleados empleadoEncontrado = obtenerEmpleadoPorCodigo(codigoUsuario);
                    validarUsuario(empleadoEncontrado);
                    break;
                case 3:
                    //pedir codigo de socio
                    codigoUsuario = solicitarCodigo("SOCIO");
                    Socios socioEncontrado = obtenerSocioPorCodigo(codigoUsuario);
                    validarUsuario(socioEncontrado);
                    break;
                case 4:
                    System.out.println("¡Muchas gracias por usar el sistema!\n");
                    break;
                default:
                    System.out.println("Opción seleccionada no valida\n");
                    break;
            }
        } while (opcion != 4);
    }
    
    //Validar codigo del socio
    public Socios obtenerSocioPorCodigo(int codigo) {
        for (Socios s : BaseDeDatos.getListaSocios()) {
            if (s.getCodigo() == codigo) {
                return s;
            }
        }
        return null;
    }
    
    //Validar codigo del Empleado
    public Empleados obtenerEmpleadoPorCodigo(int codigo) {
        for (Empleados e : BaseDeDatos.getListaEmpleados()) {
            if (e.getCodigo() == codigo) {
                return e;
            }
        }
        return null;
    }
    
    //Validar codigo del Adminsitrador
    public Administrador obtenerAdministradorPorCodigo(int codigo) {
        for (Administrador a : BaseDeDatos.getListaAdministradores()) {
            if (a.getCodigo() == codigo) {
                return a;
            }
        }
        return null;
    }

    @Override
    public void Menu() {
        System.out.println("BIENVENIDO AL SISTEMA DE GESTION \n");
        System.out.println("---------GUARDERIA CENTRAL-----------\n");
        System.out.println("[1]. ADMINISTRADOR\n");
        System.out.println("[2]. EMPLEADO\n");
        System.out.println("[3]. SOCIO\n");
        System.out.println("[4]. SALIR\n");
        System.out.println("Ingrese la opción correspondiente a su tipo de usuario:");
    }
    
    private void validarUsuario(Administrador a){
        if(a != null){
            System.out.println("Bienvenido Administrador: "+a.getNombre());
            MenuAdministrador menuAdministrador = new MenuAdministrador();
            menuAdministrador.mostrarOpciones(a);
        }else{
            System.out.println("El codigo ingresado no pertenece a un administrador");
        }
    }
    
    private void validarUsuario(Empleados e){
        if(e != null){
            System.out.println("Bienvenido Empleado: "+e.getNombre());
            MenuEmpleado menuEmpleado = new MenuEmpleado();
            menuEmpleado.mostrarOpciones(e);
        }else{
            System.out.println("El codigo ingresado no pertenece a un empleado");
        }
    }
    
    private void validarUsuario(Socios s){
         if(s != null){
            System.out.println("Bienvenido SOCIO: "+s.getNombre());
            MenuSocio menuSocio = new MenuSocio();
            menuSocio.mostrarOpciones(s);
        }else{
            System.out.println("El codigo ingresado no pertenece a un socio");
        }
    }

}
