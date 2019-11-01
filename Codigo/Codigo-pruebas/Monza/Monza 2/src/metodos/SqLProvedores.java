/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import cjb.ci.Mensaje;
import clases.IMGtabla;
import clases.editTable;
import clases.editTabletrue;
import com.mysql.cj.Query;
import java.sql.Connection;
import javax.swing.JOptionPane;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mosvi
 */
public class SqLProvedores {
   public void visualizar_tabla(JTable tabla,Connection con){
        Querys q = new Querys();
        DefaultTableModel atm=new editTabletrue();
        String []titulo=new String[] {"id","Nombre","Direccion","Correo","No. Telefonico","Tipo Mercansia"};
         
         atm= q.SeleccionTable(con,"idprovedores, nombre_empresa, direccion, correo, telefono, mercancia","provedores","idprovedores = ?", titulo);
         
         
         tabla.setRowHeight(16);
         tabla.setModel(atm);
   
    }
  public void elimnar(JTable tabla,Connection con){
      Querys q = new Querys();
       
      try{
           
            String s1=q.Delete(con,"provedores","idprovedores", String.valueOf(tabla.getValueAt(tabla.getSelectedRow(),0)));
            DefaultTableModel atm = (editTabletrue) tabla.getModel(); 
                               
           
                    if (s1 != null)
               {    
                   System.out.println("valio queso");
               } else
               {
                    System.out.println("Exito");
                    System.out.println(tabla.getSelectedRow());
                    atm.removeRow(tabla.getSelectedRow());
                    tabla.setModel(atm);
                    //agregarProductos(cli.getModeloPro(),cli.getNombrePro(),cli.getPrecio(),cli.getExistencia(),cli.getCategoria(),cli.getProvedMarca(),jf.getSelectedFile().getAbsolutePath().replace("\\","/"));
               }
                    
      }catch(Exception e){
          
      }
      
  }

  public void modificar(JTable tabla,Connection con){
      
               
                         Querys p= new Querys();
                         DefaultTableModel atm = (editTabletrue) tabla.getModel(); 
                               
                        String valores =("'"+tabla.getValueAt(tabla.getSelectedRow(), 1).toString() + "',");
                                                        valores +=("'"+tabla.getValueAt(tabla.getSelectedRow(), 2).toString()+ "',");
                                                        valores += ("'"+tabla.getValueAt(tabla.getSelectedRow(), 3).toString() + "',");
                                                        valores += ("'"+tabla.getValueAt(tabla.getSelectedRow(), 4).toString() + "',");
                                                        valores += ("'"+tabla.getValueAt(tabla.getSelectedRow(), 5).toString()+"'");
                                                       
                        String columna="nombre_empresa,direccion,correo,telefono,mercancia";
                
                //jTablex.setValueAt(modifi(jTFmateria.getText(),primer,segundo,promedio,ordinario,extraordinario,titulo,generator),jTablex.getSelectedRow(),);
                
                        String s1=p.Modificar(con,"provedores", columna, valores,"idprovedores='"+tabla.getValueAt(tabla.getSelectedRow(), 0).toString()+"'");  
                                    if (s1 != null)
                        {    
                            System.out.println("valio queso");
                              JOptionPane.showMessageDialog(null,"Upss! ha ocurrido un error al modificar el campo"+s1,"Error", JOptionPane.ERROR_MESSAGE);
                        } else
                        {
                                 
                                 tabla.setModel(atm);
                             //agregarProductos(cli.getModeloPro(),cli.getNombrePro(),cli.getPrecio(),cli.getExistencia(),cli.getCategoria(),cli.getProvedMarca(),jf.getSelectedFile().getAbsolutePath().replace("\\","/"));
                        }
                       
                            
  }
 
}
