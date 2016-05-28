/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import java.awt.event.ActionListener;

/**
 *
 * @author Michael
 */
public class VistaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VistaPrincipal
     */
    public VistaPrincipal() {
        initComponents();
    }
    
    //SETTER
    public void setListener(ActionListener e){
        btnJugar.addActionListener(e);
        btnReglas.addActionListener(e);
        btnSalir.addActionListener(e);
        btnCreditos.addActionListener(e);
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnJugar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnCreditos = new javax.swing.JButton();
        btnReglas = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 400));
        setPreferredSize(new java.awt.Dimension(600, 400));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnJugar.setText("JUGAR!");
        btnJugar.setActionCommand("jugar");
        getContentPane().add(btnJugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 178, 54));

        btnSalir.setText("Salir");
        btnSalir.setActionCommand("salir");
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 320, 102, 33));

        btnCreditos.setText("Creditos");
        btnCreditos.setActionCommand("creditos");
        getContentPane().add(btnCreditos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 91, 33));

        btnReglas.setText("Reglas");
        btnReglas.setActionCommand("reglas");
        getContentPane().add(btnReglas, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 266, 81, 32));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondos/principal.png"))); // NOI18N
        fondo.setMinimumSize(new java.awt.Dimension(610, 410));
        fondo.setPreferredSize(new java.awt.Dimension(610, 410));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreditos;
    private javax.swing.JButton btnJugar;
    private javax.swing.JButton btnReglas;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel fondo;
    // End of variables declaration//GEN-END:variables
}
