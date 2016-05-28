/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Michael
 */
public class ControladorVistaExito implements ActionListener{
    
    //Atributos
    VistaExito ve;
    //Constructor
    
    public ControladorVistaExito(){
        ve = new VistaExito();
    }
    
    //Metodos

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand() == "continuar"){
            
        }
    }
    
    
}
