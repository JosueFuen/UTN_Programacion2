package Ejercicio_08;

public class Main {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Josue", "josue@gmail.com");
        Documento documento1 = new Documento("Oficio 49581/2026", "Oficio Judicial", "abc123", "2024-06-01", usuario1);

        System.out.println(documento1);
        documento1.mostrarFirmaDigital();
    }
}
