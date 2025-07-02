package garagemotohome;

import java.util.ArrayList;

public class Socios extends Personas {

    protected ArrayList<Garage> garagesComprados = new ArrayList<>();
    protected ArrayList<SocioVehiculosGarage> SocioVehiculoGarage = new ArrayList<>();
    private static int contador; 
    private static final int prefijoSocio=3;
    
    public Socios(String nombre, int DNI, int Telefono, Domicilios domicilio) {
        super(nombre, DNI, Telefono, domicilio);
        contador++;
    }

    //getters and setters
    public ArrayList<Garage> getGaragesComprados() {
        return garagesComprados;
    }

    public ArrayList<SocioVehiculosGarage> getSocioVehiculoGarage() {
        return SocioVehiculoGarage;
    }

    public void comprarGarage(Garage g) {
        garagesComprados.add(g);
    }

    public void agregarSocioVehiculoGarage(SocioVehiculosGarage relacion) {
        SocioVehiculoGarage.add(relacion);
    }

    public void estacionarVehiculoEnGarage(Vehiculo vehiculo, Garage garage) {
        if (vehiculo.puedeEstacionarEn(garage)) {
            vehiculo.setEstacionado(true);
            garage.setOcupado(true);
            System.out.println("Vehículo estacionado correctamente en Garage #" + garage.getNumGarage());
        } else {
            System.out.println("El vehículo NO puede ser estacionado en este garage (dimensiones incompatibles o ocupado).");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nINFORMACION DEL SOCIO\n");
        sb.append("Codigo: ").append(getCodigo()).append("\n");
        sb.append("Nombre: ").append(getNombre()).append("\n");
        sb.append("DNI: ").append(getDNI()).append("\n");
        sb.append("Telefono: ").append(getTelefono()).append("\n");
        //sb.append("Domicilio: ").append(getDomicilios()).append("\n");

        sb.append("Vehículos:\n");
        for (SocioVehiculosGarage relacion : SocioVehiculoGarage) {
            sb.append("  - ").append(relacion.getVehiculo().getNombre()).append(" (")
                    .append(relacion.getVehiculo().getMatricula()).append(")");

            if (relacion.estaEstacionado()) {
                sb.append(" | Estacionado en Garage: ").append(relacion.getGarageAsignado().getNumGarage())
                        .append(" [").append(relacion.estaGarageEsComprado() ? "Comprado" : "Alquilado").append("]\n")
                        .append("  - Fecha en la que se estaciono el vehiculo: ").append(relacion.getFechaAsignado());
            } else {
                sb.append(" | No está estacionado");
            }
            sb.append("\n");
        }

        sb.append("\nGarages Comprados:\n");
        for (Garage g : garagesComprados) {
            sb.append("  - Garage: ").append(g.getNumGarage()).append(" (")
                    .append(g.getAncho()).append("m x ").append(g.getProfundidad()).append("m)\n");
        }
        return sb.toString();
    }
    
    // Los socios tendran un codigo que SIEMPRE empieza en 3
    @Override
    public int crearCodigo() {
        String numero;
        numero = String.valueOf(prefijoSocio) +String.valueOf(contador);
        return Integer.parseInt(numero);
    }

}
