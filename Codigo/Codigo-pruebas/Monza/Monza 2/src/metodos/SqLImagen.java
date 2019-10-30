/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import static PanelConrtrol.PC.atm;
import clases.IMGtabla;
import clases.editTable;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LAPROMA1-21
 */
public class SqLImagen {
    
     public String guardarProductos(Connection con,String modelo, String nombrePro,double precio,int exietn,String cat,String prov, String ruta){
        String insert = "insert into productos(idmodelo, nombre, precio, existencia, clasificacion, provedor, imagen) values(?,?,?,?,?,?,?)";
        
        FileInputStream fi = null;
        PreparedStatement ps = null;
        try{
            File file = new File(ruta);
            fi = new FileInputStream(file);
            
            ps = con.prepareStatement(insert);
            ps.setString(1, modelo);
            ps.setString(2, nombrePro);
            ps.setDouble(3, precio);
            ps.setInt(4, exietn);
            ps.setString(5, cat);
            ps.setString(6, prov);
            ps.setBinaryStream(7, fi);
            
            ps.executeUpdate();
            return null;
        }catch(Exception ex){
            return "Error al agregar usuario "+ex.getMessage();
        }
    }
      public ResultSet visualizar(Connection con){
   
        ResultSet rs = null;
        try{
            PreparedStatement ps = con.prepareStatement("select * from productos");
            rs = ps.executeQuery();
        }catch(Exception ex){
            System.out.println("Error de consulta");
        }
        return rs;
    }
    public void visualizar_tabla(JTable tabla,Connection con){
   
    ResultSet rs = visualizar(con);
    //Image img = null;   
 
    DefaultTableModel atm=new editTable();
   
         String []titulo=new String[] {"Modelo","Nombre","Precio","Marca/Provedor","Cantidad","Categoria","Imagen"};
         tabla.setDefaultRenderer(Object.class,new IMGtabla());
         atm.setColumnIdentifiers(titulo);
         
    
    try{
        
        while(rs.next()){
                Object[] fila = new Object[7];
                fila[0] = rs.getObject(1);
                fila[1] = rs.getObject(2);
                fila[2] = rs.getObject(3);
                fila[3] = rs.getObject(4);
                fila[4] = rs.getObject(5);
                fila[5] = rs.getObject(6);
            
                
                Blob blob = rs.getBlob(7);

                if(blob != null){
                   try{
                        byte[] data = blob.getBytes(1, (int)blob.length());
                        BufferedImage img = null;
                        try{
                        img = ImageIO.read(new ByteArrayInputStream(data));
                        }catch(Exception ex){
                        System.out.println(ex.getMessage());
                        }
                    ImageIcon icono = new ImageIcon(img);
                    fila[6] = new JLabel(reducirtamamo(icono));
                        }catch(Exception ex){
                            fila[6] = "No Imagen";
                        }
                }
                else{
                    fila[6] = "No Imagen";
                }
                
                atm.addRow(fila);  
            }
        
         tabla.setRowHeight(70);
         tabla.setModel(atm);
    }catch(Exception ex){
        System.out.println(ex.getMessage());
        ex.printStackTrace();   
    }  
}
      public ImageIcon reducirtamamo(ImageIcon im){
    
      Image conver=im.getImage();
      Image tam=conver.getScaledInstance(100,120,Image.SCALE_SMOOTH);
      ImageIcon imgfinal=new ImageIcon(tam);
      
      return imgfinal;
   }
}
