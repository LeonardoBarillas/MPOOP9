/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad;

/**
 * Clase que muestra los datos de un ProfesorAsignatura
 * @author Barillas
 */
public class ProfesorAsignatura extends Profesor{
    String nombreAsignatura;

    /**
     * Metodo vacio
     */
    public ProfesorAsignatura() {
    }
    
    /**
     * Metodo que muestra los datos de un ProfesorAsignatura
     * @param nombreAsignatura Nombre de asignatura de un ProfesorAsignatura
     * @param numAlumnos Numero de alumnos de un ProfesorAsignatura
     * @param salario Salario de un ProfesorAsignatura
     * @param horaEntrada Hora de entrada de un ProfesorAsignatura
     * @param horaSalida Hora de salida de un ProfesorAsignatura
     * @param mascota Mascota de un ProfesorAsignatura
     * @param nombre Nombre de un ProfesorAsignatura
     * @param edad Edad de un ProfesorAsignatura
     */
    public ProfesorAsignatura(String nombreAsignatura, int numAlumnos, float 
            salario, int horaEntrada, int horaSalida, Mascota mascota, 
            String nombre, int edad) {
        super(numAlumnos, salario, horaEntrada, horaSalida, mascota, nombre, 
                edad);
        this.nombreAsignatura = nombreAsignatura;
    }
    
    /**
     * Metodo que muestra los datos de un ProfesorAsignatura
     * @param darClase Metodo que realiza un ProfesorAsignatura
     */  
    public void darClase(String darClase){
        System.out.println("Estoy dando clase");
    }
    
    /**
     * Metodo que muestra los datos de un ProfesorAsignatura
     * @param calificar Metodo que realiza un ProfesorAsignatura
     */   
    public void calificar(String calificar){
        System.out.println("Estoy calificando");
    }
    
    public String getNombreAsignatura() {
        return nombreAsignatura;
    }

    public void setNombreAsignatura(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
    }

    @Override
    public String toString() {
        return super.toString() + "ProfesorAsignatura{" + "nombreAsignatura=" + 
                nombreAsignatura + '}';
    }

    @Override
    public void aprobarAlumnos() {
        System.out.println("Se ha apiadado y decide aprobar al alumno");
    }

    @Override
    public void explicar() {
        System.out.println("Lo explicare cuantas veces sea necesario");
    }

    @Override
    public void reprobarAlumnos() {
        System.out.println("Ha reprobado al alumno sin piedad alguna");
    }

    @Override
    public void aclararDudas() {
        System.out.println("Aclarar dudas es parte del trabajo");
    }
    
}
