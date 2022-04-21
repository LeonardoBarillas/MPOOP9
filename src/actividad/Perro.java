/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad;

/**
 * Clase que muestra los datos de un Perro
 * @author Barillas
 */
public class Perro extends Mascota{
    private boolean colaCortada;

    /**
     * Metodo vacio
     */
    public Perro() {
    }
    
    /**
     * Metodo que muestra los datos de un Perro
     * @param colaCortada ColaCortada de un Perro
     * @param color Color de un Perro
     * @param raza Raza de un Perro
     * @param colorOjos ColorOjos de un Perro
     * @param nombre Nombre de un Perro
     * @param edad Edad de un Perro
     */
    public Perro(boolean colaCortada, String color, String raza, 
            String colorOjos, String nombre, int edad) {
        super(color, raza, colorOjos, nombre, edad);
        this.colaCortada = colaCortada;
    }
    
    /**
     * Metodo que muestra los datos de un Perro
     * @param correr Muestra eel metodo correr de un Perro
     */  
    public void correr(String correr){
        System.out.println("Mirame estopy corriendo");
    }
    
    /**
     * Metodo que muestra los datos de un Perro
     * @param corretear Muestra el método corretear de un Perro
     */
    public void corretear(String corretear){
        System.out.println("Estoy correteando algo");
    }
    
    /**
     * Metodo que muestra los datos de un Perro
     * @return colaCortada, color, raza, colorOjos, nombre, edad y 
     * metodos de un Perro
     */

    public boolean isColaCortada() {
        return colaCortada;
    }

    public void setColaCortada(boolean colaCortada) {
        this.colaCortada = colaCortada;
    }

    @Override
    public String toString() {
        return super.toString() + "Perro{" + "colaCortada=" + colaCortada + '}';
    }

    @Override
    public void dormir() {
        System.out.println("Ronca como tractor...");
    }

    @Override
    public void jugar() {
        System.out.println("Jugando ando");
    }

    @Override
    public void saltar() {
        System.out.println("Saltando ando");
    }

    @Override
    public void respirar() {
        System.out.println("Si respira");
    }

}
