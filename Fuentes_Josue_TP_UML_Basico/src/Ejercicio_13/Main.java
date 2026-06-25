package Ejercicio_13;

public class Main {
    public static void main(String[] args) {
        Usuario usuario= new Usuario("Josue", "JosueF@gmail.com");
        GeneradorQR generadorQR= new GeneradorQR();
        generadorQR.generar("423487", usuario);
    }
}
