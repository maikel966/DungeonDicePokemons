package Vistas;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class VistaTablero extends javax.swing.JFrame {

    /**
     * Creates new form VistaBatalla
     */
    public VistaTablero() {
        initComponents();
        panelTerreno.setLayout(new GridLayout(15,15));
    }
    //Metodos
    public JPanel getPanel(){
        return panelTerreno;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblJugador = new javax.swing.JLabel();
        barraVida = new javax.swing.JProgressBar();
        lblAtaque = new javax.swing.JLabel();
        lblMover = new javax.swing.JLabel();
        lblMagia = new javax.swing.JLabel();
        lblTrampa = new javax.swing.JLabel();
        btnAtacar = new javax.swing.JButton();
        btnMover = new javax.swing.JButton();
        cmbxMagia = new javax.swing.JComboBox<>();
        cmbxTrampas = new javax.swing.JComboBox<>();
        btnMagia = new javax.swing.JButton();
        btnTrampa = new javax.swing.JButton();
        btnLanzarDados = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        panelTerreno = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));

        lblJugador.setText("<Nombre Jugador>");

        lblAtaque.setText("0");

        lblMover.setText("0");

        lblMagia.setText("0");

        lblTrampa.setText("0");

        btnAtacar.setText("Atacar");

        btnMover.setText("Mover");

        cmbxMagia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lluvia torrencial", "Hierbas venenosas", "Meteorito de fuego" }));

        cmbxTrampas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Trampa de osos", "Trampa de ladrones", "Renacer de los muertos" }));

        btnMagia.setText("Activar");

        btnTrampa.setText("Colocar");

        btnLanzarDados.setText("Lanzar Dados");

        jLabel1.setText("GIFT DE LA CRIATURA MOVIENDOSE");

        panelTerreno.setEnabled(false);
        panelTerreno.setMaximumSize(new java.awt.Dimension(448, 448));
        panelTerreno.setPreferredSize(new java.awt.Dimension(448, 448));

        javax.swing.GroupLayout panelTerrenoLayout = new javax.swing.GroupLayout(panelTerreno);
        panelTerreno.setLayout(panelTerrenoLayout);
        panelTerrenoLayout.setHorizontalGroup(
            panelTerrenoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 448, Short.MAX_VALUE)
        );
        panelTerrenoLayout.setVerticalGroup(
            panelTerrenoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 448, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(panelTerreno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(lblAtaque)
                                            .addComponent(lblMagia)
                                            .addComponent(lblTrampa)
                                            .addComponent(lblMover))
                                        .addGap(34, 34, 34)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btnMover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cmbxMagia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cmbxTrampas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnAtacar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnLanzarDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addComponent(barraVida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnMagia)
                                    .addComponent(btnTrampa))
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblJugador)
                                .addGap(129, 129, 129))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelTerreno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblJugador)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(barraVida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAtacar)
                            .addComponent(lblAtaque))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnMover)
                            .addComponent(lblMover))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbxMagia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMagia)
                            .addComponent(lblMagia))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbxTrampas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTrampa)
                            .addComponent(lblTrampa))
                        .addGap(18, 18, 18)
                        .addComponent(btnLanzarDados, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))))
        );

        panelTerreno.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar barraVida;
    private javax.swing.JButton btnAtacar;
    private javax.swing.JButton btnLanzarDados;
    private javax.swing.JButton btnMagia;
    private javax.swing.JButton btnMover;
    private javax.swing.JButton btnTrampa;
    private javax.swing.JComboBox<String> cmbxMagia;
    private javax.swing.JComboBox<String> cmbxTrampas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAtaque;
    private javax.swing.JLabel lblJugador;
    private javax.swing.JLabel lblMagia;
    private javax.swing.JLabel lblMover;
    private javax.swing.JLabel lblTrampa;
    private javax.swing.JPanel panelTerreno;
    // End of variables declaration//GEN-END:variables
}
