package garagemotohome;

import java.util.ArrayList;

public class Empleados extends Personas {

    private final String Especialidad;
    protected ArrayList<Zonas> zonas = new ArrayList<>();
    protected ArrayList<EmpleadoZona> relacionEmpleadoZona = new ArrayList<>();
    private static int contador; 
    private static final int prefijoEmpleado=2;

    public Empleados(String Especialidad, String nombre, int DNI, int Telefono, Domicilios domicilio) {
        super(nombre, DNI, Telefono, domicilio);
        this.Especialidad = Especialidad;
        contador++;
    }

    //Getters and setter  
    public String getEspecialidad() {
        return Especialidad;
    }

    public ArrayList<Zonas> getZonas() {
        return zonas;
    }

    public ArrayList<EmpleadoZona> getRelacionEmpleadoZona() {
        return relacionEmpleadoZona;
    }

    public void agregarRelacionEmpleadoZona(EmpleadoZona relacion) {
        relacionEmpleadoZona.add(relacion);
    }

    // Los empleados tendran un codigo que SIEMPRE empieza en 2
    @Override
    public int crearCodigo() {
        String numero;
        numero = String.valueOf(prefijoEmpleado) +String.valueOf(contador);
        return Integer.parseInt(numero);
    }
    
    @Override
    public String toString() {
        return "Empleado:  "
                + super.toString()
                + "+Especialidad: " + Especialidad + "\n  "
                + "Zonas: " + zonas;
    }

}
