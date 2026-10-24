
package com.mycompany.mkong;

import java.time.LocalDateTime;
public class Lista_espera {
    
    private int id_listaespera;
    private int id_cliente;
    private int cant_personas;
    private DateTime hora_llegada;
    private String estado;
    private String tiempo_esti;
    private String observación;
    private Mesa id_mesa;

    public Lista_espera(int id_listaespera, int id_cliente, int cant_personas, DateTime hora_llegada, String estado, String tiempo_esti, String observación, Mesa id_mesa) {
        this.id_listaespera = id_listaespera;
        this.id_cliente = id_cliente;
        this.cant_personas = cant_personas;
        this.hora_llegada = hora_llegada;
        this.estado = estado;
        this.tiempo_esti = tiempo_esti;
        this.observación = observación;
        this.id_mesa = id_mesa;
    }

    public int getId_listaespera() {
        return id_listaespera;
    }

    public void setId_listaespera(int id_listaespera) {
        this.id_listaespera = id_listaespera;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getCant_personas() {
        return cant_personas;
    }

    public void setCant_personas(int cant_personas) {
        this.cant_personas = cant_personas;
    }

    public DateTime getHora_llegada() {
        return hora_llegada;
    }

    public void setHora_llegada(DateTime hora_llegada) {
        this.hora_llegada = hora_llegada;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTiempo_esti() {
        return tiempo_esti;
    }

    public void setTiempo_esti(String tiempo_esti) {
        this.tiempo_esti = tiempo_esti;
    }

    public String getObservación() {
        return observación;
    }

    public void setObservación(String observación) {
        this.observación = observación;
    }

    public Mesa getId_mesa() {
        return id_mesa;
    }

    public void setId_mesa(Mesa id_mesa) {
        this.id_mesa = id_mesa;
    }
    

    
}
