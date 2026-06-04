/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_02;

/**
 *
 * @author fosue
 */
public class Celular {
    private String imei;
    private String marca;
    private String modelo;
    private Usuario usuario;
    private Bateria bateria;
    
    public Celular(String imei, String marca, String modelo){
        this.imei=imei;
        this.marca=marca;
        this.modelo=modelo;
    }
    public void setUsuario(Usuario usuario){
        this.usuario=usuario;
        if(usuario!=null && usuario.getCelular()!=this){
            usuario.setCelular(this);
        }
    }
    public Usuario getUsuario(){
        return usuario;
    }
    public void setBateria(Bateria bateria){
        this.bateria=bateria;
    }

    public String getImei() {
        return imei;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Bateria getBateria() {
        return bateria;
    }
    
}
