package metodos;

import Entidades.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class SqlUsuarios extends Conexion {

    public boolean registrar(Usuario usr) {
        PreparedStatement ps = null;
        Connection con;
        con= ManipulaDBC.conectaDB();

        String sql = "INSERT INTO usuario (idcuenta, nombre, tipo, Apaterno, Amaterno, password, tipo_pregunta, respuesta, correo) VALUES(?,?,?,?,?,?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);            
            ps.setString(1, usr.getUser());
            ps.setString(2, usr.getNombreUser());
            ps.setInt(3, usr.getTipo());
            ps.setString(4, usr.getApaterno());
            ps.setString(5, usr.getAmaterno());
            ps.setString(6, usr.getPassword());
            ps.setInt(7, usr.getPregunta());
            ps.setString(8, usr.getRespuesta());
            ps.setString(9, usr.getCorreo());
            ps.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
//        } finally {
//            try {
//                ManipulaDBC.desconectaDB(con);
//            } catch (Exception e) {
//                JOptionPane.showMessageDialog(null, e.toString());
//            }
        }
    }

    public boolean login(Usuario usr) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con;
        con= ManipulaDBC.conectaDB();

        String sql = "SELECT idcuenta,nombre, tipo, Apaterno, Amaterno, password, tipo_pregunta, respuesta, correo FROM usuario WHERE idcuenta = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, usr.getUser());
            rs = ps.executeQuery();
            
            if (rs.next()) {
                if (usr.getPassword().equals(rs.getString(6))) {                                        
                    
                    usr.setNombreUser(rs.getString(2));
                    usr.setTipo(rs.getInt(3));
                    usr.setApaterno(rs.getString(4));
                    usr.setAmaterno(rs.getString(5));
                    usr.setPregunta(rs.getInt(7));
                    usr.setRespuesta(rs.getString(8));
                    usr.setCorreo(rs.getString(9));
                    
                    return true;
                } else {
                    return false;
                }
            }

            return false;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
//        } finally {
//            try {
//                con.close();
//            } catch (SQLException e) {
//                JOptionPane.showMessageDialog(null, e.toString());
//            }
        }
    }
  
    public int existeUsuario(String usuario) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con;
        con= ManipulaDBC.conectaDB();

        String sql = "SELECT count(idcuenta) FROM usuario WHERE idcuenta = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, usuario);
            rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getInt(1);
            }

            return 1;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return 1;
//        } finally {
//            try {
//                con.close();
//            } catch (SQLException e) {
//                JOptionPane.showMessageDialog(null, e.toString());
//            }
        }
    }
     public int validaSA(String valida) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con;
        con= ManipulaDBC.conectaDB();

        String sql = "SELECT count(password) FROM usuario WHERE password= ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, valida);
            rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getInt(1);
            }

            return 1;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return 1;
//        } finally {
//            try {
//                con.close();
//            } catch (SQLException e) {
//                JOptionPane.showMessageDialog(null, e.toString());
//            }
        }
    }

    public boolean esEmail(String correo) {
        // Patrón para validar el email
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher mather = pattern.matcher(correo);
        return mather.find();
    }

}
