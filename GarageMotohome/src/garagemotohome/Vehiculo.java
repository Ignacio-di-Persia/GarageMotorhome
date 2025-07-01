package garagemotohome;

public class Vehiculo {
    protected String Matricula;
    protected String Nombre;
    protected String tipo;
    protected double Profundidad;
    protected double Ancho;
    protected boolean Estacionado;

    public Vehiculo(String Matricula, String Nombre, String tipo, double Profundidad, double Ancho, boolean Estacionado) {
        this.Matricula = Matricula;
        this.Nombre = Nombre;
        this.tipo = tipo;
        this.Profundidad = Profundidad;
        this.Ancho = Ancho;
        this.Estacionado = Estacionado;
    }
    
    //Getters and Setters
    public String getMatricula() {
        return Matricula;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public double getProfundidad() {
        return Profundidad;
    }

    public double getAncho() {
        return Ancho;
    }

    public boolean estaEstacionado() {
        return Estacionado;
    }

    public void setEstacionado(boolean estacionado) {
        this.Estacionado = estacionado;
    }

    
    
    // Validar si puede entrar en un garage
    public boolean puedeEstacionarEn(Garage garage) {
        return !garage.estaOcupado() &&
               this.Profundidad <= garage.getProfundidad() &&
               this.Ancho <= garage.getAncho();
    }
    
    @Override
    public String toString() {
        return "Vehiculo:\n  " 
                + "+Matricula: " + Matricula + "\n  "
                + "+Nombre: " + Nombre + "\n  "
                + "+tipo: " + tipo + "\n  "
                + "+Profundidad: " + Profundidad + "\n  "
                + "+Ancho: " + Ancho + "\n  "
                + "+Estacionado: " + Estacionado+"]\n";
    }
    
    
}
