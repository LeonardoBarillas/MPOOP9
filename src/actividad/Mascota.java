/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad;

/**
 * Clase que muestra los datos de una Mascota
 * @author Barillas
 */
public abstract class Mascota extends SerVivo{
    private String color;
    private String raza;
    String colorOjos;
    public abstract void dormir();  
    public abstract void jugar();
    public abstract void saltar();
    
    /**
     * Metodo vacio
     */
    public Mascota() {
    }
    
    /**
     * Metodo que muestra los datos de una Mascota
     * @param color Color de una Mascota
     * @param raza Raza de una Mascota
     * @param colorOjos Color de ojos de una Mascota
     * @param nombre Nombre de una Mascota
     * @param edad Edad de una Mascota
     */
    public Mascota(String color, String raza, String colorOjos, String nombre, 
            int edad) {
        super(nombre, edad);
        this.color = color;
        this.raza = raza;
        this.colorOjos = colorOjos;
    }
 
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColorOjos() {
        return colorOjos;
    }

    public void setColorOjos(String colorOjos) {
        this.colorOjos = colorOjos;
    }

    @Override
    public String toString() {
        return "Mascota{" + '}';
    }
}
