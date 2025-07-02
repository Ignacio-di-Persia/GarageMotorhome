package garagemotohome;

import java.util.ArrayList;

public class BaseDeDatos {
   
    private static ArrayList<Socios> listaSocios;
    private static ArrayList<Empleados> listaEmpleados;
    private static ArrayList<Administrador> listaAdministradores;

    public BaseDeDatos() {
        listaSocios = new ArrayList<>();
        listaEmpleados = new ArrayList<>();
        listaAdministradores = new ArrayList<>();
        cargaSociosVehiculosYGarages();
        cargaEmpleadosZonasGarages();
        cargarAdministradores();
    }
    
    //Carga de datos y sus relaciones
    private void cargaSociosVehiculosYGarages(){ 
        //Primer Socio
        Socios s1 = new Socios("Ana", 11122333, 99887766, new Domicilios("Avellaneda", 456, "Oeste"));
        Vehiculo v1 = new Vehiculo("ABC123", "Volkswagen", "Motorhome", 7.2, 3.8, true);
        Garage g1 = new Garage(4, 200, 7.5, 4.0, true, false);
        SocioVehiculosGarage relacion1 = new SocioVehiculosGarage(s1, v1);
        //Segundo Socio
        Socios s2 = new Socios("Carlos", 22233444, 88776655, new Domicilios("Belgrano", 789, "Centro"));
        Vehiculo v2a = new Vehiculo("DEF456", "Winnebago", "Motorhome", 8.0, 3.6, true);
        Vehiculo v2b = new Vehiculo("GHI789", "Airstream", "Casa Rodante", 7.5, 2.5, true);
        Garage g2 = new Garage(5, 250, 8.5, 4.0, true, false);
        SocioVehiculosGarage relacion2a = new SocioVehiculosGarage(s2, v2a);
        SocioVehiculosGarage relacion2b = new SocioVehiculosGarage(s2, v2b);
        //Tercer socio
        Socios s3 = new Socios("Lucía", 33344555, 77665544, new Domicilios("San Martín", 123, "Sur"));
        Vehiculo v3 = new Vehiculo("JKL012", "Ford", "Camper", 6.8, 2.8, true);
        Garage g3 = new Garage(3, 180, 7.0, 3.0, false, true);
        SocioVehiculosGarage relacion3 = new SocioVehiculosGarage(s3, v3);
        
        //Carga de datos y sus relaciones
        relacion1.estacionarEnGarage(g1, true,"15/05/2025");
        s1.agregarSocioVehiculoGarage(relacion1);
        s2.comprarGarage(g2);
        relacion2a.estacionarEnGarage(g2, true,"10/05/2025");
        relacion2b.estacionarEnGarage(g2, true,"5/06/2025");
        s2.agregarSocioVehiculoGarage(relacion2a);
        s2.agregarSocioVehiculoGarage(relacion2b);
        relacion3.estacionarEnGarage(g3, true,"20/06/2025");
        s3.agregarSocioVehiculoGarage(relacion3);

        //Carga en la colección
        listaSocios.add(s1);
        listaSocios.add(s2);
        listaSocios.add(s3);
    }
    
    private void cargaEmpleadosZonasGarages(){
        // Hardcoded empleados
        Empleados e1 = new Empleados("Mecánica", "Luis", 13579135, 33445566, new Domicilios("San Martín", 789, "Sur"));
        Zonas z1 = new Zonas("A");
        EmpleadoZona relacion1 = new EmpleadoZona(e1,z1);
        e1.agregarRelacionEmpleadoZona(relacion1);
        
        Empleados e2 = new Empleados("Atención", "Laura", 24680246, 77889900, new Domicilios("Belgrano", 321, "Este"));
        Zonas z2 = new Zonas("B");
        EmpleadoZona relacion2 = new EmpleadoZona(e2,z2);
        
        // Zonas y garages
        z1.agregarGarage(new Garage(1, 150, 5.0, 2.5, true, false));
        z1.agregarGarage(new Garage(2, 120, 4.5, 2.4, false, true));

        z2.agregarGarage(new Garage(3, 180, 6.0, 3.0, true, false));

        listaEmpleados.add(e1);
        listaEmpleados.add(e2);
    }
    
    private void cargarAdministradores(){
        Domicilios d1 = new Domicilios("Mitre", 123, "Centro");
        Domicilios d2 = new Domicilios("Rivadavia", 456, "Norte");
        Domicilios d3 = new Domicilios("San Juan", 789, "Oeste");

        listaAdministradores.add(new Administrador("Carlos", 12345678, 11223344, d1));
        listaAdministradores.add(new Administrador("María", 87654321, 55667788, d2));
        listaAdministradores.add(new Administrador("Luciano", 99887766, 33445566, d3));
    }

    public static ArrayList<Socios> getListaSocios() {
        return listaSocios;
    }

    public static ArrayList<Empleados> getListaEmpleados() {
        return listaEmpleados;
    }

    public static ArrayList<Administrador> getListaAdministradores() {
        return listaAdministradores;
    }
    
    
    
}
