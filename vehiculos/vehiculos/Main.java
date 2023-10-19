package vehiculos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Qué tipo de vehículo te interesa? (coche/motocicleta/bicicleta): ");
        String tipoVehiculo = sc.next();

        Vehiculo vehiculo = null;

        switch (tipoVehiculo.toLowerCase()) {
            case "coche":
                vehiculo = new coche("Toyota", "Corolla");
                break;
            case "motocicleta":
                vehiculo = new motocicleta("Honda", "CBR500R");
                break;
            case "bicicleta":
                vehiculo = new Bicicleta("Trek", "FX3");
                break;
            default:
                System.out.println("Tipo de vehículo no reconocido.");
                sc.close();
                return;
        }

        System.out.println("Velocidad máxima de " + vehiculo.getMarca() + " " + vehiculo.getModelo() + ": " +
                vehiculo.obtenerVelocidadMaxima() + " km/h");

        sc.close();
    }
}