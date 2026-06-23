package Ejercicio_03;

public class Autor {
    private String nombre;
    private String nacionalidad;
    
    public Autor(String nombre, String nacionalidad){
        this.nombre=nombre;
        this.nacionalidad=nacionalidad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDireccion() {
        return nacionalidad;
    }
    public void setDireccion(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    @Override
    public String toString() {
        return "Autor [nombre=" + nombre + ", nacionalidad=" + nacionalidad + "]";
    }
    


}
