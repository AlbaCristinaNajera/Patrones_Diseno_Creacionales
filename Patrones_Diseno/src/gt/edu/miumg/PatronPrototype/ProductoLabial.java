package gt.edu.miumg.PatronPrototype;

public class ProductoLabial implements Cloneable{
    private String nombre;
    private String Tono;
    private double precio;

    public ProductoLabial(String nombre, String tono, double precio) {
        this.nombre = nombre;
        this.Tono = tono;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTono() {
        return Tono;
    }

    public void setTono(String tono) {
        this.Tono = tono;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    protected ProductoLabial clone() throws CloneNotSupportedException {
        return (ProductoLabial) super.clone();
    }

    @Override
    public String toString() {
        return "ProductoMaquillaje \n" +
                "Nombre: " + nombre + ", \n" +
                "Tono: " + Tono + ", \n" +
                "Precio: Q" + precio ;
    }
}
