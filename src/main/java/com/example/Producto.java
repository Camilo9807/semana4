package com.example; // Paquete donde se encuentra la clase Producto

// Definición de la clase Producto
public class Producto {

    // Atributos privados de la clase Producto
    private String nombre; 
    private double precio; 
    private int stock; 

    // Constructor por defecto
    public Producto() {
        nombre = "Sin nombre"; 
        precio = 0; 
        stock = 0; 
    }

    // Constructor con parámetros para inicializar los atributos
    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre; 
        this.precio = precio; 
        this.stock = stock; 
    }

    // Método para obtener el nombre del producto
    public String getNombre() {
        return nombre; // Retorna el nombre del producto
    }

    // Método para establecer un nuevo nombre para el producto
    public void setNombre(String nombre) {
        this.nombre = nombre; // Actualiza el nombre del producto
    }

    // Método para obtener el precio del producto
    public double getPrecio() {
        return precio; // Retorna el precio del producto
    }

    // Método para establecer un nuevo precio para el producto
    public void setPrecio(double precio) {
        this.precio = precio; // Actualiza el precio del producto
    }

    // Método para obtener la cantidad en inventario del producto
    public int getStock() {
        return stock; // Retorna la cantidad de stock del producto
    }

    // Método para establecer una nueva cantidad de stock para el producto
    public void setStock(int stock) {
        this.stock = stock; // Actualiza la cantidad de stock del producto
    }
}
//hola mundo.