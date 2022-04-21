/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad;

/**
 * Clase que muestra los datos de un Gato
 * @author Barillas
 */
public class Gato extends Mascota{

    /**
     * Metodo vacio
     */
    public Gato() {
    }
    
    /**
     * Metodo que muestra los datos de un Gato
     * @param color Color de un Gato
     * @param raza Raza de un Gato
     * @param colorOjos ColorOjos de un Gato
     * @param nombre Nombre de un Gato
     * @param edad Edad de un Gato
     */
    public Gato(String color, String raza, String colorOjos, String nombre, 
            int edad) {
        super(color, raza, colorOjos, nombre, edad);
    }
    
    /**
     * Metodo que muestra los datos de un Gato
     * @param rasguñar Muestra el metodo rasguñar de un Gato
     */   
    public void rasguñar(String rasguñar){
        System.out.println("Te voy a rasguñar");
    }
    
    /**
     * Metodo que muestra los datos de un Gato
     * @param trepar Muestra el metodo trepar de un Gato
     */
    public void trepar(String trepar){
        System.out.println("Estoy trepando");
    }
    
    @Override
    public String getColorOjos() {
        return colorOjos;
    }

    @Override
    public void setColorOjos(String colorOjos) {
        this.colorOjos = colorOjos;
    }

    @Override
    public String toString() {
        return super.toString() + "Gato{" + '}';
    }    

    @Override
    public void dormir() {
        System.out.println("Zzzzzzzzz...");
    }

    @Override
    public void jugar() {
        System.out.println("Esta jugando");
    }

    @Override
    public void saltar() {
        System.out.println("Saltando de ventana en ventana");
    }

    @Override
    public void respirar() {
        System.out.println("Respirando ando");
    }
    
}
