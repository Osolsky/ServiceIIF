/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 package Metodos;

import P.Servicio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
/**
 *
 * @author LCE I - 29
 */
public class SR {
    Vector vPrincipal = new Vector();
    public void Guardar(Servicio unServicio){
        vPrincipal.addElement(unServicio);
        
    }
    public void GuardarArchivo(Servicio Servicio){
        try{
            FileWriter fw = new FileWriter("Servicio.txt",true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.print(Servicio.getID());
           pw.print("|"+Servicio.getDescripcion());
           pw.print("|"+Servicio.getNombreservicio());
           pw.println("|"+Servicio.getPrecio());

           
           pw.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public DefaultTableModel listaCatalogo(){
Vector cabeceras = new Vector();
cabeceras.addElement("ID");
cabeceras.addElement("Descripcion");
cabeceras.addElement("Nombre DEl Servicio");
cabeceras.addElement("Precio");



DefaultTableModel mdlTable = new DefaultTableModel(cabeceras,0);
try{
    FileReader fr = new FileReader("Servicio.txt");
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


