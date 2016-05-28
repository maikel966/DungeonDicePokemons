/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

/**
 *
 * @author ElTurco
 */
public class VistaPopMensaje extends javax.swing.JFrame {

    /**
     * Creates new form VistaPopMensaje
     */
    public VistaPopMensaje() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        lblMensajeEmergente = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Aceptar");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, -1, -1));

        lblMensajeEmergente.setText("jLabel1");
        lblMensajeEmergente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblMensajeEmergente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 260, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Metodos
    public void setMensaje(String mensaje){
        lblMensajeEmergente.setText(mensaje);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lblMensajeEmergente;
    // End of variables declaration//GEN-END:variables
}
