/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

/**
 *
 * @author Michael
 */
public class ControladorPrincipal {
    //Atributos
    ControladorBatalla cb;
    ControladorJefeTerreno cjf;
    ControladorLogin cl;
    ControladorRegistro cr;
    ControladorVistaExito cve;
    ControladorVistaLoginRegistro cvlr;
    ControladorVistaPrincipal cvp;
    //Constructores
    public ControladorPrincipal(){
        cb = new ControladorBatalla();
        cjf = new ControladorJefeTerreno();
        cl = new ControladorLogin();
        cr = new ControladorRegistro();
        cve = new ControladorVistaExito();
        cvlr = new ControladorVistaLoginRegistro();
        cvp = new ControladorVistaPrincipal();
    
    }//Fin costructor
    
    
    //Metodos
    //Esto demas se puede hacer con polimorfismo....
    public void abrirMenuPrincipal(){
        cvp.mostrarVistaPrincipal();
        
    }
    public void abrirVistaLoginRegistro(){
        cvlr.mostrarVistaLoginRegistro();
    }
    
    
    
}
