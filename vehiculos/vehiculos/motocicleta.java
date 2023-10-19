package vehiculos;

public class motocicleta extends Vehiculo {
    public motocicleta(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public double obtenerVelocidadMaxima() {
        return 150.0; 
    }
}