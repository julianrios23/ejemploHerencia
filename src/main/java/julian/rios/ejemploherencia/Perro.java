

package julian.rios.ejemploherencia;


public class Perro extends Animal{ 
    
    private String raza;

    public Perro(int edad, String nombre, String raza) {
        super(edad, nombre);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    

    public void ladrar() {
        System.out.println("Guau, guau!");

}
}
