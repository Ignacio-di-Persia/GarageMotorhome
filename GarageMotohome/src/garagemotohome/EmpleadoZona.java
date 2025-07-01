
package garagemotohome;


public class EmpleadoZona {
    private final Empleados empleado;
    private final Zonas zonas;

    public EmpleadoZona(Empleados empleado, Zonas zonas) {
        this.empleado = empleado;
        this.zonas = zonas;
    }
    
    //Getters and Setters
    public Empleados getEmpleado() {
        return empleado;
    }

    public Zonas getZonas() {
        return zonas;
    }

    @Override
    public String toString() {
        return "" + empleado + "\n  "
                + " zonas:" + zonas + "\n  ";
    }
    
}
