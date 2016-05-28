/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import javax.swing.JLabel;

public class VistaMenuBatalla extends javax.swing.JFrame {
    public VistaMenuBatalla() {
        initComponents();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblJugadores = new javax.swing.JLabel();
        lblEquipo = new javax.swing.JLabel();
        lblTipo = new javax.swing.JLabel();
        lblIngresoRegistro = new javax.swing.JLabel();
        lblDificultad = new javax.swing.JLabel();
        lblPuzzleDatos = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblJugador1 = new javax.swing.JLabel();
        lblJugador2 = new javax.swing.JLabel();
        lblJugador3 = new javax.swing.JLabel();
        lblJugador4 = new javax.swing.JLabel();
        cbEquipoJ1 = new javax.swing.JComboBox<>();
        cbEquipoJ2 = new javax.swing.JComboBox<>();
        cbEquipoJ3 = new javax.swing.JComboBox<>();
        cbEquipoJ4 = new javax.swing.JComboBox<>();
        cbTipoJ1 = new javax.swing.JComboBox<>();
        cbTipoJ2 = new javax.swing.JComboBox<>();
        cbTipoJ3 = new javax.swing.JComboBox<>();
        cbTipoJ4 = new javax.swing.JComboBox<>();
        btnIngresoJ1 = new javax.swing.JButton();
        btnIngresoJ2 = new javax.swing.JButton();
        btnIngresoJ3 = new javax.swing.JButton();
        btnIngresoJ4 = new javax.swing.JButton();
        cbDificultadJ1 = new javax.swing.JComboBox<>();
        cbDificultadJ2 = new javax.swing.JComboBox<>();
        cbDificultadJ3 = new javax.swing.JComboBox<>();
        cbDificultadJ4 = new javax.swing.JComboBox<>();
        btnPuzzleDadosJ1 = new javax.swing.JButton();
        btnPuzzleDadosJ2 = new javax.swing.JButton();
        btnPuzzleDadosJ3 = new javax.swing.JButton();
        btnPuzzleDadosJ4 = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 400));
        setResizable(false);
        getContentPane().setLayout(null);

        lblJugadores.setText("Jugadores");
        getContentPane().add(lblJugadores);
        lblJugadores.setBounds(40, 70, 51, 15);

        lblEquipo.setText("Equipo");
        getContentPane().add(lblEquipo);
        lblEquipo.setBounds(130, 70, 50, 15);

        lblTipo.setText("Tipo");
        getContentPane().add(lblTipo);
        lblTipo.setBounds(220, 70, 20, 15);

        lblIngresoRegistro.setText("Ingreso/Registro");
        getContentPane().add(lblIngresoRegistro);
        lblIngresoRegistro.setBounds(310, 70, 79, 15);

        lblDificultad.setText("Dificultad");
        getContentPane().add(lblDificultad);
        lblDificultad.setBounds(480, 70, 44, 15);

        lblPuzzleDatos.setText("PuzzleDados");
        getContentPane().add(lblPuzzleDatos);
        lblPuzzleDatos.setBounds(630, 70, 63, 15);

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Batalla");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(330, 20, 194, 24);

        lblJugador1.setText("Jugador 1: ");
        getContentPane().add(lblJugador1);
        lblJugador1.setBounds(40, 120, 54, 20);

        lblJugador2.setText("Jugador 2:");
        getContentPane().add(lblJugador2);
        lblJugador2.setBounds(40, 180, 54, 20);

        lblJugador3.setText("Jugador 3:");
        getContentPane().add(lblJugador3);
        lblJugador3.setBounds(40, 240, 53, 20);

        lblJugador4.setText("Jugador 4:");
        getContentPane().add(lblJugador4);
        lblJugador4.setBounds(40, 300, 52, 15);

        cbEquipoJ1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));
        getContentPane().add(cbEquipoJ1);
        cbEquipoJ1.setBounds(120, 120, 40, 24);

        cbEquipoJ2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));
        getContentPane().add(cbEquipoJ2);
        cbEquipoJ2.setBounds(120, 180, 40, 24);

        cbEquipoJ3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));
        getContentPane().add(cbEquipoJ3);
        cbEquipoJ3.setBounds(120, 240, 40, 24);

        cbEquipoJ4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));
        getContentPane().add(cbEquipoJ4);
        cbEquipoJ4.setBounds(120, 300, 40, 24);

        cbTipoJ1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Usuario", "PNJ" }));
        cbTipoJ1.setPreferredSize(new java.awt.Dimension(50, 20));
        getContentPane().add(cbTipoJ1);
        cbTipoJ1.setBounds(190, 120, 70, 25);

        cbTipoJ2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Usuario", "PNJ" }));
        getContentPane().add(cbTipoJ2);
        cbTipoJ2.setBounds(190, 180, 70, 20);

        cbTipoJ3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Usuario", "PNJ" }));
        cbTipoJ3.setPreferredSize(new java.awt.Dimension(50, 20));
        getContentPane().add(cbTipoJ3);
        cbTipoJ3.setBounds(190, 240, 70, 20);

        cbTipoJ4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Usuario", "PNJ" }));
        cbTipoJ4.setMinimumSize(new java.awt.Dimension(50, 20));
        cbTipoJ4.setPreferredSize(new java.awt.Dimension(50, 20));
        getContentPane().add(cbTipoJ4);
        cbTipoJ4.setBounds(190, 300, 70, 20);

        btnIngresoJ1.setText("Ingreso/Registro");
        getContentPane().add(btnIngresoJ1);
        btnIngresoJ1.setBounds(290, 120, 120, 25);

        btnIngresoJ2.setText("Ingreso/Registro");
        btnIngresoJ2.setToolTipText("");
        getContentPane().add(btnIngresoJ2);
        btnIngresoJ2.setBounds(290, 180, 120, 25);

        btnIngresoJ3.setText("Ingreso/Registro");
        getContentPane().add(btnIngresoJ3);
        btnIngresoJ3.setBounds(290, 240, 120, 25);

        btnIngresoJ4.setText("Ingreso/Registro");
        getContentPane().add(btnIngresoJ4);
        btnIngresoJ4.setBounds(290, 300, 120, 25);

        cbDificultadJ1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Facil", "Medio", "Dificil" }));
        getContentPane().add(cbDificultadJ1);
        cbDificultadJ1.setBounds(470, 120, 56, 24);

        cbDificultadJ2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Facil", "Medio", "Dificil" }));
        getContentPane().add(cbDificultadJ2);
        cbDificultadJ2.setBounds(470, 180, 56, 24);

        cbDificultadJ3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Facil", "Medio", "Dificil" }));
        getContentPane().add(cbDificultadJ3);
        cbDificultadJ3.setBounds(470, 240, 58, 24);

        cbDificultadJ4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Facil", "Medio", "Dificil" }));
        getContentPane().add(cbDificultadJ4);
        cbDificultadJ4.setBounds(470, 300, 57, 24);

        btnPuzzleDadosJ1.setText("Modificar Puzzle Dados");
        getContentPane().add(btnPuzzleDadosJ1);
        btnPuzzleDadosJ1.setBounds(580, 120, 157, 25);

        btnPuzzleDadosJ2.setText("Modificar Puzzle Dados");
        getContentPane().add(btnPuzzleDadosJ2);
        btnPuzzleDadosJ2.setBounds(580, 180, 157, 25);

        btnPuzzleDadosJ3.setText("Modificar Puzzle Dados");
        getContentPane().add(btnPuzzleDadosJ3);
        btnPuzzleDadosJ3.setBounds(579, 240, 160, 25);

        btnPuzzleDadosJ4.setText("Modificar Puzzle Dados");
        getContentPane().add(btnPuzzleDadosJ4);
        btnPuzzleDadosJ4.setBounds(578, 300, 160, 25);

        btnCancelar.setText("Cancelar");
        getContentPane().add(btnCancelar);
        btnCancelar.setBounds(616, 367, 77, 25);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(10, 280, 724, 2);
        getContentPane().add(jSeparator5);
        jSeparator5.setBounds(30, 220, 710, 2);
        getContentPane().add(jSeparator6);
        jSeparator6.setBounds(10, 160, 720, 10);
        getContentPane().add(jSeparator7);
        jSeparator7.setBounds(10, 100, 730, 10);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Listener
    public void setActionListener(ActionListener presionar){
        btnCancelar.addActionListener(presionar);
        btnIngresoJ1.addActionListener(presionar);
        btnIngresoJ2.addActionListener(presionar);
        btnIngresoJ3.addActionListener(presionar);
        btnIngresoJ4.addActionListener(presionar);
        btnPuzzleDadosJ1.addActionListener(presionar);
        btnPuzzleDadosJ2.addActionListener(presionar);
        btnPuzzleDadosJ3.addActionListener(presionar);
        btnPuzzleDadosJ4.addActionListener(presionar);
    }
    public void setItemListener(ItemListener item){
        cbDificultadJ1.addItemListener(item);
        cbDificultadJ2.addItemListener(item);
        cbDificultadJ3.addItemListener(item);
        cbDificultadJ4.addItemListener(item);
        cbEquipoJ1.addItemListener(item);
        cbEquipoJ2.addItemListener(item);
        cbEquipoJ3.addItemListener(item);
        cbEquipoJ4.addItemListener(item);
        cbTipoJ1.addItemListener(item);
        cbTipoJ2.addItemListener(item);
        cbTipoJ3.addItemListener(item);
        cbTipoJ4.addItemListener(item);
    }
    
    public void setNombreUsuario(JLabel usuario, String nombreUsuario){
        usuario.setText(nombreUsuario);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnIngresoJ1;
    private javax.swing.JButton btnIngresoJ2;
    private javax.swing.JButton btnIngresoJ3;
    private javax.swing.JButton btnIngresoJ4;
    private javax.swing.JButton btnPuzzleDadosJ1;
    private javax.swing.JButton btnPuzzleDadosJ2;
    private javax.swing.JButton btnPuzzleDadosJ3;
    private javax.swing.JButton btnPuzzleDadosJ4;
    private javax.swing.JComboBox<String> cbDificultadJ1;
    private javax.swing.JComboBox<String> cbDificultadJ2;
    private javax.swing.JComboBox<String> cbDificultadJ3;
    private javax.swing.JComboBox<String> cbDificultadJ4;
    private javax.swing.JComboBox<String> cbEquipoJ1;
    private javax.swing.JComboBox<String> cbEquipoJ2;
    private javax.swing.JComboBox<String> cbEquipoJ3;
    private javax.swing.JComboBox<String> cbEquipoJ4;
    private javax.swing.JComboBox<String> cbTipoJ1;
    private javax.swing.JComboBox<String> cbTipoJ2;
    private javax.swing.JComboBox<String> cbTipoJ3;
    private javax.swing.JComboBox<String> cbTipoJ4;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel lblDificultad;
    private javax.swing.JLabel lblEquipo;
    private javax.swing.JLabel lblIngresoRegistro;
    private javax.swing.JLabel lblJugador1;
    private javax.swing.JLabel lblJugador2;
    private javax.swing.JLabel lblJugador3;
    private javax.swing.JLabel lblJugador4;
    private javax.swing.JLabel lblJugadores;
    private javax.swing.JLabel lblPuzzleDatos;
    private javax.swing.JLabel lblTipo;
    // End of variables declaration//GEN-END:variables
}
