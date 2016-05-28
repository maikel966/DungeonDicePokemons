/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Vistas.VistaLogin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Michael
 */
public class ControladorLogin implements ActionListener{
    //Atributo
    VistaLogin vl;
    ControladorVistaLoginRegistro cvlr;
    ControladorMenuUsuarioActivo mua;
    ControladorVistaMenuBatalla cvmb;
    
    //Constructor
    ControladorLogin(){
        vl = new VistaLogin();
        vl.setListener(this);
        mua = new ControladorMenuUsuarioActivo();
        cvmb = new ControladorVistaMenuBatalla();
    }
    //Metodos
    //Mostrar
    public void mostrarVistaLogin(){
        vl.setVisible(true);
    }
    public void mostrarVistaLogin(String destino){
        vl.setVisible(true);
        vl.setActionCommandBoton(destino);
        
    }
    // Listener de acciones
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand() == "ingresar"){
            System.out.println("entre a ingresar");
            if (validarUsuario(vl.getUsuario(),vl.getContrasena())){
                System.out.println("usuario valido");
                vl.dispose();
                mua.mostrarMenuUsuarioActivo();
               
            }else{
                System.out.println("usuario invalido");
                }
        }else if(e.getActionCommand() == "desdeBatalla"){
            System.out.println("entre a ingresar desde la batalla");
            if (validarUsuario(vl.getUsuario(),vl.getContrasena())){
                System.out.println("usuario valido");
                System.out.println("volviendo al menu de batalla");
                cvmb.mostrarVista();
                vl.dispose();
                }
            
        }else if(e.getActionCommand()=="cancelar"){
            System.out.println("entre a cancelar");
            cvlr = new ControladorVistaLoginRegistro();
            vl.setVisible(false);
            cvlr.mostrarVistaLoginRegistro();
            
            
        }
    }
    
    //validar usuario
     public boolean validarUsuario(String usuario, String contrasena){
        vl.setMensajeContrasena("*");
        vl.setMensajeUsuario("*");
        boolean desicion = false;
        if (usuario.equals("")){
            vl.setMensajeUsuario("debe ingresar un usuario");
            return false;
            
        }else if (contrasena.equals("")){
            vl.setMensajeContrasena("debe ingresar una contrasena");
            return false;
        }else{
            //Tiene el numero valido?
            if (usuario.length()< 6 || usuario.length() > 25){
                vl.setMensajeUsuario("el usuario debe contener entre 6 a 25 caracteres");
                return false;
            }else if(contrasena.length()<6 || contrasena.length()> 25){
                vl.setMensajeContrasena("la contrasena debe contener entre 6 a 25 caracteres");
                return false;
            }else{
                //tiene solo caracteres validos?
                if(!validarDato(usuario)){
                    vl.setMensajeUsuario("Ingrese caracteres válidos");
                    return false;
                }else if(!validarDato(contrasena)){
                    vl.setMensajeContrasena("Ingrese caracteres válidos");
                    return false;
                }else{//Si hay algo escrito, si tiene el numero de caracteres validos y si tiene caracteres validos
                    if(usuario.equals(contrasena)){
                        System.out.println("las contraseñas son iguales");
                        vl.setMensajeUsuario("el usuario y la contrasena deben ser ");
                        return false;
                    }else{
                        return true;
                    }
                    
                }//fin else True
                
            }//Fin else "Caracteres validos?"
        }// Fin else "Tiene numero valido?"
        
     }//Fin del metodo
     public boolean validarDato(String dato){
         boolean decision = false;
         for(int i = 0;  i< dato.length(); i++){             
             char letraActual = dato.charAt(i);
             if (Character.isLetterOrDigit(letraActual)){
                 decision = true;
             }else{
                 decision = false;
                 break;
             }
        }//Fin for
         return decision;
     }//Fin del metodo

    
    
}
