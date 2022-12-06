/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Metodos;

import P.ordent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ensamble
 */
public class OT {
    Vector vPrincipal = new Vector();
    public void Guardar(ordent unaorden){
        vPrincipal.addElement(unaorden);
        
    }
    public void GuardarArchivo(ordent ordent){
        try{
            FileWriter fw = new FileWriter("Orden.txt",true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.print(ordent.getID());
           pw.print("|"+ordent.getCliente());
           pw.print("|"+ordent.getEntrega());
           pw.print("|"+ordent.getFalla());
pw.print("|"+ordent.getServicio());
pw.println("|"+ordent.getTelefono());
           
           pw.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public DefaultTableModel listaCatalogo(){
Vector cabeceras = new Vector();
cabeceras.addElement("ID");
cabeceras.addElement("Cliente");
cabeceras.addElement("Entrega");
cabeceras.addElement("Falla");
cabeceras.addElement("Servicio");
cabeceras.addElement("Telefono");




DefaultTableModel mdlTable = new DefaultTableModel(cabeceras,0);
try{
    FileReader fr = new FileReader("Orden.txt");
   BufferedReader br = new BufferedReader(fr); 
  String d;
  while((d=br.readLine())!=null){
      StringTokenizer dato = new StringTokenizer(d,"|");
      Vector x = new Vector();
      while(dato.hasMoreTokens()){
          x.addElement(dato.nextToken());
      }
      mdlTable.addRow(x);
  }
}catch(Exception e){
  JOptionPane.showMessageDialog(null, e);   
}
return mdlTable;
}

  
}