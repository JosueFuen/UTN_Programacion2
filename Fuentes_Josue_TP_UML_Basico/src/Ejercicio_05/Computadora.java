
package Ejercicio_05;


public class Computadora {
    private String marca;
    private String numeroSerie;
    private Propietario propietario;
    private PlacaMadre placaMadre;
    
    public Computadora(String marca, String numeroSerie, String modelo,String chipset){
        this.marca=marca;
        this.numeroSerie=numeroSerie;
        this.placaMadre=new PlacaMadre(modelo, chipset);
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
        if(propietario!=null && propietario.getComputadora()!=this){
            propietario.setComputadora(this);
        }
    }
    public void mostrarPropietario(){
        if(propietario!=null){
            System.out.println("Propietario: "+propietario.getNombre()+" - DNI: "+propietario.getDni());
        }else{
            System.out.println("No tiene propietario asignado");
        }
    }
    public void mostrarPlacaMadre(){
        if(placaMadre!=null){
            System.out.println("Placa Madre: "+placaMadre.getModelo()+" - Chipset: "+placaMadre.getChipset());
        }else{
            System.out.println("No tiene placa madre asignada");
        }
    }

    public String getMarca() {
        return marca;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public PlacaMadre getPlacaMadre() {
        return placaMadre;
    }

    @Override
    public String toString() {
        return "Computadora [marca=" + marca + ", numeroSerie=" + numeroSerie + "]";
    }
    
    
}
