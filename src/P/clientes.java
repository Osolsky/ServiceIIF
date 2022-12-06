/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P;

/**
 *
 * @author LCE I - 29
 */
public class clientes {
    String ID;
    String Nombre;
    String ApellidoMaterno;
    String ApellidoPaterno;
    String Direccion;
    String Celular;

    public clientes(String ID, String Nombre, String ApellidoMaterno, String ApellidoPaterno, String Direccion, String Celular) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.ApellidoMaterno = ApellidoMaterno;
        this.ApellidoPaterno = ApellidoPaterno;
        this.Direccion = Direccion;
        this.Celular = Celular;
    }

    public clientes() {
       
    }

    public String getID() {
        return ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellidoMaterno() {
        return ApellidoMaterno;
    }

    public String getApellidoPaterno() {
        return ApellidoPaterno;
    }

    public String getDireccion() {
        return Direccion;
    }

    public String getCelular() {
        return Celular;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellidoMaterno(String ApellidoMaterno) {
        this.ApellidoMaterno = ApellidoMaterno;
    }

    public void setApellidoPaterno(String ApellidoPaterno) {
        this.ApellidoPaterno = ApellidoPaterno;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public void setCelular(String Celular) {
        this.Celular = Celular;
    }
    
}
