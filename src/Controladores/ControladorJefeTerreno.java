package Controladores;

import Modelos.JefeDeTerreno;
import Modelos.Jugador;
import Vistas.VistaJefeTerreno;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class ControladorJefeTerreno implements ActionListener{
    //Atributos
    VistaJefeTerreno vjt;
    JefeDeTerreno charizard = new JefeDeTerreno("Charizard",20,"Incrementar ataque");
    JefeDeTerreno venasaur = new JefeDeTerreno("Venasaur",89,"Incrementar defensa");
    JefeDeTerreno blastoise = new JefeDeTerreno("Blastoise",76,"Incrementar puntos de vida");
    JefeDeTerreno capitanZolezzi = new JefeDeTerreno("Capitán Zolezzi",76,"Robar vida");
    Jugador jugador;
    ControladorVistaLoginRegistro cvlr;
    ControladorVistaPopMensaje cvpm;
    
    
    //Constructor
    public ControladorJefeTerreno(){
        vjt = new VistaJefeTerreno();
        vjt.setTitle("Elección de Jefe de Terreno");
        vjt.setBtnJT1("Charizard");
        vjt.setBtnJT2("Blastoise");
        vjt.setBtnJT3("Venasaur");
        vjt.setBtnJT4("Dr. Zolezzi");
        vjt.setDatos("Hola!\nBienvenido a Dungeon Dice Pokemon\npara comenzar esta aventura\nelige a un poderoso jefe de terreno."
                + "\n\nAdelante elige a tu favorito.");

        vjt.setListener(this);        
    }
    //Métodos
    public void mostrarVistaJefeTerreno(){
        vjt.setVisible(true);
    }
    public void setJugador(Jugador jugador){
        vjt.setJugador(jugador.getNombre());
    }
    @Override
    public void actionPerformed(ActionEvent presionar) {
        if (presionar.getActionCommand()=="Aceptar"){
            if (vjt.getJefeTerreno1()==true){
                System.out.println("Has escogido a "+charizard.nombre);
            }
            else if (vjt.getJefeTerreno2()==true){
                System.out.println("Has escogido a "+blastoise.nombre);
            }
            else if (vjt.getJefeTerreno3()==true){
                System.out.println("Has escogido a "+venasaur.nombre);
            }
            else if (vjt.getJefeTerreno4()==true){
                System.out.println("Has escogido a "+capitanZolezzi.nombre);
                
                
            }
            else{
                vjt.setDatos("No has escogido a nadie");
                System.out.println("No has escogido a nadie");
            }
        }else if(presionar.getActionCommand() == "cancelar"){
            cvlr = new ControladorVistaLoginRegistro();
            cvlr.mostrarVistaLoginRegistro();
            vjt.dispose();
            
        }else{
            if(vjt.getJefeTerreno1()==true){
                ImageIcon imagen = new ImageIcon(getClass().getResource("/Imagenes/JefesDeTerreno/Charizard.gif"));
                vjt.setImagen(imagen);
                vjt.setDatos(charizard.mostrarDatos());
            }
            else if(vjt.getJefeTerreno2()==true){
                ImageIcon imagen = new ImageIcon(getClass().getResource("/Imagenes/JefesDeTerreno/Blastoise.png"));
                vjt.setImagen(imagen);
                vjt.setDatos(blastoise.mostrarDatos());
            }
            else if(vjt.getJefeTerreno3()==true){
                ImageIcon imagen = new ImageIcon(getClass().getResource("/Imagenes/JefesDeTerreno/Venasaur.png"));
                vjt.setImagen(imagen);
                vjt.setDatos(venasaur.mostrarDatos());
            }
            else if(vjt.getJefeTerreno4()==true){
                ImageIcon imagen = new ImageIcon(getClass().getResource("/Imagenes/JefesDeTerreno/drZolezzi.png"));
                vjt.setImagen(imagen);
                vjt.setDatos(capitanZolezzi.mostrarDatos());
            }
        }
    }
}
