/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BDnegocio;

import java.util.Scanner;

public class newProduct {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("*****************************************");
            System.out.println("**********      Menú principal    ********");
            System.out.println("*****************************************");
            System.out.println("1.....Ingresar producto");
            System.out.println("2.....Mostrar productos");
            System.out.println("3.....Buscar producto");
            System.out.println("4.....Modificar producto");
            System.out.println("5.....Eliminar producto");
            System.out.println("6.....Salir del menu principal");
            System.out.println("Seleccione una opción del menú:");

            opcion = scanner.nextInt();
            scanner.nextLine();  // Consumir nueva línea

            switch (opcion) {
                case 1:
                    ingresarProducto(scanner);
                    break;
                case 2:
                    Producto.listarProductos();
                    break;
                case 3:
                    buscarProducto(scanner);
                    break;
                case 4:
                    modificarProducto(scanner);
                    break;
                case 5:
                    eliminarProducto(scanner);
                    break;
                case 6:
                    System.out.println("Saliendo del menú...");
                    break;
                default:
                    System.out.println("Opción no válida, por favor intente nuevamente.");
                    break;
            }

        } while (opcion != 6);
        
        scanner.close();
    }

    // Método para ingresar un nuevo producto
    private static void ingresarProducto(Scanner scanner) {
        System.out.println("Ingrese el código del producto:");
        String codigo = scanner.nextLine();
        System.out.println("Ingrese el nombre del producto:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el precio del producto:");
        double precio = scanner.nextDouble();
        System.out.println("Ingrese la cantidad del producto:");
        int cantidad = scanner.nextInt();
        scanner.nextLine();  // Consumir nueva línea
        System.out.println("Ingrese la fecha de vencimiento (YYYY-MM-DD):");
        String fecha = scanner.nextLine();

        Producto.insertarProducto(codigo, nombre, precio, cantidad, fecha);
    }

    // Método para buscar un producto por código (esto puedes ajustarlo según tu necesidad)
    private static void buscarProducto(Scanner scanner) {
        System.out.println("Ingrese el código del producto que desea buscar:");
        String codigo = scanner.nextLine();
        // Aquí puedes implementar la lógica para buscar el producto y mostrarlo
        // Por ejemplo, podrías agregar un método en la clase Producto que haga esta búsqueda.
        System.out.println("Función buscar producto aún no implementada.");
    }

    // Método para modificar un producto
    private static void modificarProducto(Scanner scanner) {
        System.out.println("Ingrese el código del producto que desea modificar:");
        String codigo = scanner.nextLine();
        System.out.println("Ingrese el nuevo nombre del producto:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el nuevo precio del producto:");
        double precio = scanner.nextDouble();

        Producto.actualizarProducto(codigo, nombre, precio);
    }

    // Método para eliminar un producto
    private static void eliminarProducto(Scanner scanner) {
        System.out.println("Ingrese el código del producto que desea eliminar:");
        String codigo = scanner.nextLine();

        Producto.eliminarProducto(codigo);
    }
}
