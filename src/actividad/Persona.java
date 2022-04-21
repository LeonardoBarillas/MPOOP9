    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad;

/**
 * Clase que muestra los datos de una Persona
 * @author Barillas
 */
public abstract class Persona extends SerVivo{
    Mascota mascota;

    /**
     * Metodo vacio
     */
    public Persona() {
    }
    
    /**
     * Metodo que muestra los datos de una Persona
     * @param mascota Mascota de una Persona
     * @param nombre Nombre de una Persona
     * @param edad Edad de una Persona
     */
    public Persona(Mascota mascota, String nombre, int edad) {
        super(nombre, edad);
        this.mascota = mascota;
    }
    /**
     * Metodo que muestra los datos de una Persona
     * @return mascota, nombre y edad de una Persona
     */
    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    @Override
    public String toString() {
        return "Persona{" + "mascota=" + '}';
    }
    
}
