package Modelos;

public class Criatura {
    
    //Atributos
    public String nombre;
    private int nivel;
    private int puntosDeVida;
    private int ataque;
    private int defensa;
    
    //Constructores
    //por defecto:
    public Criatura(){
        nombre="";
        nivel=0;
        puntosDeVida=0;
        ataque=0;
        defensa=0;
    }
    //por parametros
    public Criatura(String nombre,int nivel, int puntosDeVida, int ataque,int defensa){
    this.nombre=nombre;
    this.nivel=nivel;
    this.puntosDeVida=puntosDeVida;
    this.ataque=ataque;
    this.defensa=defensa;
    }
    
    //Getter y Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getPuntosDeVida() {
        return puntosDeVida;
    }

    public void setPuntosDeVida(int puntosDeVida) {
        this.puntosDeVida = puntosDeVida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }
   
    //Métodos
    public String mostrarDatos(){
        String datos = "Nombre:"+nombre+"\nNivel:"+nivel+"\nHP:"+puntosDeVida+"\nAtaque:"+ataque+"\nDefensa:"+defensa;
        return datos;
    }
    public void atacar(Criatura defensora){
        System.out.println(nombre+" ha atacado." );
        if (ataque > defensora.defensa){
            int dano = ataque-defensora.defensa;
            defensora.puntosDeVida-=dano;
        }
        else{
            int dano=defensora.defensa-ataque;
            puntosDeVida-=dano;
        }
    }
}