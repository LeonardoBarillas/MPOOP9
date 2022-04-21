/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad;

/**
 * Clase que muestra los datos de un SerVivo
 * @author Barillas
 */
public abstract class SerVivo {
   String nombre;
   private int edad;    
   public abstract void respirar();

/**
 * Metodo vacio
 */
    public SerVivo() {
    }
 
    /**
     * Metodo que muestra los datos de un SerVivo
     * @param nombre Nombre del SerVivo
     * @param edad  Edad del SerVivo
     */
    public SerVivo(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
        
    @Override
    public String toString() {
        return "SerVivo{" + '}';
    }
     
}
