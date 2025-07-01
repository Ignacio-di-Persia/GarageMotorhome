package garagemotohome;

public class Garage {
   protected int numGarage;
   protected int ContadorLuz;
   protected double Profundidad;
   protected double Ancho;
   protected boolean Servicios;
   private boolean Ocupado;

    public Garage(int numGarage, int ContadorLuz, double Profundidad, double Ancho, boolean Servicios, boolean Ocupado) {
        this.numGarage = numGarage;
        this.ContadorLuz = ContadorLuz;
        this.Profundidad = Profundidad;
        this.Ancho = Ancho;
        this.Servicios = Servicios;
        this.Ocupado = Ocupado;
    }

   //getters and setters
public int getNumGarage() {
        return numGarage;
    }

    public int getContadorLuz() {
        return ContadorLuz;
    }

    public double getProfundidad() {
        return Profundidad;
    }

    public double getAncho() {
        return Ancho;
    }

    public boolean tieneServicios() {
        return Servicios;
    }

    public boolean estaOcupado() {
        return Ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.Ocupado = ocupado;
    }
   
   
    @Override
    public String toString() {
        System.out.println(" ");
        return "Garage:\n  " 
                + "+numGarage: " + numGarage + "\n  "
                + "+ContadorLuz: " + ContadorLuz + "\n  "
                + "+Profundidad: " + Profundidad + "\n  "
                + "+Ancho: " + Ancho + "\n  "
                + "+Servicios: " + Servicios + "\n  "
                + "+Ocupado: " + Ocupado + "\n" ;
    }
   
   
}
