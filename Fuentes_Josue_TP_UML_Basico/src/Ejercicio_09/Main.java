package Ejercicio_09;

public class Main {
    public static void main(String[] args) {
        Paciente paciente1 = new Paciente("Josue", "OSDE");
        Profesional profesional1 = new Profesional("Dr. Smith", "Cardiología");
        CitaMedica cita1 = new CitaMedica("2024-06-15", "10:00 AM");

        cita1.setPaciente(paciente1);
        cita1.setProfesional(profesional1);

        System.out.println(cita1);
        cita1.mostrarPaciente();
        cita1.mostrarProfesional();
    }

}
