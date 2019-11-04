/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import Entidades.clientes;
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
    //Busqueda por Modelo
    public clientes BusquedaModel(clientes p){
        PreparedStatement ps = null;//Objeto que permite usar declaraciones preparadas por la libreria para un facil acceso a MySql
        ResultSet rs = null;//Muestra Datos almacenados en la BD
        Connection con;//objeto que permite la conexion a la BD(MySql)
        con= ManipulaDBC.conectaDB();//Objeto que permite manipular a la BD
        //Codigo MySql para Seleccionar(o bien Buscar) Registros, guardado en una Variable de tipo String
        //para seleccionar elementos en la Tabla Usuarios de la BD, previamente diseñada
        String sql = "SELECT idmodelo, nombre, existencia FROM productos WHERE idmodelo =?";
        try {
            ps = con.prepareStatement(sql);//Precarga declaraciondes por default de MySql
            ps.setString(1, p.getModeloPro());//Busqueda de Modelo
            rs = ps.executeQuery();
            
            if (rs.next()) {
                if (p.getModeloPro().equals(rs.getString(1))) {
                    p.setNombrePro(rs.getString(2));
                    p.setExistencia(rs.getInt(3));
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
    //Beta busqueda por nombre 
    public clientes BusquedaNameP(clientes p){
        PreparedStatement ps = null;//Objeto que permite usar declaraciones preparadas por la libreria para un facil acceso a MySql
        ResultSet rs = null;//Muestra Datos almacenados en la BD
        Connection con;//objeto que permite la conexion a la BD(MySql)
        con= ManipulaDBC.conectaDB();//Objeto que permite manipular a la BD
        //Codigo MySql para Seleccionar(o bien Buscar) Registros, guardado en una Variable de tipo String
        //para seleccionar elementos en la Tabla Usuarios de la BD, previamente diseñada
        String sql = "SELECT idmodelo, nombre FROM productos WHERE idmodelo =?";
        try {
            ps = con.prepareStatement(sql);//Precarga declaraciondes por default de MySql
            ps.setString(2, p.getNombrePro());//Busqueda de Modelo
            rs = ps.executeQuery();
            
            if (rs.next()) {
                if (p.getNombrePro().equals(rs.getString(2))) {
                    p.setModeloPro(rs.getString(1));
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
    //Verificacion de Datos
    public boolean Verificar(clientes p){
        boolean bn=true;
        PreparedStatement ps = null;//Objeto que permite usar declaraciones preparadas por la libreria para un facil acceso a MySql
        ResultSet rs = null;//Muestra Datos almacenados en la BD
        Connection con;//objeto que permite la conexion a la BD(MySql)
        con= ManipulaDBC.conectaDB();//Objeto que permite manipular a la BD
        //Codigo MySql para Seleccionar(o bien Buscar) Registros, guardado en una Variable de tipo String
        //para seleccionar elementos en la Tabla Usuarios de la BD, previamente diseñada
        String sql = "SELECT idmodelo, nombre, existencia FROM productos WHERE idmodelo =?";
        try {
            ps = con.prepareStatement(sql);//Precarga declaraciondes por default de MySql
            ps.setString(1, p.getModeloPro());//Busqueda de Modelo
            rs = ps.executeQuery();
            
            if (rs.next()) {
                if (p.getModeloPro().equals(rs.getString(1))&&p.getNombrePro().equals(rs.getString(2))&&p.getExistencia()==rs.getInt(3)) {
                    return bn=true;
                }else{
                    return bn=false;
                }
            }
            return bn;
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
}
