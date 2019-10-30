/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import cjb.ci.Mensaje;
import clases.IMGtabla;
import clases.editTable;
import com.mysql.cj.Query;
import java.sql.Connection;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mosvi
 */
public class SqLProvedores {
  public void visualizar_tabla(JTable tabla,Connection con){
        Querys q = new Querys();
        DefaultTableModel atm=new editTable();
        String []titulo=new String[] {"id","Nombre","Direccion","No. Telefonico","Correo","Tipo Mercansia"};
         
         atm= q.SeleccionTable(con,"idprovedores, nombre_empresa, direccion, correo, telefono, mercancia","provedores","idprovedores = ?", titulo);
         
         
         tabla.setRowHeight(16);
         tabla.setModel(atm);
   
    }
   public void elimnar(JTable tabla,Connection con){
      Querys q = new Querys();
      try{
            String s1=q.Deleteentero(con,"provedores","idprovedores", String.valueOf(tabla.getValueAt(tabla.getSelectedRow(),0)));
            DefaultTableModel atm=(editTable) tabla.getModel();
           
                    if (s1 != null)
               {    
                   System.out.println("valio queso");
               } else
               {
                    System.out.println("Exito");
                    atm.removeRow(tabla.getSelectedRow());
                    tabla.setModel(atm);
                    //agregarProductos(cli.getModeloPro(),cli.getNombrePro(),cli.getPrecio(),cli.getExistencia(),cli.getCategoria(),cli.getProvedMarca(),jf.getSelectedFile().getAbsolutePath().replace("\\","/"));
               }
                    
      }catch(Exception e){
          
      }
      
  }
  public void modificar(JTable tabla,Connection con){
      
                tabla.addKeyListener(new java.awt.event.KeyAdapter() {
                public void tablakeyReleased(java.awt.event.KeyEvent evt) {
                    
                }
            });
        
                       
                            
  }
 
}
