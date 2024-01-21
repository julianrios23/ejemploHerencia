

package julian.rios.ejemploherencia;


public class Animal {
    
    protected int edad;
    protected String nombre;

    public Animal(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    

    public void sonido() {
        System.out.println("Haciendo sonido...");
    }

   
    

}
