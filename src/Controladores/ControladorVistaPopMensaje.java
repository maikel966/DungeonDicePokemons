/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Vistas.VistaPopMensaje;

/**
 *
 * @author ElTurco
 */
public class ControladorVistaPopMensaje {
    //Atributos
    private VistaPopMensaje vpm;
    //Constructores
    ControladorVistaPopMensaje(){
        vpm = new VistaPopMensaje();
        
    }
    //Metodos
    public void mostrarMensaje(String mensaje){
        vpm.setMensaje(mensaje);
    }
    public void mostrarVentana(){
        vpm.setVisible(true);
    }
}
