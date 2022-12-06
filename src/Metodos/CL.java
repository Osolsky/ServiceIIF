/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Metodos;

import P.clientes;
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
 * @author LCE I - 29
 */
public class CL {
    Vector vPrincipal = new Vector();
    public void Guardar(clientes uncliente){
        vPrincipal.addElement(uncliente);
        
    }
    public void GuardarArchivo(clientes clientes){
        try{
            FileWriter fw = new FileWriter("Cliente.txt",true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
              pw.print(clientes.getID());
            pw.print("|"+clientes.getNombre());
        
           pw.print("|"+clientes.getApellidoPaterno());
            pw.print("|"+clientes.getDireccion());
           pw.println("|"+clientes.getCelular());
          
         
           pw.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public DefaultTableModel listaCatalogo(){
Vector cabeceras = new Vector();
cabeceras.addElement("ID");
cabeceras.addElement("Nombre");
cabeceras.addElement("Apellido Paterno");

cabeceras.addElement("Direccion");
cabeceras.addElement("Numero Celular");


DefaultTableModel mdlTable = new DefaultTableModel(cabeceras,0);
try{
    FileReader fr = new FileReader("Cliente.txt");
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
