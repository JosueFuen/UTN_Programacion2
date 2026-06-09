package Ejercicio_01;

public class Pasaporte {
    private String numero;
    private String fechaEmision;
    private Foto foto;
    private Titular titular;

    public Pasaporte(String numero, String fechaEmision, String imagen, String formato ){
        this.numero=numero;
        this.fechaEmision=fechaEmision;
        this.foto= new Foto(imagen, formato);
    }
    public void setTitular(Titular titular){
        this.titular=titular;
        if(titular!=null && titular.getPasaporte() !=this){
            titular.setPasaporte(this);
        }
    
    }
    public Titular getTitular(){
        return titular;
    }

    public String getNumero() {
        return numero;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public Foto getFoto() {
        return foto;
    }

    @Override
    public String toString() {
        return "Pasaporte{" + "numero=" + numero + ", fechaEmision=" + fechaEmision + ", foto=" + foto + ", titular=" + titular + '}';
    }
    
}
