/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Vistas.VistaMenuBatalla;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javafx.scene.control.ComboBox;

/**
 *
 * @author Michael
 */
public class ControladorVistaMenuBatalla implements ActionListener, ItemListener{
    //Atributos
    private VistaMenuBatalla vmb;
    private ControladorVistaLoginRegistro cvlr;
    
    //Constructor
    public ControladorVistaMenuBatalla(){
        vmb = new VistaMenuBatalla();
        vmb.setActionListener(this);
        vmb.setItemListener(this);
        
    }
    //Metodos
    public void mostrarVista(){
        vmb.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        String opcion = e.getActionCommand();
        cvlr = new ControladorVistaLoginRegistro("desdeBatalla");
        switch(opcion){
            case "ingresoJ1":
                System.out.println("entre a ingreso1 desde batalla");
                vmb.setVisible(false);
                cvlr.mostrarVistaLoginRegistro("desdeBatalla");
                
//Otro constructor, para poder hacer otro login que no siga la misma secuencia de comandos!!!!!!!!XXX
                
            //Codigo boton INGJ1
                
            case "ingresoJ2":
                cvlr.mostrarVistaLoginRegistro("desdeBatalla");
                vmb.setVisible(false);
                //Codigo boton INGJ2
            case "ingresoJ3":
                cvlr.mostrarVistaLoginRegistro("desdeBatalla");
                vmb.setVisible(false);
                //Codigo boton INGJ3
            case "ingresoJ4":
                cvlr.mostrarVistaLoginRegistro("desdeBatalla");
                vmb.setVisible(false);
                //Codigo boton INGJ4
             
        }
        
        
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        ComboBox item = (ComboBox) e.getItem();
        
        //condiciones para el equipo
        
    }
        
        
}
    

