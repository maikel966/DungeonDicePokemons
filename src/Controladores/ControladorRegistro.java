package Controladores;

import Vistas.VistaRegistro;
import Modelos.Jugador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorRegistro implements ActionListener {
    //Atributos
    VistaRegistro vr;
    ControladorJefeTerreno cjt;
    Jugador jugador;
    ControladorVistaLoginRegistro cvlr;
    ControladorVistaTransicion cvt;
    
    //Constructor
    public ControladorRegistro(){
        vr = new VistaRegistro();
        vr.setTitle("Registro de usuario");
        vr.setListener(this);
        jugador = new Jugador();
        cjt = new ControladorJefeTerreno();
    }
    //Métodos
    public void mostrarVistaRegistro(){
        vr.setVisible(true);
    }    

    @Override
    public void actionPerformed(ActionEvent presionar) {
        if (presionar.getActionCommand()=="Registrarse"){
            if (validarUsuario(vr.getUsuario(),vr.getContrasena(),vr.getRptContrasena())){
                vr.dispose();
                cjt.mostrarVistaJefeTerreno();
                System.out.println("usuario valido");

                
            }else{
                System.out.println("usuario invalido");
            }
            
            
            
        }else if(presionar.getActionCommand() == "cancelar"){
            System.out.println("entre a cancelar");
            cvlr = new ControladorVistaLoginRegistro();
            vr.setVisible(false);
            cvlr.mostrarVistaLoginRegistro();
            
        }
        
        //validar usuario
     //Fin metodo
    
        
        
    }
    public boolean validarUsuario(String usuario, String contrasena, String contrasenaRpt){
         vr.setMensajeContrasena("*");
         vr.setMensajeUsuario("*");
         vr.setMensajeRptContrasena("*");
         
         //Ha ingresado caracteres?
         if(usuario.equals("")){
             vr.setMensajeUsuario("Debe ingresar un usuario");
             return false;
         }else if(contrasena.equals("")){
             vr.setMensajeContrasena("Debe ingresar una contrasena");
             return false;
         }else if(contrasena.equals("")){
             vr.setMensajeRptContrasena("Debe ingresar una contrasena");
             return false;
         }else{
             //si ingreso un usuario, contrasena y una repeticion (cualquiera sea)
             
             if(usuario.length()<6 || usuario.length()>25){
                 vr.setMensajeUsuario("Debe contener entre 6 a 25 caracteres");
                 return false;
             }else if(contrasena.length()< 6 || contrasena.length()> 25){
                 vr.setMensajeContrasena("La contrasena debe contener entre 6 a 25 caracteres");
                 vr.setMensajeRptContrasena("La contrasena debe contener entre 6 a 25 caracteres");
                 return false;
             }else{//Si tiene un numero de caracteres validos
                 if(usuario.equals(contrasena)){
                     vr.setMensajeUsuario("el usuario debe ser distinto de la contrasena");
                     vr.setMensajeRptContrasena("el usuario debe ser distinto de la contrasena");
                     return false;
                 }else{
                    if (!validarDato(usuario)){ // Tiene caracteres validos?
                        vr.setMensajeUsuario("debe contener caracteres validos");
                        return false;
                    }else if(!validarDato(contrasena)){
                        vr.setMensajeContrasena("debe contener caracteres validos");
                        vr.setMensajeRptContrasena("Debe contener caracteres validos");
                        return false;
                    }else{//Si tiene caracteres validos
                        if (!contrasenaRpt.equals(contrasena)){//Las contrasenas son iguales??
                           vr.setMensajeRptContrasena("Las contrasenas no coinciden");
                           vr.setMensajeContrasena("Las contrasenas no coinciden");
                           return false;
                        }else{//si las contrasenas son iguales.
                           return true;
                        }
                    }
                }
             }
         }
    }     
        
        
        
     
     public boolean validarDato(String dato){
         boolean desicion = false;
         for(int i = 0;  i< dato.length(); i++){             
             char letraActual = dato.charAt(i);
             if (!Character.isLetterOrDigit(letraActual)){
                 return false;
             }else{
                 desicion = true;
                 
             }//Fin if         
        }//Fin for
         return desicion;
     }
    
    
}


/*******************
 * if (!(vr.getUsuario().equals("")) && !(vr.getContrasena().equals("")) && vr.getContrasena().equals(vr.getRptContrasena())){
                vr.setLblUsuario("");
                vr.setLblContrasena("");
                vr.setLblRptContrasena("");
                
                jugador.setNombre(vr.getUsuario());
                jugador.setContraseña(vr.getContrasena());
                cjt.setJugador(jugador);
                cjt.mostrarVistaJefeTerreno();
                vr.setVisible(false);        
            }
 */