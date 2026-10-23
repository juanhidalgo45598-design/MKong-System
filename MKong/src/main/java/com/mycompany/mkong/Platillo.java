
package com.mycompany.mkong;

/**
 *
 * @author HIDALGOCALEROJUANSEB
 */
public class Platillo {
    
    private int id_platillo;
    private String nombre;
    private double precio;
    private boolean disponible;

    public Platillo(int id_platillo, String nombre, double precio, boolean disponible) {
        this.id_platillo = id_platillo;
        this.nombre = nombre;
        this.precio = precio;
        this.disponible = disponible;
    }

    public int getId_platillo() {
        return id_platillo;
    }

    public void setId_platillo(int id_platillo) {
        this.id_platillo = id_platillo;
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

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
    
    
    
    
            
    
    
}
