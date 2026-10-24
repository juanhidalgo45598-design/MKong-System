package com.mycompany.mkong;

/**
 *
 * @author HIDALGOCALEROJUANSEB
 */
public class Insumo {
    private int id_insumo;
    private String nombreInsumos;
    private String unidadMedida;
    private double stockActual;
    private double stockMinimo;

    public Insumo(int id_insumo, String nombreInsumos, String unidadMedida, double stockActual, double stockMinimo) {
        this.id_insumo = id_insumo;
        this.nombreInsumos = nombreInsumos;
        this.unidadMedida = unidadMedida;
        this.stockActual = stockActual;
        this.stockMinimo = stockMinimo;
    }

    public int getId_insumo() {
        return id_insumo;
    }

    public void setId_insumo(int id_insumo) {
        this.id_insumo = id_insumo;
    }

    public String getNombreInsumos() {
        return nombreInsumos;
    }

    public void setNombreInsumos(String nombreInsumos) {
        this.nombreInsumos = nombreInsumos;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public double getStockActual() {
        return stockActual;
    }

    public void setStockActual(double stockActual) {
        this.stockActual = stockActual;
    }

    public double getStockMinimo() {
        return stockMinimo;
    }

    public void setStockMinimo(double stockMinimo) {
        this.stockMinimo = stockMinimo;
    }
    
    
    
}
