/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P;

/**
 *
 * @author LCE I - 29
 */
public class celulares {
    String ID;
    String Telefono;
    String Propietario;
    String Orden;

    public celulares(String ID, String Telefono, String Propietario, String Orden) {
        this.ID = ID;
        this.Telefono = Telefono;
        this.Propietario = Propietario;
        this.Orden = Orden;
    }

    public celulares() {
        
    }

    public String getID() {
        return ID;
    }

    public String getTelefono() {
        return Telefono;
    }

    public String getPropietario() {
        return Propietario;
    }

    public String getOrden() {
        return Orden;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public void setPropietario(String Propietario) {
        this.Propietario = Propietario;
    }

    public void setOrden(String Orden) {
        this.Orden = Orden;
    }
    
}
