/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import clases.editTable;
import clases.editTabletrue;
import java.sql.Connection;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mosvi
 */
public class SqLclientes {
      public void vizualizar_tabla(JTable tabla,Connection con){
         Querys q = new Querys();
        DefaultTableModel atm=new editTabletrue();
        String []titulo=new String[] {"No.Nota","Nombre","Direccion","Fecha de Compra","Total a Pagar","Abonado","Saldo"};
        
          String qu="SELECT notas.nota, clientes.nombre, clientes.direccion, notas.fecha_nota, notas.total, abono.abonado, abono.faltante "+
          "FROM (clientes INNER JOIN notas ON clientes.idclientes = notas.no_cliente) INNER JOIN abono ON notas.nota = abono.nota_abono";
         atm= q.Seleccioncond(con,qu, titulo);
         
         
         tabla.setRowHeight(16);
         tabla.setModel(atm);
      
                     
    }
     public void elimnar(JTable tabla,Connection con){
      Querys q = new Querys();
       
      try{
           
            String s1=q.Delete(con,"notas","nota", String.valueOf(tabla.getValueAt(tabla.getSelectedRow(),0)));
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
      
                tabla.addKeyListener(new java.awt.event.KeyAdapter() {
                public void tablakeyReleased(java.awt.event.KeyEvent evt) {
                    
                    
                }
            });
        
                       
                            
  }
}
