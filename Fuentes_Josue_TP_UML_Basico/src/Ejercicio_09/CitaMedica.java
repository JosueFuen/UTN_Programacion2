package Ejercicio_09;

public class CitaMedica {
    private String fecha;
    private String hora;
    private Paciente paciente;
    private Profesional profesional;

    public CitaMedica(String fecha, String hora) {
        this.fecha = fecha;
        this.hora = hora;
    }
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    public void setProfesional(Profesional profesional) {
        this.profesional = profesional;
    }
    public void mostrarPaciente() {
        if (paciente != null) {
            System.out.println("Paciente: " + paciente.getNombre() + ", Obra Social: " + paciente.getObraSocial());
        } else {
            System.out.println("No hay paciente asignado.");
        }
    }
    public void mostrarProfesional() {
        if (profesional != null) {
            System.out.println("Profesional: " + profesional.getNombre() + ", Especialidad: " + profesional.getEspecialidad());
        } else {
            System.out.println("No hay profesional asignado.");
        }
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
    @Override
    public String toString() {
        return "CitaMedica [fecha=" + fecha + ", hora=" + hora + "]";
    }

}
