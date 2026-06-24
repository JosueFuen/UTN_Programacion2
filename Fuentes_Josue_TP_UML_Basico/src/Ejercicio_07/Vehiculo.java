package Ejercicio_07;

public class Vehiculo {
    private String patente;
    private String modelo;
    private Motor motor;
    private Conductor conductor;

    public Vehiculo(String patente, String modelo, Motor motor){
        this.patente= patente;
        this.modelo=modelo;
        this.motor=motor;
    }
    public void setConductor(Conductor conductor){
        this.conductor=conductor;
        if(conductor!=null && conductor.getVehiculo()!=this){
            conductor.setVehiculo(this);
        }
    }
    public void mostrarMotor(){
        if(motor!=null){
            System.out.println("Motor: "+motor.getTipo()+"(Numero de serie: "+motor.getNumeroSerie()+")");
        }else{
            System.out.println("El vehiculo no tiene motor asignado");
        }
    }
    public void mostrarConductor(){
        if(conductor!=null){
            System.out.println("Conductor: "+conductor.getNombre()+" (Licencia: "+conductor.getLicencia()+")");
        }else{
            System.out.println("El vehiculo no tiene conductor asignado");
        }
    }
    public String getPatente() {
        return patente;
    }
    public String getModelo() {
        return modelo;
    }
    public Motor getMotor() {
        return motor;
    }
    public Conductor getConductor() {
        return conductor;
    }
    @Override
    public String toString() {
        return "Vehiculo [patente=" + patente + ", modelo=" + modelo + "]";
    }
    
}
