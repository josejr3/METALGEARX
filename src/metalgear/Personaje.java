package metalgear;
public class Personaje {
    String nombre;
    int edad;

    void presentarse(){
        System.out.println("hola soy "+nombre);
    }
    public Personaje(String nombre, int edad){
        this.nombre=nombre;
        
    }
}