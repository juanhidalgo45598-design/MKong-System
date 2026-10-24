package com.mycompany.mkong;

/**
 *
 * @author HIDALGOCALEROJUANSEB
 */
public class Receta {
    private int idReceta;
    private Platillo id_platillo;
    private Insumo id_insumo;
    private double cantidadUsada;

    public Receta(int idReceta, Platillo id_platillo, Insumo id_insumo, double cantidadUsada) {
        this.idReceta = idReceta;
        this.id_platillo = id_platillo;
        this.id_insumo = id_insumo;
        this.cantidadUsada = cantidadUsada;
    }

    public int getIdReceta() {
        return idReceta;
    }

    public void setIdReceta(int idReceta) {
        this.idReceta = idReceta;
    }

    public Platillo getId_platillo() {
        return id_platillo;
    }

    public void setId_platillo(Platillo id_platillo) {
        this.id_platillo = id_platillo;
    }

    public Insumo getId_insumo() {
        return id_insumo;
    }

    public void setId_insumo(Insumo id_insumo) {
        this.id_insumo = id_insumo;
    }

    public double getCantidadUsada() {
        return cantidadUsada;
    }

    public void setCantidadUsada(double cantidadUsada) {
        this.cantidadUsada = cantidadUsada;
    }
    
    


    
}
