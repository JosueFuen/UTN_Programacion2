package Ejercicio_14;

public class EditorVideo {
    
    public void exportar(String formato, Proyecto proyecto) {
        Render renderizacion = new Render(formato, proyecto);
        System.out.println("Exportando proyecto en formato: " + renderizacion.getFormato());
    }
}