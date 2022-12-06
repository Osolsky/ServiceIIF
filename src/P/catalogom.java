/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P;

/**
 *
 * @author LCE I - 29
 */
public class catalogom {
    String ID;
    String Nombrem;
    String Catalogom;

    public catalogom(String ID, String Nombrem, String Catalogom) {
        this.ID = ID;
        this.Nombrem = Nombrem;
        this.Catalogom = Catalogom;
    }

    public catalogom() {
    }

    public String getID() {
        return ID;
    }

    public String getNombrem() {
        return Nombrem;
    }

    public String getCatalogom() {
        return Catalogom;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setNombrem(String Nombrem) {
        this.Nombrem = Nombrem;
    }

    public void setCatalogom(String Catalogom) {
        this.Catalogom = Catalogom;
    }

   
    
}
