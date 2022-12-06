/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P;

/**
 *
 * @author LCE I - 29
 */
public class ordent {
    String ID;
    String Falla;
    String Cliente;
    String Telefono;
    String Entrega;
    String Servicio;

    public ordent(String ID, String Falla, String Cliente, String Telefono, String Entrega, String Servicio) {
        this.ID = ID;
        this.Falla = Falla;
        this.Cliente = Cliente;
        this.Telefono = Telefono;
        this.Entrega = Entrega;
        this.Servicio = Servicio;
    }

    public ordent() {
       
    }

    public String getID() {
        return ID;
    }

    public String getFalla() {
        return Falla;
    }

    public String getCliente() {
        return Cliente;
    }

    public String getTelefono() {
        return Telefono;
    }

    public String getEntrega() {
        return Entrega;
    }

    public String getServicio() {
        return Servicio;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setFalla(String Falla) {
        this.Falla = Falla;
    }

    public void setCliente(String Cliente) {
        this.Cliente = Cliente;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public void setEntrega(String Entrega) {
        this.Entrega = Entrega;
    }

    public void setServicio(String Servicio) {
        this.Servicio = Servicio;
    }
    
}
