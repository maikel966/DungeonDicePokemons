package Modelos;

public class JefeDeTerreno {        
    //Atributos
    public String nombre;
    public int puntosDeVida;
    public String habilidad;
    
    //Constructores
    public JefeDeTerreno(String nombre, int puntosDeVida,String habilidad){
        this.nombre=nombre;
        this.puntosDeVida=puntosDeVida;
        this.habilidad=habilidad;
    }    
    //Métodos
    public void darHabilidad(Criatura criatura,JefeDeTerreno enemigo){
        if (habilidad=="Incrementar ataque"){
            int ataque=criatura.getAtaque();
            ataque+=ataque*0.05;
            criatura.setAtaque(ataque);
            System.out.println(criatura.getNombre()+" ha aumentado su ataque a "+ataque);
        }
        else if(habilidad=="Incrementar defensa"){
            int defensa=criatura.getDefensa();
            defensa+=defensa*0.05;
            criatura.setDefensa(defensa);
            System.out.println(criatura.getNombre()+" ha aumentado su defensa a "+defensa);
        }
        else if(habilidad=="Robar puntos de salud"){
            double robaVida=enemigo.puntosDeVida*0.05;
            enemigo.puntosDeVida-=robaVida;
            puntosDeVida+=robaVida;
        }
        System.out.println("La habilidad de "+nombre+" es: "+habilidad);
    }
    
    public String mostrarDatos(){
        String datos="Nombre: "+nombre+"\nHP: "+puntosDeVida+"\nHabilidad: "+habilidad;
        return datos;
    }
}
