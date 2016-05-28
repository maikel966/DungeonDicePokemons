/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Modelos.Casilla;
import Vistas.VistaTablero;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

/**
 *
 * @author ElTurco
 */
public class ControladorTablero implements ActionListener{
    //Atributos
    private VistaTablero vt = new VistaTablero();
    public Casilla[][] terreno = new Casilla[15][15];
    
    //Constructor
    public ControladorTablero(){
        JPanel tablero = vt.getPanel();
        tablero.setLayout(new GridLayout(15,15));
        for(byte x = 0; x<15;x++){
            for(byte y= 0; y<15;y++){
                terreno[x][y] = new Casilla();
                terreno[x][y].setActionCommand("casilla");
                terreno[x][y].setListener(this);
                tablero.add(terreno[x][y]);
                
            }//Creacion de columnas
        }//Creacion de filas
        terreno[0][0].setText("1,1");
        terreno[0][2].setText("0,2");
        terreno[2][0].setText("2,0");
        
    }//Fin constructor
    
    //Metodos
    public void mostrarTablero(){
        vt.setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
