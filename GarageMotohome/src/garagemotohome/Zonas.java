
package garagemotohome;

import java.util.ArrayList;

public class Zonas {
    
   private final String LetraZona;
   ArrayList <Garage> garage = new ArrayList<>();
   ArrayList <Empleados> empleado = new ArrayList<>();

    public Zonas(String LetraZona) {
        this.LetraZona = LetraZona;
    }
   
    //getters & setters
    public String getLetraZona() {
        return LetraZona;
    }
    
    public ArrayList<Garage> getGarage() {
        return garage;
    }

    public ArrayList<Empleados> getEmpleado() {
        return empleado;
    }
    
    
    public void agregarGarage(Garage g) {
        garage.add(g);
    }

    public void agregarEmpleado(Empleados e) {
        empleado.add(e);
    }

    @Override
    public String toString() {
        return "Zonas: \n "
                + "LetraZona: " + LetraZona + "\n  "
                + "garage: " + garage + "\n  "
                + "empleado: " + empleado;
    }
    
}
 