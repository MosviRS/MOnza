/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogIn;

import Entidades.Usuario;
import clases.Hash;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import metodos.SqlUsuarios;

/**
 *
 * @author Rasteck7
 */
public class accesoAD extends javax.swing.JFrame {

    /**
     * Creates new form olv2
     */
    public accesoAD() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Acceso");
        ImageIcon icon = new ImageIcon("src/Imagen/LogoMonza.png");
        this.setIconImage(icon.getImage());
    }

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
        jLabel2 = new javax.swing.JLabel();
        ok = new javax.swing.JButton();
        Minimize = new javax.swing.JButton();
        Close = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtvalida = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        View = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(243, 240, 235));
        jPanel1.setPreferredSize(new java.awt.Dimension(577, 383));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(45, 150, 129));
        jLabel1.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 159, 28));
        jLabel1.setText("Identificate");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 80, 50));

        jLabel2.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Contraseña de Administrador");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 260, 30));

        ok.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        ok.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGM/ok1.png"))); // NOI18N
        ok.setText("Continuar");
        ok.setBorder(null);
        ok.setBorderPainted(false);
        ok.setContentAreaFilled(false);
        ok.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ok.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGM/ok2.png"))); // NOI18N
        ok.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGM/ok2.png"))); // NOI18N
        ok.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGM/ok2.png"))); // NOI18N
        ok.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                okMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                okMouseReleased(evt);
            }
        });
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });
        jPanel1.add(ok, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 130, 40));

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
        jPanel1.add(Minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, -1, 40));

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
        jPanel1.add(Close, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, -1, 40));

        back.setBackground(new java.awt.Color(243, 240, 235));
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGM/Skip1.png"))); // NOI18N
        back.setBorder(null);
        back.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGM/Skip2.png"))); // NOI18N
        back.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGM/Skip2.png"))); // NOI18N
        back.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGM/Skip2.png"))); // NOI18N
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 310, 80, 60));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGM/Acces92.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 90, 80));

        txtvalida.setBackground(new java.awt.Color(243, 240, 235));
        txtvalida.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtvalida.setForeground(new java.awt.Color(102, 102, 102));
        txtvalida.setText("Inserte contraseña");
        txtvalida.setBorder(null);
        txtvalida.setCaretColor(new java.awt.Color(204, 51, 0));
        txtvalida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtvalidaMouseClicked(evt);
            }
        });
        txtvalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtvalidaActionPerformed(evt);
            }
        });
        jPanel1.add(txtvalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 210, 30));

        jSeparator2.setBackground(new java.awt.Color(235, 235, 235));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 250, 20));

        View.setBackground(new java.awt.Color(242, 242, 242));
        View.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/oculto.png"))); // NOI18N
        View.setBorder(null);
        View.setBorderPainted(false);
        View.setContentAreaFilled(false);
        View.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/ver.png"))); // NOI18N
        View.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/ver.png"))); // NOI18N
        View.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/ver.png"))); // NOI18N
        View.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/ver.png"))); // NOI18N
        View.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewActionPerformed(evt);
            }
        });
        jPanel1.add(View, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, 20, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_okMousePressed

    }//GEN-LAST:event_okMousePressed

    private void okMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_okMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_okMouseReleased

    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
            SqlUsuarios ModSQL= new SqlUsuarios();
            Usuario mod= new Usuario();
            String password= new String(txtvalida.getPassword());
            if(!txtvalida.getText().equals("") && !txtvalida.getText().equals("Inserte contraseña")){
                    String encriptado= Hash.sha1(password);                    
                    mod.setPassword(encriptado);
                    if(ModSQL.validaSA(mod)){
                        Registro ir= new Registro();
                        ir.setVisible(true);
                        this.dispose();
                    }else{
                        JOptionPane.showMessageDialog(null, "Datos Incorrectos");
                    }
                }else{
                JOptionPane.showMessageDialog(null, "Debe Ingresar sus Datos");
            }  


//        int dialog = JOptionPane.YES_NO_OPTION;
//        int result = JOptionPane.showConfirmDialog(null, "El acceso fue exitoso :3","Exit",dialog);
//        if (result==0){
//            this.dispose();
//             java.awt.EventQueue.invokeLater(new Runnable() {
//                    public void run() {
//                        new Registro().setVisible(true);
//                    }
//                });
//        }
    }//GEN-LAST:event_okActionPerformed

    private void CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseActionPerformed
        int dialog = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null, "Desea regresar al inicio?","Exit",dialog);
        if (result==0){
            java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn().setVisible(true);
            }
        });
        }
        this.dispose();
    }//GEN-LAST:event_CloseActionPerformed

    private void MinimizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinimizeActionPerformed
        this.setState(LogIn.ICONIFIED);
    }//GEN-LAST:event_MinimizeActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn().setVisible(true); 
            }
        });
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    private void txtvalidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtvalidaMouseClicked
        // TODO add your handling code here:
        if (txtvalida.getText().equals("Inserte contraseña")) {
            txtvalida.setText("");
        }
    }//GEN-LAST:event_txtvalidaMouseClicked

    private void ViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewActionPerformed
        if (View.isSelected()==true) {
            txtvalida.setEchoChar((char)0);
        }else{
            txtvalida.setEchoChar('•');

        }
    }//GEN-LAST:event_ViewActionPerformed

    private void txtvalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtvalidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtvalidaActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Windows".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(accesoAD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(accesoAD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(accesoAD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(accesoAD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new accesoAD().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Close;
    private javax.swing.JButton Minimize;
    private javax.swing.JToggleButton View;
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton ok;
    private javax.swing.JPasswordField txtvalida;
    // End of variables declaration//GEN-END:variables
}
