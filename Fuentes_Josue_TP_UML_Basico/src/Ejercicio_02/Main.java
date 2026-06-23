package Ejercicio_02;

public class Main {
    public static void main(String[] args){
        Bateria bateria=new Bateria("XR3", 5000);
        Celular celular= new Celular("123456789", "Sasmung", "Galaxia", bateria);
        Usuario usuario= new Usuario("Josue", "40800700");
        celular.setUsuario(usuario);
        System.out.println(celular);
        System.out.println(usuario);

    }

}
