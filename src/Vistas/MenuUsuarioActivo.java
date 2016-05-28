/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import java.awt.event.ActionListener;
import javax.swing.JToggleButton;

/**
 *
 * @author Michael
 */
public class MenuUsuarioActivo extends javax.swing.JFrame {

    /**
     * Creates new form MenuUsuarioActivo
     */
    public MenuUsuarioActivo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupJugadoresBatalla = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnModificarPuzzleDatos = new javax.swing.JButton();
        tBtnBatalla = new javax.swing.JToggleButton();
        rBtn2J = new javax.swing.JRadioButton();
        rBtn3J = new javax.swing.JRadioButton();
        rBtn4J = new javax.swing.JRadioButton();
        btnJugar = new javax.swing.JButton();
        rBtn8J = new javax.swing.JRadioButton();
        rBtn16J = new javax.swing.JRadioButton();
        tBtnTorneo = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("Bienvenido ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, -1, 57));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("<Usuario>");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(291, 93, 174, -1));

        btnModificarPuzzleDatos.setText("Modificar puzzle de dados");
        btnModificarPuzzleDatos.setActionCommand("pzDados");
        getContentPane().add(btnModificarPuzzleDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 280, -1, -1));

        tBtnBatalla.setText("Batalla");
        tBtnBatalla.setActionCommand("batalla");
        getContentPane().add(tBtnBatalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 138, 161, -1));

        groupJugadoresBatalla.add(rBtn2J);
        rBtn2J.setText("2 Jugadores");
        getContentPane().add(rBtn2J, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 174, 99, -1));

        groupJugadoresBatalla.add(rBtn3J);
        rBtn3J.setText("3 Jugadores");
        getContentPane().add(rBtn3J, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 204, 99, 25));

        groupJugadoresBatalla.add(rBtn4J);
        rBtn4J.setText("4 Jugadores");
        getContentPane().add(rBtn4J, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 236, 99, 25));

        btnJugar.setText("Jugar!");
        btnJugar.setActionCommand("jugar");
        getContentPane().add(btnJugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, 150, 40));

        groupJugadoresBatalla.add(rBtn8J);
        rBtn8J.setText("8 Jugadores");
        getContentPane().add(rBtn8J, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 180, -1, -1));

        groupJugadoresBatalla.add(rBtn16J);
        rBtn16J.setText("16 Jugadores");
        getContentPane().add(rBtn16J, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 210, -1, -1));

        tBtnTorneo.setText("torneo");
        getContentPane().add(tBtnTorneo, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, 160, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Metodos
    //Listener
    public void setListener(ActionListener presionar){
        tBtnBatalla.addActionListener(presionar);
        tBtnTorneo.addActionListener(presionar);
        btnModificarPuzzleDatos.addActionListener(presionar);
        btnJugar.addActionListener(presionar);
    }//Fin listener
    //Setters
    public void setVisibleRBtn(boolean opcion){
        rBtn2J.setVisible(opcion);
        rBtn3J.setVisible(opcion);
        rBtn4J.setVisible(opcion);
    }//fin setVisibilidad
    public void setVisibleRBtnTorneo(boolean opcion){
        rBtn8J.setVisible(opcion);
        rBtn16J.setVisible(opcion);
    }
    
    //Getters
    public boolean getSelectBotonBatalla(){
        if (tBtnBatalla.isSelected()){
            return true;
        }else{
            return false;
        }
    }
        public boolean getSelectBotonTorneo(){
        if (tBtnTorneo.isSelected()){
            return true;
        }else{
            return false;
        }
    }

    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnJugar;
    private javax.swing.JButton btnModificarPuzzleDatos;
    private javax.swing.ButtonGroup groupJugadoresBatalla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton rBtn16J;
    private javax.swing.JRadioButton rBtn2J;
    private javax.swing.JRadioButton rBtn3J;
    private javax.swing.JRadioButton rBtn4J;
    private javax.swing.JRadioButton rBtn8J;
    private javax.swing.JToggleButton tBtnBatalla;
    private javax.swing.JToggleButton tBtnTorneo;
    // End of variables declaration//GEN-END:variables
}
