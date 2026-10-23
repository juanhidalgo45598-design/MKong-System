
package com.mycompany.mkong;

/**
 *
 * @author HIDALGOCALEROJUANSEB
 */
public class Cliente {
    
    private int id_cliente;
    private String nombre;
    private String t_documento;
    private int num_doc;
    private String telefono_cli;

    public Cliente(int id_cliente, String nombre, String t_documento, int num_doc, String telefono_cli) {
        this.id_cliente = id_cliente;
        this.nombre = nombre;
        this.t_documento = t_documento;
        this.num_doc = num_doc;
        this.telefono_cli = telefono_cli;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getT_documento() {
        return t_documento;
    }

    public void setT_documento(String t_documento) {
        this.t_documento = t_documento;
    }

    public int getNum_doc() {
        return num_doc;
    }

    public void setNum_doc(int num_doc) {
        this.num_doc = num_doc;
    }

    public String getTelefono_cli() {
        return telefono_cli;
    }

    public void setTelefono_cli(String telefono_cli) {
        this.telefono_cli = telefono_cli;
    }


    
    
    
}
