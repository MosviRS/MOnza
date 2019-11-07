/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import Entidades.clientes;
import Entidades.orders;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Rasteck7
 */
public class SqLNotas {
        PreparedStatement ps = null;//Objeto que permite usar declaraciones preparadas por la libreria para un facil acceso a MySql
        ResultSet rs = null;//Muestra Datos almacenados en la BD
        Connection con;//objeto que permite la conexion a la BD(MySql)
    //Busqueda por Modelo
    public clientes BusquedaModel(clientes p){
        con= ManipulaDBC.conectaDB();//Objeto que permite manipular a la BD
        //Codigo MySql para Seleccionar(o bien Buscar) Registros, guardado en una Variable de tipo String
        //para seleccionar elementos en la Tabla Usuarios de la BD, previamente diseñada
        String sql = "SELECT idmodelo, nombre, existencia, precio FROM productos WHERE idmodelo =?";
        try {
            ps = con.prepareStatement(sql);//Precarga declaraciondes por default de MySql
            ps.setString(1, p.getModeloPro());//Busqueda de Modelo
            rs = ps.executeQuery();
            
            if (rs.next()) {
                if (p.getModeloPro().equals(rs.getString(1))) {
                    p.setNombrePro(rs.getString(2));
                    p.setExistencia(rs.getInt(3));
                    p.setPrecio(rs.getDouble(4));
                }
            }

            return p;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());//Mensajes de Error
            return p;
        } finally {
            try {
                con.close();//libera conexion de la BD
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.toString());//Mas mensajes de error 
            }
        }
    
    }
    public clientes ActualizarProd(clientes p, int cant){
        con= ManipulaDBC.conectaDB();
        String sql = "UPDATE productos SET existencia=existencia-"+cant+"  WHERE  existencia=?";
        try {
            ps = con.prepareStatement(sql);
            return p;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return p;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.toString());
            }
        }
    }
    //Verificacion de Datos
    public boolean verificarNote(clientes p){
        con= ManipulaDBC.conectaDB();//Objeto que permite manipular a la BD
        //Codigo MySql para Seleccionar(o bien Buscar) Registros, guardado en una Variable de tipo String
        //para seleccionar elementos en la Tabla Usuarios de la BD, previamente diseñada
        String sql = "SELECT nota FROM notas WHERE nota =?";
        try {
            ps = con.prepareStatement(sql);//Precarga declaraciondes por default de MySql
            ps.setString(1, p.getNo_nota());//Busqueda de Modelo
            rs = ps.executeQuery();
            
            if (rs.next()) {
                if (p.getNo_nota().equals(rs.getString(1))) {
                    return true;
                }
            }
            return false;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());//Mensajes de Error
            return false;
        } finally {
            try {
                con.close();//libera conexion de la BD
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.toString());//Mas mensajes de error 
            }
        }
    }
    public boolean Verificar(clientes p,orders op){
        con= ManipulaDBC.conectaDB();//Objeto que permite manipular a la BD
        //Codigo MySql para Seleccionar(o bien Buscar) Registros, guardado en una Variable de tipo String
        //para seleccionar elementos en la Tabla Usuarios de la BD, previamente diseñada
        String sql = "SELECT idmodelo, nombre, existencia FROM productos WHERE idmodelo =?";
        try {
            ps = con.prepareStatement(sql);//Precarga declaraciondes por default de MySql
            ps.setString(1, p.getModeloPro());//Busqueda de Modelo
            rs = ps.executeQuery();
            
            if (rs.next()) {
                if (p.getModeloPro().equals(rs.getString(1))&&
                        p.getNombrePro().equals(rs.getString(2))&&
                        p.getExistencia()==rs.getInt(3)&&
                        op.getCant()<=rs.getInt(3)&&
                        op.getCant()>0) {
//                        op.getCant()>0&&
//                        !p.getNo_nota().equals("XXXX")&&
//                        !verificarNote(p)) {
                    return true;
                }
            }
            return false;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());//Mensajes de Error
            return false;
        } finally {
            try {
                con.close();//libera conexion de la BD
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.toString());//Mas mensajes de error 
            }
        }
    }
    //Listado de Productos
    public void insertProNote(String model,int nota,int cantidad){
        con= ManipulaDBC.conectaDB();//Objeto que permite manipular a la BD
        //Codigo MySql para insertar Registros, guardado en una Variable de tipo String
        //para registrar en la Tabla Usuarios de la BD, previamente diseñada
        String sql = "INSERT INTO productos_notas (idproductos, idnotas, cantidad) VALUES(?,?,?)";
        try {
            ps = con.prepareStatement(sql);//Precarga declaraciondes por default de MySql
            //Inserta nuevos campos a la Tabla Usuarios
            //Numero de busqueda,Datos a Ingresar;
            ps.setString(1, model);
            ps.setInt(2, nota);
            ps.setInt(3, cantidad);
            ps.execute();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());//Mensajes de Error 
        } finally {
            try {
                ManipulaDBC.desconectaDB(con);//Libera conexion a la BD
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.toString());//Mas Mensajes de Error
            }
        }
    }
    public void insertNote(int nt,int cc,double t){
        con= ManipulaDBC.conectaDB();//Objeto que permite manipular a la BD
        //Codigo MySql para insertar Registros, guardado en una Variable de tipo String
        //para registrar en la Tabla Usuarios de la BD, previamente diseñada
        String sql = "INSERT INTO notas (nota, cuenta_cliente, total) VALUES(?,?,?)";
        try {
            ps = con.prepareStatement(sql);//Precarga declaraciondes por default de MySql
            //Inserta nuevos campos a la Tabla Usuarios
            //Numero de busqueda,Datos a Ingresar;
            ps.setInt(1, nt);
            ps.setInt(2, cc);
            ps.setDouble(3, t);
            ps.execute();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());//Mensajes de Error 
        } finally {
            try {
                ManipulaDBC.desconectaDB(con);//Libera conexion a la BD
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.toString());//Mas Mensajes de Error
            }
        }
    }
    public void insertClient(int idc,String nombre,String ap,String am, String dir,int num){
        con= ManipulaDBC.conectaDB();//Objeto que permite manipular a la BD
        //Codigo MySql para insertar Registros, guardado en una Variable de tipo String
        //para registrar en la Tabla Usuarios de la BD, previamente diseñada
        String sql = "INSERT INTO cliente (idclientes, nombre, APaterno, Amaterno, direccion, telefono) VALUES(?,?,?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);//Precarga declaraciondes por default de MySql
            //Inserta nuevos campos a la Tabla Usuarios
            //Numero de busqueda,Datos a Ingresar;
            ps.setInt(1, idc);
            ps.setString(2, nombre);
            ps.setString(3, ap);
            ps.setString(4, am);
            ps.setString(5, dir);
            ps.setInt(6, num);
            ps.execute();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());//Mensajes de Error 
        } finally {
            try {
                ManipulaDBC.desconectaDB(con);//Libera conexion a la BD
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.toString());//Mas Mensajes de Error
            }
        }
    }
    
    public void insertAbono(int idA,double abonado,int num){
        con= ManipulaDBC.conectaDB();
        String sql = "INSERT INTO abono (nota_abono, abonado, numeracion) VALUES(?,?,?)";
        try {
            ps = con.prepareStatement(sql);//Precarga declaraciondes por default de MySql
            //Inserta nuevos campos a la Tabla Usuarios
            //Numero de busqueda,Datos a Ingresar;
            ps.setInt(1, idA);
            ps.setDouble(2, abonado);
            ps.setInt(3, num);
            ps.execute();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());//Mensajes de Error 
        } finally {
            try {
                ManipulaDBC.desconectaDB(con);//Libera conexion a la BD
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.toString());//Mas Mensajes de Error
            }
        }
    }
}