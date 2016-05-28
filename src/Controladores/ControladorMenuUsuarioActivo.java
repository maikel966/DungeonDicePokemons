/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Vistas.MenuUsuarioActivo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Michael
 */
public class ControladorMenuUsuarioActivo implements ActionListener {
    //Atributos
    private MenuUsuarioActivo mua;
    private ControladorVistaMenuBatalla cvmb;
    //Constructores
    public ControladorMenuUsuarioActivo(){
        mua = new MenuUsuarioActivo();
        cvmb = new ControladorVistaMenuBatalla();
        mua.setListener(this);
        mua.setVisibleRBtnTorneo(false);
        mua.setVisibleRBtn(false);
        
        
    }
    //Metodos
    public void mostrarMenuUsuarioActivo(){
        mua.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent accion) {
        if (accion.getActionCommand() == "batalla"){
            System.out.println("he presionado el boton");
            if (mua.getSelectBotonBatalla()){
                mua.setVisibleRBtn(true);
            }else{
                mua.setVisibleRBtn(false);
            }
            
        }else if (accion.getActionCommand() == "torneo"){
            System.out.println("He presionado el boton torneo");
            if (mua.getSelectBotonTorneo()){
                mua.setVisibleRBtnTorneo(true);
            }else{
                mua.setVisibleRBtnTorneo(false);
            }
            
        }else if(accion.getActionCommand() == "pzDados"){
            
        }else if(accion.getActionCommand() == "jugar"){
            mua.dispose();
            cvmb.mostrarVista();
            
        }
    }
}
