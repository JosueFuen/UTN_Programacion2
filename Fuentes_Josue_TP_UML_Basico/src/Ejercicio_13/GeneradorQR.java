package Ejercicio_13;

public class GeneradorQR {
    
    public void generar(String valor, Usuario usuario) {
        CodigoQR codigoQR = new CodigoQR(valor, usuario);
        System.out.println("Se generó el QR con valor: " + codigoQR.getValor());
    }
}