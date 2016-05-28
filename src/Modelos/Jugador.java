package Modelos;

public class Jugador {
    //Atributos
    public String nombre;
    private String contraseña;
    public JefeDeTerreno miJefe;
    public Criatura[] equipo;
    
    //Constructor
    public Jugador(){
        nombre = "";
        contraseña = "";
    }
    public Jugador(String nombre, String contraseña){
        this.nombre=nombre;
        this.contraseña=contraseña;
        
    }
    public Jugador(String nombre, String contraseña, JefeDeTerreno miJefe, Criatura[] equipo){
        this.nombre=nombre;
        this.contraseña=contraseña;
        this.miJefe=miJefe;
        this.equipo=equipo;
    }
    //Métodos
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getContraseña() {
        return contraseña;
    }
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    public JefeDeTerreno getMiJefe() {
        return miJefe;
    }
    public void setMiJefe(JefeDeTerreno miJefe) {
        this.miJefe = miJefe;
    }
    public Criatura[] getEquipo() {
        return equipo;
    }
    public void setEquipo(Criatura[] equipo) {
        this.equipo = equipo;
    }   
}
