/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Vistas.VistaMenuBatalla;

/**
 *
 * @author ElTurco
 */
public class ControladorMenuBatalla {
    //Atributos
    private VistaMenuBatalla vmb;
    //Constructor
    public ControladorMenuBatalla(){
        vmb = new VistaMenuBatalla();
        
    }
    
    //Metodos
    public void mostrarVistaMenuBatalla(){
        vmb.setVisible(true);
    }
    
}
