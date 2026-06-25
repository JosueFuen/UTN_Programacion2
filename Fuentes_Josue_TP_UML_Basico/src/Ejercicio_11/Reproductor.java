package Ejercicio_11;

public class Reproductor {
    
    public void reproducir(Cancion cancion) {
        if (cancion != null) {
            System.out.println("Reproduciendo: " + cancion.getTitulo() + ", Autor " + cancion.getArtista().getNombre());
        } else {
            System.out.println("No hay canción para reproducir.");
        }
    }
}