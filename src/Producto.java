
public class Producto {
    // Atributos encapsulados
    private int codigo;     // aca identificaremos el nombre del producto
    private String nombre;  //Nombre del producto
    private double precio;   // Precio del producto
    private int cantidad;   // Cantidad Para el Gasto

   //iniciaremos con un Constructor con parámetros para inicializar los atributos directamente
    public Producto() {
        this.codigo = 0;
        this.nombre = "Desconocido";
        this.precio = 0.0;
        this.cantidad = 0;
    }

    // Constructor con 'codigo' y 'nombre'
    public Producto(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = 0.0;
        this.cantidad = 0;
    }

    // Constructor con todos los atributos
    public Producto(int codigo, String nombre, double precio, int cantidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    //  usaremos un getter and setter para acceso controlado a los atributos
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    // Método para imprimir los datos del producto
    public void imprimirDatos() {
        System.out.println("Código: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Cantidad: " + cantidad);
    }
}
