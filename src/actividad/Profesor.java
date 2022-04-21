/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad;

/**
 * Clase que muestra los datos de un Profesor
 * @author Barillas
 */
public abstract class Profesor extends Trabajador{
    int numAlumnos;
    public abstract void aprobarAlumnos();    
    public abstract void explicar();    
    public abstract void reprobarAlumnos();
    
    /**
     * Metodo vacio
     */
    public Profesor() {
    }
    
    /**
     * Metodo que muestra los datos de un Profesor
     * @param numAlumnos Numero de alumnos de un Profesor
     * @param salario Salario de un Profesor
     * @param horaEntrada Hora de entrada de un Profesor
     * @param horaSalida Hora de salida de un Profesor
     * @param mascota Mascota de un Profesor
     * @param nombre Nombre de un Profesor
     * @param edad Edad de un Profesor
     */
    public Profesor(int numAlumnos, float salario, int horaEntrada, 
            int horaSalida, Mascota mascota, String nombre, int edad) {
        super(salario, horaEntrada, horaSalida, mascota, nombre, edad);
        this.numAlumnos = numAlumnos;
    }
 
    public int getNumAlumnos() {
        return numAlumnos;
    }

    public void setNumAlumnos(int numAlumnos) {
        this.numAlumnos = numAlumnos;
    }

    @Override
    public String toString() {
        return "Profesor{" + '}';
    }
    
}
