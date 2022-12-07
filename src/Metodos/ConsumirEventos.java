/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Metodos;

import javax.swing.JOptionPane;

/**
 *
 * @author said_
 */
public class ConsumirEventos {
    
    public void consumirNumeros(java.awt.event.KeyEvent evt){ 
        if((evt.getKeyChar()==32)||!(evt.getKeyChar()<48 || evt.getKeyChar()>57)){
           evt.consume();
        }
    }
    
    public void consumirCaracteresEspeciales(java.awt.event.KeyEvent evt){
        if(!((evt.getKeyChar()==32)||(evt.getKeyChar() >= 48 && evt.getKeyChar() <=57)||(evt.getKeyChar() >= 65 && evt.getKeyChar() <= 90) || (evt.getKeyChar() >= 97 && evt.getKeyChar() <= 122))){
            evt.consume();
        }
    }
    
    public void ConsumirLetras(java.awt.event.KeyEvent evt){
        if(!(evt.getKeyChar() >=48 && evt.getKeyChar() <=57 )){
            evt.consume();
        }
    }
}
