package com.example;

public class Main {
    public static void main(String[] args) {
        Producto producto1 = new Producto();
        System.out.println("Producto 1: " + producto1.getNombre() + ", Precio: " + producto1.getPrecio() + ", Stock: " + producto1.getStock());

        // Crear un objeto Producto usando el constructor con parámetros
        Producto producto2 = new Producto("Laptop", 1700.0, 10);
        System.out.println("Producto 2: " + producto2.getNombre() + ", Precio: " + producto2.getPrecio() + ", Stock: " + producto2.getStock());

        // Modificar el precio del producto2
        producto2.setPrecio(1400.0);
        System.out.println("Producto 2 (modificado): " + producto2.getNombre() + ", Precio: " + producto2.getPrecio() + ", Stock: " + producto2.getStock());

    }
}