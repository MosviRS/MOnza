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
 
}
