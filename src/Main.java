import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Producto> productos = new ArrayList<>(); // Lista para almacenar productos
        int opcion;

        do {
            System.out.println("\n--- Menú Principal ---");
            System.out.println("1. Crear Producto (Con todos los atributos)");
            System.out.println("2. Crear Producto (Solo con código y nombre)");
            System.out.println("3. Imprimir Datos de Todos los Productos");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    // Crear producto con todos los atributos
                    System.out.print("Ingrese el código: ");
                    int codigo = sc.nextInt();
                    System.out.print("Ingrese el nombre: ");
                    String nombre = sc.next();
                    System.out.print("Ingrese el precio: ");
                    double precio = sc.nextDouble();
                    System.out.print("Ingrese la cantidad: ");
                    int cantidad = sc.nextInt();
                    Producto producto1 = new Producto(codigo, nombre, precio, cantidad);
                    productos.add(producto1);
                    System.out.println("Producto creado y agregado a la lista.");
                    break;

            

                case 2:
                    // Imprimir datos de todos los productos
                    if (!productos.isEmpty()) {
                        System.out.println("\nDatos de todos los productos:");
                        for (Producto producto : productos) {
                            producto.imprimirDatos();
                            System.out.println(); // Línea en blanco entre productos
                        }
                    } else {
                        System.out.println("No hay productos en la lista.");
                    }
                    break;

                case 3:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        } while (opcion != 4);

        sc.close();
    }
}
