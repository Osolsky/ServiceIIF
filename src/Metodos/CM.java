/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Metodos;
import P.catalogom;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CM {
    Vector vPrincipal = new Vector();
    public void Guardar(catalogom uncatalogom){
        vPrincipal.addElement(uncatalogom);
        
    }
    public void GuardarArchivo(catalogom catalogom){
        try{
            FileWriter fw = new FileWriter("Catalogo.txt",true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.print(catalogom.getID());
           pw.print("|"+catalogom.getNombrem());
            pw.println("|"+catalogom.getCatalogom());
          
           pw.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public DefaultTableModel listaCatalogo(){
Vector cabeceras = new Vector();
cabeceras.addElement("ID");
cabeceras.addElement("Nombre Catalogo");
cabeceras.addElement("Modelo Catalogo");



DefaultTableModel mdlTable = new DefaultTableModel(cabeceras,0);
try{
    FileReader fr = new FileReader("Catalogo.txt");
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
