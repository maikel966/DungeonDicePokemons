package Vistas;

import java.awt.event.ActionListener;
import Controladores.ControladorRegistro;
import java.awt.event.MouseListener;
import javax.swing.Icon;

public class VistaJefeTerreno extends javax.swing.JFrame {
    //Atributos

    //Constructor
    public VistaJefeTerreno() {
        initComponents();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrupo = new javax.swing.ButtonGroup();
        btnAceptar = new javax.swing.JButton();
        btnJefeTerreno1 = new javax.swing.JRadioButton();
        btnJefeTerreno2 = new javax.swing.JRadioButton();
        btnJefeTerreno3 = new javax.swing.JRadioButton();
        btnJefeTerreno4 = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDatos = new javax.swing.JTextArea();
        imgJefeTerreno = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAceptar.setText("Aceptar");
        getContentPane().add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 530, 140, 30));

        btnGrupo.add(btnJefeTerreno1);
        btnJefeTerreno1.setText("JefeTerreno1");
        getContentPane().add(btnJefeTerreno1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, -1, -1));

        btnGrupo.add(btnJefeTerreno2);
        btnJefeTerreno2.setText("JefeTerreno2");
        getContentPane().add(btnJefeTerreno2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, -1, -1));

        btnGrupo.add(btnJefeTerreno3);
        btnJefeTerreno3.setText("JefeTerreno3");
        getContentPane().add(btnJefeTerreno3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 370, -1, -1));

        btnGrupo.add(btnJefeTerreno4);
        btnJefeTerreno4.setText("JefeTerreno4");
        getContentPane().add(btnJefeTerreno4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 480, -1, -1));

        jScrollPane1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtDatos.setEditable(false);
        txtDatos.setBackground(new java.awt.Color(255, 255, 250));
        txtDatos.setColumns(20);
        txtDatos.setRows(5);
        txtDatos.setTabSize(7);
        txtDatos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(txtDatos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, 230, 130));
        getContentPane().add(imgJefeTerreno, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, -1, -1));

        lblUsuario.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 220, -1));

        btnCancelar.setText("Cancelar");
        btnCancelar.setActionCommand("cancelar");
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 550, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondos/laboratorio.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaJefeTerreno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaJefeTerreno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaJefeTerreno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaJefeTerreno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaJefeTerreno().setVisible(true);
            }
        });
    }
    public void setListener(ActionListener interaccion){
        btnGrupo.getSelection();
        btnJefeTerreno1.addActionListener(interaccion);
        btnJefeTerreno2.addActionListener(interaccion);
        btnJefeTerreno3.addActionListener(interaccion);
        btnJefeTerreno4.addActionListener(interaccion);
        btnAceptar.addActionListener(interaccion);
        btnCancelar.addActionListener(interaccion);
    }
    public boolean getJefeTerreno1(){
        return btnJefeTerreno1.isSelected();
    }
    public boolean getJefeTerreno2(){
        return btnJefeTerreno2.isSelected();
    }
    public boolean getJefeTerreno3(){
        return btnJefeTerreno3.isSelected();
    }
    public boolean getJefeTerreno4(){
        return btnJefeTerreno4.isSelected();
    }
    public void setImagen(Icon icon){
        imgJefeTerreno.setIcon(icon);
    }
    public void setImgLbl(String mensaje){
        imgJefeTerreno.setText(mensaje);
    }
    public void setBtnJT1(String mensaje){
        btnJefeTerreno1.setText(mensaje);
    }
    public void setBtnJT2(String mensaje){
        btnJefeTerreno2.setText(mensaje);
    }
    public void setBtnJT3(String mensaje){
        btnJefeTerreno3.setText(mensaje);
    }
    public void setBtnJT4(String mensaje){
        btnJefeTerreno4.setText(mensaje);
    }
    public void setDatos(String mensaje){
        txtDatos.setText(mensaje);        
    }
    public void setJugador(String nombre){
        lblUsuario.setText(nombre);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.ButtonGroup btnGrupo;
    private javax.swing.JRadioButton btnJefeTerreno1;
    private javax.swing.JRadioButton btnJefeTerreno2;
    private javax.swing.JRadioButton btnJefeTerreno3;
    private javax.swing.JRadioButton btnJefeTerreno4;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel imgJefeTerreno;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTextArea txtDatos;
    // End of variables declaration//GEN-END:variables
}