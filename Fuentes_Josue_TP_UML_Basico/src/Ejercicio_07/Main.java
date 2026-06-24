package Ejercicio_07;

public class Main {
    public static void main(String[] args) {
        Motor motor1 = new Motor("Electrico", "123456789");
        Conductor conductor1 = new Conductor("Josue", "ABC123");
        Vehiculo vehiculo1 = new Vehiculo("AB123CD", "Toyota Corolla", motor1);
        vehiculo1.setConductor(conductor1);

        System.out.println(vehiculo1);
        vehiculo1.mostrarMotor();
        vehiculo1.mostrarConductor();
    }

}
