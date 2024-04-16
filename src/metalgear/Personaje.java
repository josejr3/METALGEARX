package metalgear;
public class Personaje {
    String nombre;

    void presentarse(){
        System.out.println("hola soy "+nombre);
    }
    public Personaje(String nombre){
        this.nombre=nombre;
    }
}