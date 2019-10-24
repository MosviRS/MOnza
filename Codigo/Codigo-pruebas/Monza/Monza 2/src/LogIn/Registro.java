/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogIn;

import Entidades.Usuario;
import clases.Hash;
import static java.nio.charset.StandardCharsets.UTF_8;
import java.util.Base64;
import java.util.Base64.Encoder;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import metodos.SqlUsuarios;

/**
 *
 * @author Rasteck7
 */
public class Registro extends javax.swing.JFrame {

    /**
     * Creates new form Registro
     */
    public Registro() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Registro");
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
        Question = new javax.swing.JComboBox<>();
        jBGuardar = new javax.swing.JButton();
        jBLimpiar = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtuser = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        txtAmaterno = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        txtNombreUser = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        Ocultar = new javax.swing.JToggleButton();
        jLabel10 = new javax.swing.JLabel();
        txtRespuesta = new javax.swing.JTextField();
        jSeparator12 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        txtApaterno = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jSeparator13 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        Minimize = new javax.swing.JButton();
        Close = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jTFCorreo1 = new javax.swing.JTextField();
        jSeparator14 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        txtPassword2 = new javax.swing.JPasswordField();
        Ocultar2 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(243, 240, 235));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Question.setBackground(new java.awt.Color(33, 33, 33));
        Question.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 11)); // NOI18N
        Question.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una pregunta", "¿Cuál fue el nombre de tu primera mascota? ", "¿Cuál es tu comida favorita? ", "¿Cuál es el nombre de tu madre? ", "¿En qué ciudad naciste?", "¿Cuál es el segundo nombre de tu padre?", "¿Cuál es el nombre de tu primer profesor?" }));
        Question.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuestionActionPerformed(evt);
            }
        });
        jPanel1.add(Question, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 440, 290, 30));

        jBGuardar.setBackground(new java.awt.Color(243, 240, 235));
        jBGuardar.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        jBGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGM/s1.png"))); // NOI18N
        jBGuardar.setText("Guardar");
        jBGuardar.setBorder(null);
        jBGuardar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGM/s2.png"))); // NOI18N
        jBGuardar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGM/s2.png"))); // NOI18N
        jBGuardar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGM/s2.png"))); // NOI18N
        jBGuardar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGM/s2.png"))); // NOI18N
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(jBGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, 150, 60));

        jBLimpiar.setBackground(new java.awt.Color(243, 240, 235));
        jBLimpiar.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        jBLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGM/eraser1.png"))); // NOI18N
        jBLimpiar.setText("Limpiar");
        jBLimpiar.setBorder(null);
        jBLimpiar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGM/eraser2.png"))); // NOI18N
        jBLimpiar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGM/eraser2.png"))); // NOI18N
        jBLimpiar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGM/eraser2.png"))); // NOI18N
        jBLimpiar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGM/eraser2.png"))); // NOI18N
        jBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(jBLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 480, 140, 60));

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
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 510, 80, 60));

        jLabel5.setBackground(new java.awt.Color(235, 235, 235));
        jLabel5.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        jLabel5.setText("Usuario");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 60, 20));

        txtuser.setBackground(new java.awt.Color(243, 240, 235));
        txtuser.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtuser.setForeground(new java.awt.Color(102, 102, 102));
        txtuser.setText("Ingrese Usuario");
        txtuser.setBorder(null);
        txtuser.setCaretColor(new java.awt.Color(204, 51, 0));
        txtuser.setCaretPosition(0);
        txtuser.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtuser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtuserMouseClicked(evt);
            }
        });
        txtuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtuserActionPerformed(evt);
            }
        });
        jPanel1.add(txtuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 230, 30));

        jSeparator3.setBackground(new java.awt.Color(235, 235, 235));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 250, 20));

        jSeparator7.setBackground(new java.awt.Color(235, 235, 235));
        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 190, 250, 20));

        jLabel6.setBackground(new java.awt.Color(235, 235, 235));
        jLabel6.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        jLabel6.setText("Contraseña");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 120, 90, 20));

        jLabel7.setBackground(new java.awt.Color(235, 235, 235));
        jLabel7.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        jLabel7.setText("Apellido Materno");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 130, 20));

        jSeparator9.setBackground(new java.awt.Color(235, 235, 235));
        jSeparator9.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, 250, 10));

        txtAmaterno.setBackground(new java.awt.Color(243, 240, 235));
        txtAmaterno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAmaterno.setForeground(new java.awt.Color(102, 102, 102));
        txtAmaterno.setText("Ingrese A. Materno");
        txtAmaterno.setBorder(null);
        txtAmaterno.setCaretColor(new java.awt.Color(204, 51, 0));
        txtAmaterno.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtAmaterno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAmaternoMouseClicked(evt);
            }
        });
        jPanel1.add(txtAmaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, 230, 40));

        jSeparator11.setBackground(new java.awt.Color(235, 235, 235));
        jSeparator11.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 250, 20));

        txtNombreUser.setBackground(new java.awt.Color(243, 240, 235));
        txtNombreUser.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNombreUser.setForeground(new java.awt.Color(102, 102, 102));
        txtNombreUser.setText("Ingrese Nombre");
        txtNombreUser.setBorder(null);
        txtNombreUser.setCaretColor(new java.awt.Color(204, 51, 0));
        txtNombreUser.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtNombreUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNombreUserMouseClicked(evt);
            }
        });
        jPanel1.add(txtNombreUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 230, 30));

        jLabel9.setBackground(new java.awt.Color(235, 235, 235));
        jLabel9.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        jLabel9.setText("Pregunta de seguridad");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 410, 160, 20));

        txtPassword.setBackground(new java.awt.Color(243, 240, 235));
        txtPassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(102, 102, 102));
        txtPassword.setText("Inserte contraseña");
        txtPassword.setBorder(null);
        txtPassword.setCaretColor(new java.awt.Color(204, 51, 0));
        txtPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPasswordMouseClicked(evt);
            }
        });
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 150, 220, 30));

        Ocultar.setBackground(new java.awt.Color(242, 242, 242));
        Ocultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/oculto.png"))); // NOI18N
        Ocultar.setBorder(null);
        Ocultar.setBorderPainted(false);
        Ocultar.setContentAreaFilled(false);
        Ocultar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/ver.png"))); // NOI18N
        Ocultar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/ver.png"))); // NOI18N
        Ocultar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/ver.png"))); // NOI18N
        Ocultar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/ver.png"))); // NOI18N
        Ocultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OcultarActionPerformed(evt);
            }
        });
        jPanel1.add(Ocultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 160, 20, 20));

        jLabel10.setBackground(new java.awt.Color(235, 235, 235));
        jLabel10.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        jLabel10.setText("Nombre(s)");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 90, 20));

        txtRespuesta.setBackground(new java.awt.Color(243, 240, 235));
        txtRespuesta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtRespuesta.setForeground(new java.awt.Color(102, 102, 102));
        txtRespuesta.setText("Ingrese una respuesta");
        txtRespuesta.setBorder(null);
        txtRespuesta.setCaretColor(new java.awt.Color(204, 51, 0));
        txtRespuesta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtRespuesta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtRespuestaMouseClicked(evt);
            }
        });
        txtRespuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRespuestaActionPerformed(evt);
            }
        });
        jPanel1.add(txtRespuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 480, 270, 30));

        jSeparator12.setBackground(new java.awt.Color(235, 235, 235));
        jSeparator12.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 520, 270, 20));

        jLabel11.setBackground(new java.awt.Color(235, 235, 235));
        jLabel11.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        jLabel11.setText("Apellido Paterno");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 130, 20));

        txtApaterno.setBackground(new java.awt.Color(243, 240, 235));
        txtApaterno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtApaterno.setForeground(new java.awt.Color(102, 102, 102));
        txtApaterno.setText("Ingrese A. Paterno");
        txtApaterno.setBorder(null);
        txtApaterno.setCaretColor(new java.awt.Color(204, 51, 0));
        txtApaterno.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtApaterno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtApaternoMouseClicked(evt);
            }
        });
        jPanel1.add(txtApaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 230, 30));

        jSeparator10.setBackground(new java.awt.Color(235, 235, 235));
        jSeparator10.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, 250, 20));

        jLabel13.setBackground(new java.awt.Color(235, 235, 235));
        jLabel13.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        jLabel13.setText("Correo electronico");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 330, 130, 20));

        txtCorreo.setBackground(new java.awt.Color(243, 240, 235));
        txtCorreo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCorreo.setForeground(new java.awt.Color(102, 102, 102));
        txtCorreo.setText("Ingrese un correo electronico");
        txtCorreo.setBorder(null);
        txtCorreo.setCaretColor(new java.awt.Color(204, 51, 0));
        txtCorreo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtCorreo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCorreoMouseClicked(evt);
            }
        });
        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });
        jPanel1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 350, 230, 30));

        jSeparator13.setBackground(new java.awt.Color(235, 235, 235));
        jSeparator13.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 390, 250, 20));

        jLabel8.setFont(new java.awt.Font("Microsoft Tai Le", 0, 36)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGM/Register.png"))); // NOI18N
        jLabel8.setText("Registro");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 380, 70));

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

        jLabel14.setBackground(new java.awt.Color(235, 235, 235));
        jLabel14.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        jLabel14.setText("Correo electronico");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 330, 130, 20));

        jTFCorreo1.setBackground(new java.awt.Color(243, 240, 235));
        jTFCorreo1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTFCorreo1.setForeground(new java.awt.Color(102, 102, 102));
        jTFCorreo1.setText("Inserte un correo electronico");
        jTFCorreo1.setBorder(null);
        jTFCorreo1.setCaretColor(new java.awt.Color(204, 51, 0));
        jTFCorreo1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTFCorreo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTFCorreo1MouseClicked(evt);
            }
        });
        jTFCorreo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFCorreo1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTFCorreo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 350, 230, 30));

        jSeparator14.setBackground(new java.awt.Color(235, 235, 235));
        jSeparator14.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 390, 250, 20));

        jSeparator8.setBackground(new java.awt.Color(235, 235, 235));
        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 300, 250, 20));

        jLabel12.setBackground(new java.awt.Color(235, 235, 235));
        jLabel12.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        jLabel12.setText("Confirmar Contraseña");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 230, 170, 20));

        txtPassword2.setBackground(new java.awt.Color(243, 240, 235));
        txtPassword2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPassword2.setForeground(new java.awt.Color(102, 102, 102));
        txtPassword2.setText("Inserte contraseña");
        txtPassword2.setBorder(null);
        txtPassword2.setCaretColor(new java.awt.Color(204, 51, 0));
        txtPassword2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPassword2MouseClicked(evt);
            }
        });
        jPanel1.add(txtPassword2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 260, 220, 30));

        Ocultar2.setBackground(new java.awt.Color(242, 242, 242));
        Ocultar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/oculto.png"))); // NOI18N
        Ocultar2.setBorder(null);
        Ocultar2.setBorderPainted(false);
        Ocultar2.setContentAreaFilled(false);
        Ocultar2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/ver.png"))); // NOI18N
        Ocultar2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/ver.png"))); // NOI18N
        Ocultar2.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/ver.png"))); // NOI18N
        Ocultar2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/ver.png"))); // NOI18N
        Ocultar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ocultar2ActionPerformed(evt);
            }
        });
        jPanel1.add(Ocultar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 270, 20, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void QuestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuestionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QuestionActionPerformed

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        SqlUsuarios ModSQL= new SqlUsuarios();
        Usuario mod= new Usuario();
        
        String password= new String(txtPassword.getPassword());
        String passwordconfirma= new String(txtPassword2.getPassword());
        if(txtuser.getText().equals(" ") || txtuser.getText().equals("Ingrese Usuario") || txtNombreUser.getText().equals("Ingrese Nombre") || txtNombreUser.getText().equals("")||txtApaterno.getText().equals("Ingrese A. Paterno")|| txtApaterno.getText().equals("")||txtAmaterno.getText().equals("Ingrese A. Materno")||txtAmaterno.getText().equals("")
            || txtPassword.getText().equals("Inserte contraseña")|| txtPassword.getText().equals("")||txtPassword2.getText().equals("Inserte contraseña") ||txtPassword2.getText().equals("") || txtCorreo.getText().equals("Ingrese un correo electronico") ||txtCorreo.getText().equals("") ||txtRespuesta.getText().equals("")  ||txtRespuesta.getText().equals("Ingrese una respuesta")   ){
        JOptionPane.showMessageDialog(null,"Faltan Campos Por Llenar");
        }else{
            if(password.equals(passwordconfirma)){
                if(ModSQL.existeUsuario(txtuser.getText()) ==0){
                    if(ModSQL.esEmail(txtCorreo.getText())){
                        //String encriptado= Hash.sha1(password);
                        
                        Encoder encoder = Base64.getEncoder();
                        byte[] data = password.getBytes(UTF_8);
                        String encriptado = encoder.encodeToString(data);
                        //alta de los datos
                        mod.setUser(txtuser.getText());
                        mod.setNombreUser(txtNombreUser.getText());
                        mod.setTipo(2);
                        mod.setApaterno(txtApaterno.getText());
                        mod.setAmaterno(txtAmaterno.getText());
                        mod.setPassword(encriptado);
                        //alta de la pregunta
                        int preg=Question.getSelectedIndex();           
                            switch (preg){
                                case 1:
                                    mod.setPregunta(1);
                                    break;
                                case 2:
                                    mod.setPregunta(2);
                                    break;
                                case 3:
                                    mod.setPregunta(3);
                                    break;
                                case 4:
                                    mod.setPregunta(4);
                                    break;
                                case 5:
                                    mod.setPregunta(5);
                                    break;
                                case 6:
                                    mod.setPregunta(6);
                                    break;
                                default:
                                    JOptionPane.showMessageDialog(null, "Seleccione una Pregunta");
                                    break;
                            }
                         mod.setRespuesta(txtRespuesta.getText());
                         mod.setCorreo(txtCorreo.getText());                    
                         //confirma alta
                         if(ModSQL.registrar(mod)){
                             JOptionPane.showMessageDialog(null, "Registro Guardado");
                             limpiar();
                         }else {
                            JOptionPane.showMessageDialog(null, "Error al guardar");
                         }
                    }else{
                        JOptionPane.showMessageDialog(null, "Correo Electronico NO es correcto");
                    }     
                }else{
                    JOptionPane.showMessageDialog(null, "El usuario ya existe");
                }
            }else{
                JOptionPane.showMessageDialog(null,"La contraseñas no coincide \n Favor de Verificar");
            }
        
        }//
        
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_jBLimpiarActionPerformed

    private void txtuserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtuserMouseClicked
        // TODO add your handling code here:
        if (txtuser.getText().equals("Ingrese Usuario")) {
            txtuser.setText("");
        }
    }//GEN-LAST:event_txtuserMouseClicked

    private void txtAmaternoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAmaternoMouseClicked
        // TODO add your handling code here:
        if (txtAmaterno.getText().equals("Ingrese A. Materno")) {
            txtAmaterno.setText("");
        }
    }//GEN-LAST:event_txtAmaternoMouseClicked

    private void txtNombreUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreUserMouseClicked
        // TODO add your handling code here:
        if (txtNombreUser.getText().equals("Ingrese Nombre")) {
            txtNombreUser.setText("");
        }
    }//GEN-LAST:event_txtNombreUserMouseClicked

    private void txtPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPasswordMouseClicked
        // TODO add your handling code here:
        if (txtPassword.getText().equals("Inserte contraseña")) {
            txtPassword.setText("");
        }
    }//GEN-LAST:event_txtPasswordMouseClicked

    private void OcultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OcultarActionPerformed
        if (Ocultar.isSelected()==true) {
            txtPassword.setEchoChar((char)0);
        }else{
            txtPassword.setEchoChar('•');

        }
    }//GEN-LAST:event_OcultarActionPerformed

    private void txtRespuestaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtRespuestaMouseClicked
        // TODO add your handling code here:
        if (txtRespuesta.getText().equals("Ingrese una respuesta")) {
            txtRespuesta.setText("");
        }
    }//GEN-LAST:event_txtRespuestaMouseClicked

    private void txtRespuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRespuestaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRespuestaActionPerformed

    private void txtApaternoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtApaternoMouseClicked
        // TODO add your handling code here:
        if (txtApaterno.getText().equals("Ingrese A. Paterno")) {
            txtApaterno.setText("");
        }
    }//GEN-LAST:event_txtApaternoMouseClicked

    private void txtCorreoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCorreoMouseClicked
        // TODO add your handling code here:
        if (txtCorreo.getText().equals("Ingrese un correo electronico")) {
            txtCorreo.setText("");
        }
    }//GEN-LAST:event_txtCorreoMouseClicked

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

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
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn().setVisible(true); //abrir el FrameHome que es nuestro Menu
            }
        });
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    private void jTFCorreo1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTFCorreo1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFCorreo1MouseClicked

    private void jTFCorreo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFCorreo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFCorreo1ActionPerformed

    private void txtPassword2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPassword2MouseClicked
        // TODO add your handling code here:
        if (txtPassword2.getText().equals("Inserte contraseña")) {
            txtPassword2.setText("");
        }
    }//GEN-LAST:event_txtPassword2MouseClicked

    private void Ocultar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ocultar2ActionPerformed
        // TODO add your handling code here:
        if (Ocultar2.isSelected()==true) {
            txtPassword2.setEchoChar((char)0);
        }else{
            txtPassword2.setEchoChar('•');

        }
    }//GEN-LAST:event_Ocultar2ActionPerformed

    private void txtuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtuserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtuserActionPerformed
    private void limpiar (){
        txtuser.setText("Ingrese Usuario");
        txtNombreUser.setText("Ingrese Nombre");
        txtApaterno.setText("Ingrese A. Paterno");
        txtAmaterno.setText("Ingrese A. Materno");
        txtPassword.setText("Inserte contraseña");
        txtPassword2.setText("Inserte contraseña");
        txtCorreo.setText("Ingrese un correo electronico");
        txtRespuesta.setText("Ingrese una respuesta");
    }
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
//            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Registro().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Close;
    private javax.swing.JButton Minimize;
    private javax.swing.JToggleButton Ocultar;
    private javax.swing.JToggleButton Ocultar2;
    private javax.swing.JComboBox<String> Question;
    private javax.swing.JButton back;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField jTFCorreo1;
    private javax.swing.JTextField txtAmaterno;
    private javax.swing.JTextField txtApaterno;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombreUser;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JPasswordField txtPassword2;
    private javax.swing.JTextField txtRespuesta;
    private javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
}
