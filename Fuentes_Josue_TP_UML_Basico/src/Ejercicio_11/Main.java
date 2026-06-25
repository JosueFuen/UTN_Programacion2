package Ejercicio_11;

public class Main {
    public static void main(String[] args) {
        Artista artista=new Artista("Josue", "Rock");

        Cancion cancion= new Cancion("La vaca Lola");

        Reproductor reproductor= new Reproductor();

        cancion.setArtista(artista);

        reproductor.reproducir(cancion);
    }
}
