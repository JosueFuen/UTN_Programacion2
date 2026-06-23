package Ejercicio_03;

public class Main {
    public static void main(String[] args){
        Autor autor=new Autor("Josue", "Neuquino");
        Editorial editorial= new Editorial("Mundo", "Los alerces 3311");
        Libro libro= new Libro("Harry Potter", "123456", editorial);
        libro.setAutor(autor);
        libro.setEditorial(editorial);

        System.out.println(libro);
        libro.mostrarAutor();
        libro.mostrarEditorial();
    }
}
