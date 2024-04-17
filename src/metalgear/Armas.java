package metalgear;

public class Armas {
    String tipo;
    int balas;
    
    public void dispara(){
        balas--;
    }
    void recarga(){
        balas=8;
    }

    public Armas(String tipo, int balas) {
        this.tipo = tipo;
        this.balas = balas;
    }
    
}
