/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mkong;

/**
 *
 * @author HIDALGOCALEROJUANSEB
 */
public class Mesa {
    
    private int id_mesa;
    private int nro_mesa;
    private int capacidad;
    private boolean estados;

    public Mesa(int id_mesa, int nro_mesa, int capacidad, boolean estados) {
        this.id_mesa = id_mesa;
        this.nro_mesa = nro_mesa;
        this.capacidad = capacidad;
        this.estados = estados;
    }

    public int getId_mesa() {
        return id_mesa;
    }

    public void setId_mesa(int id_mesa) {
        this.id_mesa = id_mesa;
    }

    public int getNro_mesa() {
        return nro_mesa;
    }

    public void setNro_mesa(int nro_mesa) {
        this.nro_mesa = nro_mesa;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public boolean isEstados() {
        return estados;
    }

    public void setEstados(boolean estados) {
        this.estados = estados;
    }
    
    
    
}
