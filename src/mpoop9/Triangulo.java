/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mpoop9;

/**
 * Clase que hace calculos para un triangulo
 * @author Barillas
 */
public class Triangulo extends Poligono{
    private int alfa, beta, gamma;
    private float a, b, c;
    private int base, altura;
    
/**
 * Metodo vacio
 */
    public Triangulo() {
    }
    
/**
 * Metodo que muestra los datos de un triangulo
 * @param base Base del triangulo
 * @param altura Altura del triangulo
 */ 
    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getAlfa() {
        return alfa;
    }

    public int getBeta() {
        return beta;
    }

    public int getGamma() {
        return gamma;
    }

    public float getA() {
        return a;
    }

    public float getB() {
        return b;
    }

    public float getC() {
        return c;
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    @Override
    public float area() {
        return base * altura / 2;
    }

    @Override
    public float perimetro() {
        return a + b + c;
    }

    @Override
    public String toString() {
        return super.toString() + "Triangulo{" + '}';
    }
    
}
