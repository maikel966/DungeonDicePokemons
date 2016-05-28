/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Vistas.VistaLoginRegistro;
import Vistas.VistaTablero;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Michael
 */
public class ControladorVistaLoginRegistro implements ActionListener {
    //Atributos
    VistaLoginRegistro vlr;
    ControladorLogin cl;
    ControladorRegistro cr;
    ControladorVistaPrincipal cvp;
    //Constructor
    public ControladorVistaLoginRegistro(){
        vlr = new VistaLoginRegistro();
        vlr.setTitle("Login/Registro");
        vlr.setListener(this);
        
        cl = new ControladorLogin();
        cr = new ControladorRegistro();
    }
    public ControladorVistaLoginRegistro(String ubicacion){
        cl = new ControladorLogin();
        cl.mostrarVistaLogin(ubicacion);
        
    }
        
        /******CAMBIAR TODO A CONTROLADOR PRINCIPAL CON EL FIN DE 
         * NO CREAR UN OBJETO CONTROLADOR POR CADA VISTA
         * SINO QUE EN EL CONTROLADOR PRINCIPAL METER TODOS LOS OBJETOS 
         * Y DE AHÍ CREAR METODOS PARA ABRIR Y CERRAR VENTANAS, 
         * EN EL CODIGO QUEDARÁ MAS LIVIANO.....*/
         
        //Coontrolador del login
        
    
    //Metodos
    //Secuencial....
    public void mostrarVistaLoginRegistro(){
        vlr.setVisible(true);
    }
    //Desde el menu batalla
    public void mostrarVistaLoginRegistro(String batalla){
        vlr.setVisible(true);
        vlr.setActionComandLogin(batalla);
        
    }
    
    public void cerrarVentana(){
        vlr.setVisible(false);
    }
    public void setMensaje(String mensaje){
        vlr.setMensaje(mensaje);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //Si entra de forma secuencial (Inicial)
        if(e.getActionCommand()== "login"){
            cl.mostrarVistaLogin();
            cerrarVentana();
            System.out.println("entre al login");
            
        //Si entra desde la batalla
        }else if(e.getActionCommand() == "desdeBatalla"){
            cl.mostrarVistaLogin("desdeBatalla");
            cerrarVentana();
            System.out.println("entre al login desde batalla");
        
        }else if(e.getActionCommand() == "registro"){
            System.out.println("entre registrar");
            cr.mostrarVistaRegistro();
            cerrarVentana();
            
        }else if(e.getActionCommand() == "cancelar"){
            System.out.println("entre a cancelar");
            
            cvp = new ControladorVistaPrincipal();
            vlr.setVisible(false);
            cvp.mostrarVistaPrincipal();
            
        }else{
            ControladorTablero ct = new ControladorTablero();
            ct.mostrarTablero();
        }
        
    }
    
    
}
