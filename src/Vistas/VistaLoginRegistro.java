
package Vistas;

import java.awt.event.ActionListener;

/**
 *
 * @author Michael
 */
public class VistaLoginRegistro extends javax.swing.JFrame {

    /**
     * Creates new form VistaLoginRegistro
     */
    public VistaLoginRegistro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        btnRegistro = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtReseña = new javax.swing.JTextArea();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 400));
        setPreferredSize(new java.awt.Dimension(605, 425));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, -1, -1));

        btnLogin.setText("LOGIN");
        btnLogin.setActionCommand("login");
        getContentPane().add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 286, 165, 52));

        btnRegistro.setText("REGISTRO");
        btnRegistro.setActionCommand("registro");
        getContentPane().add(btnRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(391, 286, 149, 52));

        btnCancelar.setText("Cancelar");
        btnCancelar.setActionCommand("cancelar");
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(515, 366, -1, -1));

        txtReseña.setEditable(false);
        txtReseña.setColumns(20);
        txtReseña.setRows(5);
        jScrollPane1.setViewportView(txtReseña);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 370, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondos/loginRegistro.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */

    //SETTERS
    public void setListener(ActionListener e){
        btnLogin.addActionListener(e);
        btnCancelar.addActionListener(e);
        btnRegistro.addActionListener(e);
        jButton1.addActionListener(e);
        
    }
    //Si entra desde la batalla se cambia el action command de la vista
    public void setActionComandLogin(String destino){
        this.btnLogin.setActionCommand(destino);
    }
    
    
    public void setMensaje (String mensaje){
        txtReseña.setText(mensaje);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnRegistro;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtReseña;
    // End of variables declaration//GEN-END:variables
}
