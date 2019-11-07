/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import Entidades.bitacoraA;
import cjb.ci.Mensaje;
import clases.editTabletrue;
import java.sql.Connection;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mosvi
 */
public class SqlBitacora {
    
    public void insertarbitacora(bitacoraA bit,JFrame PC,Connection con,JTable agenda5){
        Querys q = new Querys();
         String valores1 =("'"+bit.getCuentaUsuario() + "',");
                                    valores1 +=("'"+bit.getDid()+ "',");
                                    valores1 += ("'"+bit.getCantiadad()+ "',");
                                    valores1 += ("'"+bit.getNotaB() + "',");
                                    valores1 += ("'"+bit.getFecha()+"'");
        String s1=q.Insertar(con,"bitacora","cuneta_usuario, movimiento, cantidad, nota_bitacora, fecha_dia", valores1);
               
       
        if (s1 != null)
        {    Mensaje.error(PC, s1);
            System.out.println("valio queso");
        } else
        {   // visualizar_tabla(agenda5, con);
             System.out.println("Exito");
        }
        
    }
     public void visualizar_tabla(JTable tabla,Connection con){
        Querys q = new Querys();
        DefaultTableModel atm=new editTabletrue();
        String []titulo=new String[] {"Clave_Administrador","Accion","Cantidad recibida","Correo","No. Nota"};
         
         atm= q.SeleccionTable(con,"cuneta_usuario, movimiento, cantidad, nota_bitacora, fecha_dia","bitacora","cuneta_usuario = ?", titulo);
         
         
         tabla.setRowHeight(16);
         tabla.setModel(atm);
   
    }
    
    
}
