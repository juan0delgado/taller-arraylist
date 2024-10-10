import java.util.ArrayList;

public class Inventario {
    private ArrayList<Producto> productos;

    // Constructor
    public Inventario() {
        productos = new ArrayList<>();
    }

    // Método para agregar un producto al inventario
    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    // Método para mostrar el inventario completo
    public void mostrarInventario() {
        if (productos.isEmpty()) {
            System.out.println("El inventario está vacío.");
        } else {
            for (Producto p : productos) {
                System.out.println(p);
            }
        }
    }

    // Método para buscar un producto por su nombre
    public Producto buscarProducto(String nombre) throws Exception {
        for (Producto p : productos) {
            if (p.getNombre().equalsIgnoreCase(nombre)) {
                return p;
            }
        }
        throw new Exception("Producto no encontrado: " + nombre);
    }

    // Método para modificar la cantidad de un producto
    public void modificarCantidad(String nombre, int nuevaCantidad) {
        try {
            Producto p = buscarProducto(nombre);
            p.setCantidad(nuevaCantidad);
            System.out.println("Cantidad modificada: " + p);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
// este si 