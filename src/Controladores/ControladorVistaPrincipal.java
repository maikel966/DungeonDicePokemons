/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Vistas.VistaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Michael
 */
public class ControladorVistaPrincipal implements ActionListener{

    //Atributos
    VistaPrincipal vp;
   ControladorVistaLoginRegistro cvlr;
    
    
    
    //Constructor
    public ControladorVistaPrincipal(){
        vp = new VistaPrincipal();//Objeto vista principal, titulo y su listener
        vp.setTitle("Menu Principal");
        cvlr = new ControladorVistaLoginRegistro();
        vp.setListener(this);
        
        
    }
    
    //METODOS
    public void mostrarVistaPrincipal(){
        vp.setVisible(true);
    }
    public void cerrarVentana(){
        vp.setVisible(false);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent accion) {
        
        if (accion.getActionCommand() =="jugar"){
            cvlr.mostrarVistaLoginRegistro();
            System.out.println("entre al login");
            cvlr.setMensaje("hola");
            cerrarVentana();
            
            
        }else if (accion.getActionCommand() == "creditos"){
            
            System.out.println("entre a creditos");
            //Agregar codigo cuando este hecha la vista de creditos...
            
        }else if (accion.getActionCommand() == "reglas"){
            System.out.println("entre a reglas");
            //Agregar codigo cuando este hecha la vista de reglas...
            
        }else if (accion.getActionCommand() == "salir"){
            System.out.println("entre a salir");
            System.exit(0);
            //Agregar el codigo para salir...
        }
        
    }
    
}
