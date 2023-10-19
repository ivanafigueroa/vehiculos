package vehiculos;

public class coche extends Vehiculo {
    public coche(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public double obtenerVelocidadMaxima() {
        return 120.0; 
    }
}