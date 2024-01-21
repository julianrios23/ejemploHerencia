
package julian.rios.ejemploherencia;

/**
 *
 * @author Julian Rios
 */
public class EjemploHerencia {

    public static void main(String[] args) {
        
        Perro miPerro = new Perro(3, "Lolo", "Labrador");
        Gato miGato = new Gato(5, "Nina", 7);

        System.out.println(miPerro.getNombre() + " es un " + miPerro.getRaza() + " de " + miPerro.getEdad() + " años.");
        miPerro.ladrar();

        System.out.println(miGato.getNombre() + " tiene " + miGato.getVidas() + " vidas y es " + miGato.getEdad() + " años.");
        miGato.maullar();
    }
}
/*
En este ejemplo, "Perro" y "Gato" heredan de "Animal" usando la palabra clave "extends". 
"Perro" tiene un atributo adicional "raza" y un método adicional "ladrar", mientras que "Gato" 
tiene un atributo adicional "vidas" y un método adicional "maullar". En el método "main", 
se crean instancias de ambas subclases y se llaman a algunos de sus métodos.
*/