
package garagemotohome;

public class SocioVehiculosGarage{
    private final Socios socio;
    private final Vehiculo vehiculo;
    private Garage garageAsignado;
    private boolean estacionado;
    private boolean garageEsComprado; // Para saber si es propio o si lo alquilo
    private String fechaAsignado;
    
    public SocioVehiculosGarage(Socios socio, Vehiculo vehiculo, Garage garageAsignado, boolean estacionado, boolean garageEsComprado) {
    this.socio = socio;
    this.vehiculo = vehiculo;
    this.garageAsignado = garageAsignado;
    this.estacionado = estacionado;
    this.garageEsComprado = garageEsComprado;
    this.fechaAsignado = estacionado ? fechaAsignado : null;

        if (estacionado) {
            vehiculo.setEstacionado(true);
            if (garageAsignado != null) {
                garageAsignado.setOcupado(true);
            }
        }
    }

    public SocioVehiculosGarage(Socios socio, Vehiculo vehiculo) {
        this.socio = socio;
        this.vehiculo = vehiculo;
        this.garageAsignado = null;
        this.estacionado = false;
        this.garageEsComprado = false;
        this.fechaAsignado = null;
    }
    
    //Getters and Setters
    public Socios getSocio() {
        return socio;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public Garage getGarageAsignado() {
        return garageAsignado;
    }

    public String getFechaAsignado() {
        return fechaAsignado;
    }

    public boolean estaEstacionado() {
        return estacionado;
    }

    public boolean estaGarageEsComprado() {
        return garageEsComprado;
    }
    
    //Método para asignar y validar el estacionamiento
    public boolean estacionarEnGarage(Garage garage, boolean esComprado,String fechaAsignado){
        if(vehiculo.puedeEstacionarEn(garage)){
            this.garageAsignado=garage;
            this.estacionado=true;
            this.garageEsComprado=esComprado;
            this.fechaAsignado = fechaAsignado;
            vehiculo.setEstacionado(estacionado);
            garage.setOcupado(true);
            return true;
            }else{ 
                return false;
            }
        }
    
    public void desEstacionar(){
        if(garageAsignado!=null){
            garageAsignado.setOcupado(false);
        }
        vehiculo.setEstacionado(false);
        this.garageAsignado = null;
        this.estacionado = false;
        this.fechaAsignado = null;
    }

    @Override
    public String toString() {
        String estado = "Vehiculo: " + vehiculo.getNombre() + " Matricula: " + vehiculo.getMatricula();
        if (estacionado) {
            estado += " - Está estacionado en Garage: " + garageAsignado.getNumGarage();
            estado += " - Garage es: " + (garageEsComprado ? "Comprado y propiedad del socio" : "Alquilado para esta ocasión");
            estado += " - Fecha asignado: " + fechaAsignado;
        } else {
            estado += " - No está estacionado el vehículo.";
        }
        return "Socio: " + socio.getNombre() + " | Estado: " + estado;
    }
    
}
