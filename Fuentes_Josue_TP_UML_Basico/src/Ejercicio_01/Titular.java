package Ejercicio_01;

public class Titular {
    private String nombre;
    private String dni;
    private Pasaporte pasaporte;
    
    public Titular(String nombre, String dni){
        this.nombre=nombre;
        this.dni=dni;
    }
    public void setPasaporte(Pasaporte pasaporte){
        this.pasaporte=pasaporte;
        if(pasaporte != null && pasaporte.getTitular()!=this){
            pasaporte.setTitular(this);
        }

    }
    public Pasaporte getPasaporte(){
        return pasaporte;
    }    

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Titular{" + "nombre=" + nombre + ", dni=" + dni + ", pasaporte=" + pasaporte + '}';
    }
    
}
