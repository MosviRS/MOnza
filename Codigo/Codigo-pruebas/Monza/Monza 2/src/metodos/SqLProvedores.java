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
import com.sun.jdi.connect.spi.Connection;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mosvi
 */
public class SqLProvedores {
    public void visualizar_tabla(JTable tabla,Connection con){
        DefaultTableModel atm=new editTable();
        String []titulo=new String[] {"Nombre","Direccion","No. Telefonico","Correo","Tipo Mercansia"};
         atm.setColumnIdentifiers(titulo);
         
         
         
         tabla.setRowHeight(16);
         tabla.setModel(atm);
   
    }
 
}
