/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogIn;
import Entidades.Usuario;
import clases.Hash;
//import com.mysql.cj.Session;
//import com.mysql.cj.protocol.Message;
//import com.sun.jdi.connect.Transport;
import java.awt.Cursor;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import static java.nio.charset.StandardCharsets.UTF_8;
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.*;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import metodos.PasswordGenerator;
import metodos.SqlUsuarios;

/**
 *
 * @author Rasteck7
 */
public class olv2 extends javax.swing.JFrame {
        Usuario mod;
    /**
     * Creates new form olv2
     */
    public olv2() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        this.setTitle("Recuperacion");
        ImageIcon icon = new ImageIcon("src/Imagen/LogoMonza.png");
        this.setIconImage(icon.getImage());
    }
    public olv2(Usuario mod){
        initComponents();
        this.mod= mod;
        this.setLocationRelativeTo(null);
        this.setTitle("Registro");        
        ImageIcon icon = new ImageIcon("src/Imagen/LogoMonza.png");
        this.setIconImage(icon.getImage()); 
        
         switch (mod.getPregunta()){
            case 1:                
                Question.setSelectedIndex(1);
                break;
            case 2:
                Question.setSelectedIndex(2);
                break;
            case 3:
                Question.setSelectedIndex(3);
                break;
            case 4:
                Question.setSelectedIndex(4);
                break;
            case 5:
                Question.setSelectedIndex(5);
                break;
            case 6:
                Question.setSelectedIndex(6);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Seleccione una Pregunta");
                break;
        }
        
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
        email = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Answer = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        Question = new javax.swing.JComboBox<>();
        Minimize = new javax.swing.JButton();
        Close = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(243, 240, 235));
        jPanel1.setPreferredSize(new java.awt.Dimension(577, 383));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(45, 150, 129));
        jLabel1.setFont(new java.awt.Font("Microsoft Tai Le", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 159, 28));
        jLabel1.setText("Recuperación de la cuenta");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 330, 50));

        jLabel2.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        jLabel2.setText("Introduzca el correo que Asigno Cuando de Registro");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 360, 20));

        email.setBackground(new java.awt.Color(243, 240, 235));
        email.setForeground(new java.awt.Color(102, 102, 102));
        email.setText("Ingrese un correo electronico");
        email.setBorder(null);
        email.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emailMouseClicked(evt);
            }
        });
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                emailKeyReleased(evt);
            }
        });
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 340, 30));

        jSeparator6.setBackground(new java.awt.Color(235, 235, 235));
        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 340, 20));

        jButton1.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGM/ok1.png"))); // NOI18N
        jButton1.setText("Continuar");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGM/ok2.png"))); // NOI18N
        jButton1.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGM/ok2.png"))); // NOI18N
        jButton1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGM/ok2.png"))); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton1MouseReleased(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 130, 40));

        jLabel3.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Ó");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 350, 20));

        Answer.setBackground(new java.awt.Color(243, 240, 235));
        Answer.setForeground(new java.awt.Color(102, 102, 102));
        Answer.setText("Ingrese la respuesta correcta");
        Answer.setBorder(null);
        Answer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AnswerMouseClicked(evt);
            }
        });
        Answer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnswerActionPerformed(evt);
            }
        });
        Answer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                AnswerKeyReleased(evt);
            }
        });
        jPanel1.add(Answer, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 350, 30));

        jSeparator7.setBackground(new java.awt.Color(235, 235, 235));
        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 350, 10));

        Question.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una pregunta", "¿Cuál fue el nombre de tu primera mascota? ", "¿Cuál es tu comida favorita? ", "¿Cuál es el nombre de tu madre? ", "¿En qué ciudad naciste?", "¿Cuál es el segundo nombre de tu padre?", "¿Cuál es el nombre de tu primer profesor?" }));
        jPanel1.add(Question, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 350, -1));

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
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGM/back1.png"))); // NOI18N
        back.setBorder(null);
        back.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGM/back2.png"))); // NOI18N
        back.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGM/back2.png"))); // NOI18N
        back.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGM/back2.png"))); // NOI18N
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 80, 60));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGM/Forget.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 60));

        jLabel5.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        jLabel5.setText("Pregunta de seguridad");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 350, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void emailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailMouseClicked
        // TODO add your handling code here:
        if (email.getText().equals("Inserta un correo electronico")) {
            email.setText("");
        }
    }//GEN-LAST:event_emailMouseClicked

    private void emailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailKeyReleased
        if (email.getText().equals("Inserta un correo electronico")) {
            email.setText("");
        }
    }//GEN-LAST:event_emailKeyReleased

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed

    }//GEN-LAST:event_jButton1MousePressed

    private void jButton1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        SqlUsuarios ModSQL= new SqlUsuarios();
        //PasswordGenerator t= new PasswordGenerator();
        if(!Answer.getText().equals("") && !Answer.getText().equals("Ingrese la respuesta correcta")){
            if(Answer.getText().equals(mod.getRespuesta())){                
                //Asignar nuevo Password                
                
                String decodedString=PasswordGenerator.getPassword(PasswordGenerator.MINUSCULAS+PasswordGenerator. MAYUSCULAS + PasswordGenerator.ESPECIALES,6);                
                System.out.println("PASSSS:    "+ decodedString);                                                
                System.out.println("antes   "+mod.getPassword());                
                JOptionPane.showMessageDialog(null, "Usuario: "+(mod.getNombreUser())+ "\nContraseña: "+ decodedString);                                                
                //Encriptar
                String encriptado= Hash.sha1(decodedString);
                mod.setPassword(encriptado);
                //Actualizar BD
                System.out.println("nuevo  "+mod.getPassword());
                ModSQL.modificar(mod);
                
                
            }else{
                JOptionPane.showMessageDialog(null,"\tLo siento \nLos Datos NO Coinciden");                
            }
        }else if(!email.getText().equals("") && !email.getText().equals("Ingrese un correo electronico")){
            if(email.getText().equals(mod.getCorreo())){///
                Properties propiedad = new Properties();
                propiedad.setProperty("mail.smtp.host","smtp.gmail.com");
                propiedad.setProperty("mail.smtp.starttls.enable","true");
                propiedad.setProperty("mail.smtp.port","587");
                propiedad.setProperty("mail.smtp.auth","true");

                Session sesion = Session.getDefaultInstance(propiedad);

                String correoEnvia = "urielgarciamartinez105@gmail.com";///
                String contrasenia = "1416308A";///
                String destinatario=email.getText();///
                String asunto = "Recuperacion de Contraseña MONZA";
                String mensaje="Hola "+mod.getNombreUser()+" Su Usuario: "+mod.getUser()+" nos has solicitado reestablecer su password, para ingresar de nuevo a la plataforma"///
                + "\n Tu contraseña es: "+mod.getPassword();///

                MimeMessage mail = new MimeMessage(sesion);
                try {
                    mail.setFrom(new InternetAddress(correoEnvia));
                    mail.addRecipient(Message.RecipientType.TO, new InternetAddress(destinatario));
                    mail.setSubject(asunto);
                    mail.setText(mensaje);

                    Transport transporte = sesion.getTransport("smtp");
                    transporte.connect(correoEnvia, contrasenia);
                    transporte.sendMessage(mail, mail.getRecipients(Message.RecipientType.TO));
                    transporte.close();

                    JOptionPane.showMessageDialog(null, "Correo Enviado\n Verifica tu bandeja de entrada");

                } catch (AddressException ex) {
                    //Logger.getLogger(olv2.class.getName()).log(Level.SEVERE, null, ex);
                } catch (MessagingException ex) {
                    //Logger.getLogger(olv2.class.getName()).log(Level.SEVERE, null, ex);
                }
                setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        new LogIn().setVisible(true);
                    }
                });
                this.dispose();
            }else{
               JOptionPane.showMessageDialog(null, "Correo incorrecto o no esta registrado");
               setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
               email.setText(""); ///
            }
        }


//        int bandera=0;
//        String recup=CorreoRecuperar.getText();
//        String name="",ape="",pass="";
//
//        if ((recup.equals("Inserta un correo electronico"))||(recup.equals(""))) {
//            javax.swing.JOptionPane.showMessageDialog(this, "Debe introducir un correo de recuperacion\n ","Aviso!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
//        }else{
//            LogIn login = new LogIn();
//            setCursor(new Cursor(Cursor.WAIT_CURSOR));
//            File file;
//            FileReader leer;
//            BufferedReader memoria;
//            String cadena,nombre="",apellido="",user="",password="",correo="",pregunta="",respuesta="";
//            file= new File("registro.txt");
//            try {
//                leer = new FileReader(file);
//                memoria = new BufferedReader(leer);
//                cadena="";
//                while (cadena!=null) {
//                    try {
//                        cadena=memoria.readLine();
//                        nombre=cadena;
//                        cadena=memoria.readLine();
//                        apellido=cadena;
//                        cadena=memoria.readLine();
//                        user=cadena;
//                        cadena=memoria.readLine();
//                        password=cadena;
//                        cadena=memoria.readLine();
//                        correo=cadena;
//                        cadena=memoria.readLine();
//                        pregunta=cadena;
//                        cadena=memoria.readLine();
//                        respuesta=cadena;
//
//                        if (cadena!=null) {
//
//                            if (recup.equals(correo) ) {//validar que el correo exista en el registro
//                                bandera=1;
//                                //                                JOptionPane.showInputDialog(null,"bandera ready");
//                                name=nombre; ape=apellido; pass=password;
//                                break;
//                            }//fin if el corrreo exista en el registro
//                            else{
//                                bandera=0;
//                                //                                            JOptionPane.showInputDialog(null,"bandera se resetea");
//                            }
//
//                        }//if salto de registro
//
//                    }//try lectura
//                    catch (IOException ex) {
//                        Logger.getLogger(Olvide.class.getName()).log(Level.SEVERE, null, ex);
//                    }
//
//                }//fin whle
//                try {
//                    memoria.close();
//                    leer.close();
//                } catch (IOException ex) {
//                    Logger.getLogger(Olvide.class.getName()).log(Level.SEVERE, null, ex);
//                }
//
//            }//try principal
//            catch (FileNotFoundException ex) {
//                Logger.getLogger(Olvide.class.getName()).log(Level.SEVERE, null, ex);
//            }
//
//            if (bandera==1) {
//                Properties propiedad = new Properties();
//                propiedad.setProperty("mail.smtp.host","smtp.gmail.com");
//                propiedad.setProperty("mail.smtp.starttls.enable","true");
//                propiedad.setProperty("mail.smtp.port","587");
//                propiedad.setProperty("mail.smtp.auth","true");
//
//                Session sesion = Session.getDefaultInstance(propiedad);
//
//                String correoEnvia = "mexajol@gmail.com";
//                String contrasenia = "mexajolpoo";
//                String destinatario=CorreoRecuperar.getText();
//                String asunto = "Recuperacion de Contraseña MexAjol";
//                String mensaje="Hola "+name+" "+ape+" nos has solicitado reestablecer tu password, para ingresar de nuevo a la plataforma"
//                + "\n Tu contraseña es: "+pass;
//
//                MimeMessage mail = new MimeMessage(sesion);
//                try {
//                    mail.setFrom(new InternetAddress(correoEnvia));
//                    mail.addRecipient(Message.RecipientType.TO, new InternetAddress(destinatario));
//                    mail.setSubject(asunto);
//                    mail.setText(mensaje);
//
//                    Transport transporte = sesion.getTransport("smtp");
//                    transporte.connect(correoEnvia, contrasenia);
//                    transporte.sendMessage(mail, mail.getRecipients(Message.RecipientType.TO));
//                    transporte.close();
//
//                    JOptionPane.showMessageDialog(null, "Correo Enviado\n Verifica tu bandeja de entrada");
//
//                } catch (AddressException ex) {
//                    Logger.getLogger(Olvide.class.getName()).log(Level.SEVERE, null, ex);
//                } catch (MessagingException ex) {
//                    Logger.getLogger(Olvide.class.getName()).log(Level.SEVERE, null, ex);
//                }
//                setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
//
//                java.awt.EventQueue.invokeLater(new Runnable() {
//                    public void run() {
//                        new LogIn().setVisible(true);
//                    }
//                });
//                this.dispose();
//
//            }else{
//                JOptionPane.showMessageDialog(null, "Correo incorrecto o no esta registrado");
//                setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
//                CorreoRecuperar.setText("");
//            }
//
        //else el campo esta lleno

    }//GEN-LAST:event_jButton1ActionPerformed

    private void AnswerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AnswerMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_AnswerMouseClicked

    private void AnswerKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AnswerKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_AnswerKeyReleased

    private void MinimizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinimizeActionPerformed
        this.setState(LogIn.ICONIFIED);
    }//GEN-LAST:event_MinimizeActionPerformed

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

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn().setVisible(true);
            }
        });
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void AnswerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnswerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AnswerActionPerformed
   
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
//            java.util.logging.Logger.getLogger(olv2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(olv2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(olv2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(olv2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new olv2().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Answer;
    private javax.swing.JButton Close;
    private javax.swing.JButton Minimize;
    private javax.swing.JComboBox<String> Question;
    private javax.swing.JButton back;
    private javax.swing.JTextField email;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    // End of variables declaration//GEN-END:variables
}
