/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;


/**
 *
 * @author ElTurco
 */
public class Casilla extends JButton{
    
    //Atributos
    int posicionColumna;
    int posicionFila;
    ImageIcon pasto;
    ImageIcon superficie;
    //Constructor
    public Casilla(){

    }
    public void setListener(ActionListener presionar){
        this.addActionListener(presionar);
    }
    public boolean isCasillaSelected(){
        if (this.isSelected() == true){
            System.out.println("fui presionado");
            return true;
        }else{
            System.out.println("fui presionado");
            return false;
        }
    }
    
    //Metodos


        
}
    

