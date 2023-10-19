package vehiculos;

public class Bicicleta extends Vehiculo {
    public Bicicleta(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public double obtenerVelocidadMaxima() {
             return 30.0; 
    }
}