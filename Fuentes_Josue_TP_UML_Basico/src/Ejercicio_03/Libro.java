package Ejercicio_03;

public class Libro {
    private String titulo;
    private String isbn;
    private Editorial editorial;
    private Autor autor;

    public Libro (String titulo, String isbn, Editorial editorial){
        this.titulo=titulo;
        this.isbn=isbn;
        this.editorial=editorial;
    }

    public void mostrarAutor() {
        if(editorial!=null){
            System.out.println("El autor del libro es: "+ autor.getNombre());
        }
        else{
            System.out.println("El libro no tiene autor");
        }
    }
    public void mostrarEditorial() {
        if(editorial!=null){
            System.out.println("La editorial del libro es: "+ editorial.getNombre());
        }
        else{
            System.out.println("El libro no tiene editorial");
        }
    }
    public void setEditorial (Editorial editorial){
        this.editorial=editorial;
    }
    public void setAutor (Autor autor){
        this.autor=autor;
        
    }

    public String getTitulo() {
        return titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    
    public Autor getAutor() {
        return autor;
    }
    public Editorial getEditorial() {
        return editorial;
    }
    @Override
    public String toString() {
        return "Libro [titulo=" + titulo + ", isbn=" + isbn + "]";
    }

    

}
