

package julian.rios.ejemploherencia;


public class Gato extends Animal{
    
    private int vidas;

    public Gato(int edad, String nombre, int vidas) {
        super(edad, nombre);
        this.vidas = vidas;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }
    

    public void maullar() {
        System.out.println("Miau, miau!");
    }

}
