public class Producto {
    private String nombre;
    private int cantidad;
    private double precio;

    // Constructor
    public Producto(String nombre, int cantidad, double precio) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    // Métodos getters y setters
    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    // Método toString para imprimir la información del producto
    @Override
    public String toString() {
        return "Producto [Nombre=" + nombre + ", Cantidad=" + cantidad + ", Precio=" + precio + "]";
    }
}
// este si 