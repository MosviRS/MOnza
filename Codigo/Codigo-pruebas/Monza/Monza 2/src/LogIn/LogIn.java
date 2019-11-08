/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogIn;

import Entidades.Usuario;
import PanelConrtrol.PC;
import clases.Hash;
import java.sql.Connection;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import metodos.ManipulaDBC;
import metodos.SqlUsuarios;

/**
 *
 * @author Rasteck7
 */
public class LogIn extends javax.swing.JFrame {

    /**
     * Creates new form LogIn
     */
     Connection con;
    public LogIn() {
        initComponents();//Componentes graficos
        this.setLocationRelativeTo(null);        
        this.setTitle("Muebleria ¨MONZA¨");
        ImageIcon icon = new ImageIcon("src/IMGM/LogoMonza.png");
        this.setIconImage(icon.getImage());
     
        
    }
    public static String us;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        User = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Password = new javax.swing.JPasswordField();
        View = new javax.swing.JToggleButton();
        jSeparator2 = new javax.swing.JSeparator();
        Forget = new javax.swing.JButton();
        Register = new javax.swing.JButton();
        Minimize = new javax.swing.JButton();
        Close = new javax.swing.JButton();
        Acces = new javax.swing.JButton();
        AboutUs = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(243, 240, 235));
        jPanel1.setPreferredSize(new java.awt.Dimension(1050, 576));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(235, 235, 235));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGM/User.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, 140, 100));

        jLabel5.setBackground(new java.awt.Color(235, 235, 235));
        jLabel5.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        jLabel5.setText("Usuario");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, 60, 20));

        User.setBackground(new java.awt.Color(243, 240, 235));
        User.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        User.setForeground(new java.awt.Color(102, 102, 102));
        User.setText("Ingrese Usuario");
        User.setBorder(null);
        User.setCaretColor(new java.awt.Color(204, 51, 0));
        User.setCaretPosition(0);
        User.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        User.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UserMouseClicked(evt);
            }
        });
        jPanel1.add(User, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, 180, 30));

        jLabel3.setBackground(new java.awt.Color(235, 235, 235));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGM/usuario.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, -1, -1));

        jSeparator3.setBackground(new java.awt.Color(235, 235, 235));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, 250, 20));

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        jLabel4.setText("Contraseña");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, 90, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGM/clave.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 360, -1, -1));

        Password.setBackground(new java.awt.Color(243, 240, 235));
        Password.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Password.setForeground(new java.awt.Color(102, 102, 102));
        Password.setText("Inserte contraseña");
        Password.setBorder(null);
        Password.setCaretColor(new java.awt.Color(204, 51, 0));
        Password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PasswordMouseClicked(evt);
            }
        });
        jPanel1.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 360, 180, 30));

        View.setBackground(new java.awt.Color(242, 242, 242));
        View.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGM/oculto.png"))); // NOI18N
        View.setBorder(null);
        View.setBorderPainted(false);
        View.setContentAreaFilled(false);
        View.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/ver.png"))); // NOI18N
        View.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGM/ver.png"))); // NOI18N
        View.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGM/ver.png"))); // NOI18N
        View.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGM/ver.png"))); // NOI18N
        View.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewActionPerformed(evt);
            }
        });
        jPanel1.add(View, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 370, 30, 20));

        jSeparator2.setBackground(new java.awt.Color(235, 235, 235));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 400, 250, 20));

        Forget.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        Forget.setForeground(new java.awt.Color(102, 102, 102));
        Forget.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/pregunta_Off.png"))); // NOI18N
        Forget.setText("Olvide mi contraseña");
        Forget.setBorder(null);
        Forget.setBorderPainted(false);
        Forget.setContentAreaFilled(false);
        Forget.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Forget.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/pregunta.png"))); // NOI18N
        Forget.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/pregunta.png"))); // NOI18N
        Forget.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/pregunta.png"))); // NOI18N
        Forget.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ForgetActionPerformed(evt);
            }
        });
        jPanel1.add(Forget, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 500, 190, 40));

        Register.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGM/adduser1.png"))); // NOI18N
        Register.setBorder(null);
        Register.setBorderPainted(false);
        Register.setContentAreaFilled(false);
        Register.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Register.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGM/adduser2.png"))); // NOI18N
        Register.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGM/adduser2.png"))); // NOI18N
        Register.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGM/adduser2.png"))); // NOI18N
        Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterActionPerformed(evt);
            }
        });
        jPanel1.add(Register, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 40, 40));

        Minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGM/Minimize.png"))); // NOI18N
        Minimize.setBorder(null);
        Minimize.setBorderPainted(false);
        Minimize.setContentAreaFilled(false);
        Minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Minimize.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGM/Minimize2.png"))); // NOI18N
        Minimize.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGM/Minimize2.png"))); // NOI18N
        Minimize.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGM/Minimize2.png"))); // NOI18N
        Minimize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinimizeActionPerformed(evt);
            }
        });
        jPanel1.add(Minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 10, -1, 40));

        Close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGM/close.png"))); // NOI18N
        Close.setBorder(null);
        Close.setBorderPainted(false);
        Close.setContentAreaFilled(false);
        Close.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Close.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGM/close2.png"))); // NOI18N
        Close.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGM/close2.png"))); // NOI18N
        Close.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGM/close2.png"))); // NOI18N
        Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseActionPerformed(evt);
            }
        });
        jPanel1.add(Close, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 10, -1, 40));

        Acces.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        Acces.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGM/L1.png"))); // NOI18N
        Acces.setText("Iniciar Sesión");
        Acces.setBorder(null);
        Acces.setBorderPainted(false);
        Acces.setContentAreaFilled(false);
        Acces.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Acces.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGM/L2.png"))); // NOI18N
        Acces.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGM/L2.png"))); // NOI18N
        Acces.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGM/L2.png"))); // NOI18N
        Acces.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccesActionPerformed(evt);
            }
        });
        jPanel1.add(Acces, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 420, 160, 60));

        AboutUs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGM/logo v1.png"))); // NOI18N
        AboutUs.setBorder(null);
        AboutUs.setBorderPainted(false);
        AboutUs.setContentAreaFilled(false);
        AboutUs.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        AboutUs.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGM/logo v1.png"))); // NOI18N
        AboutUs.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGM/logo v1.png"))); // NOI18N
        AboutUs.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGM/logo v1.png"))); // NOI18N
        AboutUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AboutUsActionPerformed(evt);
            }
        });
        jPanel1.add(AboutUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 521, 100, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserMouseClicked
        // Evento del mouse, para limpiar caja de texto
        if (User.getText().equals("Ingrese Usuario")) {
            User.setText("");
        }
    }//GEN-LAST:event_UserMouseClicked

    private void PasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PasswordMouseClicked
        // Evento del mouse para limpiar caja de texto del password
        if (Password.getText().equals("Inserte contraseña")) {
            Password.setText("");
        }
    }//GEN-LAST:event_PasswordMouseClicked

    private void ViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewActionPerformed
        //Boton muestra contraseña
        if (View.isSelected()==true) {
            Password.setEchoChar((char)0);
        }else{
            Password.setEchoChar('•');

        }
    }//GEN-LAST:event_ViewActionPerformed

    private void ForgetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ForgetActionPerformed
        SqlUsuarios ModSQL= new SqlUsuarios();//Metodos de Usuario
        Usuario mod= new Usuario();//Entidad Usuario para encapsulamiento  
        
        if(!User.getText().equals("") && !User.getText().equals("Ingrese Usuario")){//Validadciones
            mod.setUser(User.getText());//Guarda usuario en la Clase Entidad
            if(ModSQL.Olvide(mod)){//Optiene datos del usuario para realizar validacion de usuario y proporcionar la contraseña                
                olv2 ir= new olv2(mod);//Abre frame de Olvidar
                ir.setVisible(true);//Muestra el frame 
                this.dispose();//Oculta venta principal
                JOptionPane.showMessageDialog(null, "Por Motivos de Seguridad se le asignara una NUEVA contraseña", "Warning",JOptionPane.WARNING_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "Usuario No Existe");
            }        
        }else{
            JOptionPane.showMessageDialog(null, "Debe Ingresar al menos el nombre del Usuario Para Identificar sus Datos");
        }


//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new olv2().setVisible(true);
//            }
//        });
//        this.dispose();
    }//GEN-LAST:event_ForgetActionPerformed

    private void RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new accesoAD().setVisible(true);
            }
        });
        this.dispose();
    }//GEN-LAST:event_RegisterActionPerformed

    private void MinimizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinimizeActionPerformed
        this.setState(LogIn.ICONIFIED);
    }//GEN-LAST:event_MinimizeActionPerformed

    private void CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseActionPerformed
//        int dialog = JOptionPane.YES_NO_OPTION;
//        int result = JOptionPane.showConfirmDialog(null, "Desea Salir?","Exit",dialog);
//        if (result==0){
            System.exit(0);
//        }
    }//GEN-LAST:event_CloseActionPerformed

    private void AboutUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AboutUsActionPerformed
        //        // TODO add your handling code here:
        //        java.awt.EventQueue.invokeLater(new Runnable() {
            //            public void run() {
                //                new AboutUs().setVisible(true);
                //            }
            //        });
    //        this.dispose();
    }//GEN-LAST:event_AboutUsActionPerformed

    private void AccesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccesActionPerformed
            
            SqlUsuarios ModSQL= new SqlUsuarios();//Metodos de Usuario 
            Usuario mod= new Usuario();//Clase Entidad Usuario
            String password= new String(Password.getPassword());//recibe Password proporcionado por el Usuario
            
            if(!User.getText().equals("") && !password.equals("") && !User.getText().equals("Ingrese Usuario") && !password.equals("Inserte contraseña")){
                    String encriptado= Hash.sha1(password);//Encriptacion del password
                    mod.setUser(User.getText());//Envia el usuario a la Clase Entidad Usuario
                    mod.setPassword(encriptado);//Envia password encriptado                    
                    if(ModSQL.login(mod)){//Validacion de Usuario y contraseña
                        us=mod.getUser();
                        PC ir= new PC(mod);//Permitir acceso a PC
                        ir.setVisible(true);
                        this.dispose();
                    }else{
                        JOptionPane.showMessageDialog(null, "Datos Incorrectos");
                    }
                }else{
                JOptionPane.showMessageDialog(null, "Debe Ingresar sus Datos");
            }                            
    }//GEN-LAST:event_AccesActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
         con = ManipulaDBC.conectaDB();
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
           ManipulaDBC.desconectaDB(con);
    }//GEN-LAST:event_formWindowClosed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn().setVisible(true);
                
//                LogIn main= new  LogIn();                                                                                                                                                                         
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AboutUs;
    private javax.swing.JButton Acces;
    private javax.swing.JButton Close;
    private javax.swing.JButton Forget;
    private javax.swing.JButton Minimize;
    private javax.swing.JPasswordField Password;
    private javax.swing.JButton Register;
    private javax.swing.JTextField User;
    private javax.swing.JToggleButton View;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
