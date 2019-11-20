/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import clases.editTabletrue;
import java.sql.Connection;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mosvi
 */
public class Sqlproductos_notas {
  
    
       public  ArrayList<Object> vizualizar_tabla(JTable tabla,Connection con,String valor){
         Querys q = new Querys();
         ArrayList<Object> arr= new ArrayList();
//        DefaultTableModel atm=new editTabletrue();
        String []titulo=new String[] {"No.Nota","Nombre","Direccion","Fecha de Compra","Total a Pagar","Abonado","Saldo"};
        
          String qu="notas.nota, clientes.nombre, clientes.APaterno, clientes.Amaterno, productos_notas.cantidad, productos.nombre, productos_notas.idproductos, productos.precio ";
          String from="productos INNER JOIN ((clientes INNER JOIN notas ON clientes.idclientes = notas.no_cliente) INNER JOIN productos_notas ON notas.nota = productos_notas.idnotas) ON productos.idmodelo = productos_notas.idproductos ";
          String whr= "(((notas.nota)='"+valor+"'))";
          arr= q.Seleccion(con, qu,from,whr);
         
         
//         tabla.setRowHeight(16);
//         tabla.setModel(atm);
           return arr;
                     
    }
}
