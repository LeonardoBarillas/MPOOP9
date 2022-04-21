/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mpoop9;

/**
 * Clase abstracta Poligono
 * @author Barillas
 */
public abstract class Poligono {
    public abstract float area();
    public abstract float perimetro();

    @Override
    public String toString() {
        return "Poligono{" + '}';
    }
    
}



