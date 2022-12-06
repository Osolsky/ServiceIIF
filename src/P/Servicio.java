/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P;

/**
 *
 * @author LCE I - 29
 */
public class Servicio {
    String ID;
    String Nombreservicio;
    String Descripcion;
    String Precio;

    public Servicio(String ID, String Nombreservicio, String Descripcion, String Precio) {
        this.ID = ID;
        this.Nombreservicio = Nombreservicio;
        this.Descripcion = Descripcion;
        this.Precio = Precio;
    }

    public Servicio() {
        
    }

    public String getID() {
        return ID;
    }

    public String getNombreservicio() {
        return Nombreservicio;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public String getPrecio() {
        return Precio;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setNombreservicio(String Nombreservicio) {
        this.Nombreservicio = Nombreservicio;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public void setPrecio(String Precio) {
        this.Precio = Precio;
    }
    
}
