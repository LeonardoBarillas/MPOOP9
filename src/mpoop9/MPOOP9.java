/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mpoop9;

/**
 * Clase principal
 * @author Barillas
 */
public class MPOOP9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Poligono pol = new Poligono(); No se puede hacer por que no se pueden
        // instanciar clases abstractas
        
        // Instanciar clases abstractas
        Triangulo triangulo = new Triangulo();
        System.out.println(triangulo);
        Cuadrilatero cuadrilatero = new Cuadrilatero();
        System.out.println(cuadrilatero);
        
        System.out.println(triangulo.getBase());
        Triangulo triangulo2 = triangulo;
        System.out.println(triangulo2.getBase());
        triangulo2.setBase(9);
        System.out.println(triangulo2.getBase());
        System.out.println(triangulo.getBase());
        System.out.println(triangulo);
        System.out.println(cuadrilatero);
        
    }
    
}
