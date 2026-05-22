package Ejercicio_04;

public class Producto {
 
    private String nombre;
    private double precioBase;
    private static double IVA = 0.21; 

    public Producto(String nombre, double precioBase) {
        setNombre(nombre);
        setPrecioBase(precioBase);  
    }
 
    public Producto(String nombre) {
        this(nombre, 100.0); 
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        }
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        if (precioBase >= 0) {
            this.precioBase = precioBase;
        } else {
            this.precioBase = 100.0 ;
            System.out.println("Error: El precio base no puede ser negativo.");
        }
    }

    public static double getIVA() {
        return IVA;
    }

    
    public static void cambiarIVA(double nuevoIVA) {
        if (nuevoIVA >= 0) {
            Producto.IVA = nuevoIVA;
        } else {
            System.out.println("Error: El IVA no puede ser un valor negativo.");
        }
    }

    public double calcularPrecioFinal() {
        return this.precioBase * (1 + Producto.IVA);
    }


    public void aplicarDescuento(double porcentaje) {
        if (porcentaje > 0 && porcentaje <= 100) {
            this.precioBase -= this.precioBase * (porcentaje / 100);
        } else {
            System.out.println("Error: Porcentaje de descuento inválido.");
        }
    }

    public void aplicarDescuento(double porcentaje, double precioMinimo) {
        if (porcentaje > 0 && porcentaje <= 100) {
            double precioCalculado = this.precioBase - (this.precioBase * (porcentaje / 100));
             
            if (precioCalculado < precioMinimo) {
                this.precioBase = precioMinimo;
            } else {
                this.precioBase = precioCalculado;
            }
        } else {
            System.out.println("Error: Porcentaje de descuento inválido.");
        }
    }

    @Override
    public String toString() {
        return "Producto \nNombre del producto: "+nombre+"\nPrecio inicial: " + precioBase + "\nPrecio final: " + calcularPrecioFinal() + "\n------------------";
}
}