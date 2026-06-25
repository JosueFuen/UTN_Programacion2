package Ejercicio_14;

public class Main {
    public static void main(String[] args) {
        Proyecto proyecto= new Proyecto("Nuevo proyecto", 60);
        EditorVideo editorVideo= new EditorVideo();

        editorVideo.exportar("Clasico", proyecto);
    }
}
