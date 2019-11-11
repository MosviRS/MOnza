/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PanelConrtrol;

import LogIn.LogIn;
import static PanelConrtrol.PC.email1;
import java.sql.Connection;
import javax.swing.JOptionPane;
import metodos.ManipulaDBC;
import metodos.SqLNotas;

/**
 *
 * @author uriel
 */
public class InfoClientes extends javax.swing.JFrame {

    /**
     * Creates new form InfoClientes
     */
    PC claasepc;
    Connection con;
    SqLNotas sqlnotas= new SqLNotas();
    public InfoClientes() {
        initComponents();
        this.setLocationRelativeTo(null);
    
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
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        Minimize = new javax.swing.JButton();
        Close = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        Ap = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        Am = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tel = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        jScrollPane7 = new javax.swing.JScrollPane();
        dir = new javax.swing.JTextArea();

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

        jPanel1.setBackground(new java.awt.Color(243, 240, 235));
        jPanel1.setPreferredSize(new java.awt.Dimension(577, 383));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(45, 150, 129));
        jLabel1.setFont(new java.awt.Font("Microsoft Tai Le", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 159, 28));
        jLabel1.setText("Datos del Cliente");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 400, 50));

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
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 330, 130, 40));

        jLabel3.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        jLabel3.setText("Nombre");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 250, 20));

        Name.setBackground(new java.awt.Color(242, 242, 242));
        Name.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Name.setForeground(new java.awt.Color(102, 102, 102));
        Name.setText("Inserte Nombre");
        Name.setBorder(null);
        Name.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NameMouseClicked(evt);
            }
        });
        Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameActionPerformed(evt);
            }
        });
        Name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                NameKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                NameKeyReleased(evt);
            }
        });
        jPanel1.add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 250, 30));

        jSeparator7.setBackground(new java.awt.Color(235, 235, 235));
        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 250, 20));

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
        jPanel1.add(Minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, -1, 40));

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
        jPanel1.add(Close, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, -1, 40));

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
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 80, 60));

        jLabel4.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        jLabel4.setText("Apellido Paterno");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 250, 20));

        Ap.setBackground(new java.awt.Color(242, 242, 242));
        Ap.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Ap.setForeground(new java.awt.Color(102, 102, 102));
        Ap.setText("Inserte Apellido Paterno");
        Ap.setBorder(null);
        Ap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ApMouseClicked(evt);
            }
        });
        Ap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApActionPerformed(evt);
            }
        });
        Ap.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ApKeyReleased(evt);
            }
        });
        jPanel1.add(Ap, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 250, 30));

        jSeparator8.setBackground(new java.awt.Color(235, 235, 235));
        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 250, 10));

        jLabel5.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        jLabel5.setText("Apellido Materno");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 250, 20));

        Am.setBackground(new java.awt.Color(242, 242, 242));
        Am.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Am.setForeground(new java.awt.Color(102, 102, 102));
        Am.setText("Inserte Apellido Materno");
        Am.setBorder(null);
        Am.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AmMouseClicked(evt);
            }
        });
        Am.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AmActionPerformed(evt);
            }
        });
        Am.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                AmKeyReleased(evt);
            }
        });
        jPanel1.add(Am, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 250, 30));

        jSeparator9.setBackground(new java.awt.Color(235, 235, 235));
        jSeparator9.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 250, 20));

        jLabel6.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        jLabel6.setText("Dirección");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 250, -1));

        jLabel7.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        jLabel7.setText("Teléfono");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, 250, -1));

        tel.setBackground(new java.awt.Color(242, 242, 242));
        tel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tel.setForeground(new java.awt.Color(102, 102, 102));
        tel.setText("Inserte Telefono");
        tel.setBorder(null);
        tel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                telMouseClicked(evt);
            }
        });
        tel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                telKeyReleased(evt);
            }
        });
        jPanel1.add(tel, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, 270, 30));

        jSeparator11.setBackground(new java.awt.Color(235, 235, 235));
        jSeparator11.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, 270, 10));

        dir.setColumns(20);
        dir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dir.setRows(5);
        jScrollPane7.setViewportView(dir);

        jPanel1.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 290, 80));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 710, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void telKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_telKeyReleased

    private void telMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_telMouseClicked
        // TODO add your handling code here:
        if (tel.getText().equals("Inserte Telefono")) {
            tel.setText("");
        }
    }//GEN-LAST:event_telMouseClicked

    private void AmKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AmKeyReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_AmKeyReleased

    private void AmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AmMouseClicked
        // TODO add your handling code here:
        if (Am.getText().equals("Inserte Apellido Materno")) {
            Am.setText("");
        }
    }//GEN-LAST:event_AmMouseClicked

    private void ApKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ApKeyReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_ApKeyReleased

    private void ApMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ApMouseClicked
        // TODO add your handling code here:
       if (Ap.getText().equals("Inserte Apellido Paterno")) {
            Ap.setText("");
        }
    }//GEN-LAST:event_ApMouseClicked

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelConrtrol.PC().setVisible(true);
            }
        });
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

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

    private void NameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NameMouseClicked
        // TODO add your handling code here:
         if (Name.getText().equals("Inserte Nombre")) {
            Name.setText("");
        }
    }//GEN-LAST:event_NameMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
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
        //        }//else el campo esta lleno
        
        claasepc.p.setNombre(Name.getText());
        claasepc.p.setAp(Ap.getText());
        claasepc.p.setAm(Am.getText());
        claasepc.p.setTelefono(tel.getText());
        claasepc.p.setDireccion(dir.getText());
        claasepc.p.setIdcliente(tel.getText());
        
        sqlnotas.insertarclioentes(claasepc.p,this);
        sqlnotas.insertarnotas(claasepc.p, this);
        sqlnotas.insertabono(claasepc.p, this);
        sqlnotas.insertentregas(claasepc.p,claasepc.op, this);
        sqlnotas.insertbitacora(claasepc.bit, this);
        sqlnotas.prodNote(claasepc.auxrr, claasepc.p.getNo_nota(), this);
        int dialog = JOptionPane.DEFAULT_OPTION;
                JOptionPane.showConfirmDialog(null, "Nota registrada con exito! :3","Saved successfully!",dialog);
                
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PC().setVisible(true);
            }
        });
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseReleased
        // TODO add your handling code here:
     
    }//GEN-LAST:event_jButton1MouseReleased

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed

    }//GEN-LAST:event_jButton1MousePressed

    private void NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameActionPerformed
        // TODO add your handling code here:
        if (Ap.getText().equals("Inserte Apellido Paterno")) {
            Ap.setText("");
        }
        Ap.requestFocus ();
    }//GEN-LAST:event_NameActionPerformed

    private void AmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AmActionPerformed
        // TODO add your handling code here:
        if (tel.getText().equals("Inserte Telefono")) {
            tel.setText("");
        }
        tel.requestFocus ();
    }//GEN-LAST:event_AmActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        con= ManipulaDBC.conectaDB();
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        con= ManipulaDBC.conectaDB();
    }//GEN-LAST:event_formWindowClosed

    private void ApActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApActionPerformed
        // TODO add your handling code here:
        if (Am.getText().equals("Inserte Apellido Materno")) {
            Am.setText("");
        }
        Am.requestFocus ();
    }//GEN-LAST:event_ApActionPerformed

    private void NameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NameKeyReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_NameKeyReleased

    private void NameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NameKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameKeyPressed

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
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(InfoClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(InfoClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(InfoClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(InfoClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new InfoClientes().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Am;
    private javax.swing.JTextField Ap;
    private javax.swing.JButton Close;
    private javax.swing.JButton Minimize;
    private javax.swing.JTextField Name;
    private javax.swing.JButton back;
    private javax.swing.JTextArea dir;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField tel;
    // End of variables declaration//GEN-END:variables
}
