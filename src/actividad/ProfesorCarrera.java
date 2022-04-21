/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad;

/**
 * Clase que muestra los datos de un ProfesorCarrera
 * @author Barillas
 */
public class ProfesorCarrera extends Profesor{
    String asignatura;
    int grupo;

    /**
     * Metodo vacio
     */
    public ProfesorCarrera() {
    }
    
    /**
     * Metodo que muestra los datos de un ProfesorCarrera
     * @param asignatura Asignatura de un ProfesorCarrera
     * @param grupo Grupo de un ProfesorCarrera
     * @param numAlumnos Numero de alumnos de un ProfesorCarrera
     * @param salario Salario de un ProfesorCarrera
     * @param horaEntrada Hora de entrada de un ProfesorCarrera
     * @param horaSalida Hora de salida de un ProfesorCarrera
     * @param mascota Mascota de un ProfesorCarrera
     * @param nombre Nombre de un ProfesorCarrera
     * @param edad Edad de un ProfesorCarrera
     */
    public ProfesorCarrera(String asignatura, int grupo, int numAlumnos, 
            float salario, int horaEntrada, int horaSalida, Mascota mascota, 
            String nombre, int edad) {
        super(numAlumnos, salario, horaEntrada, horaSalida, mascota, nombre, 
                edad);
        this.asignatura = asignatura;
        this.grupo = grupo;
    }
    
    /**
     * Metodo que muestra los datos de un ProfesorCarrera
     * @param enseñar Metodo que realiza un ProfesorCarrera
     */  
    public void enseñar(String enseñar){
        System.out.println("Estoy enseñando");
    }
    
    public String getAsignatura() {
        return asignatura;
    }
    
    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public int getGrupo() {
        return grupo;
    }

    public void setGrupo(int grupo) {
        this.grupo = grupo;
    }

    @Override
    public String toString() {
        return super.toString() + "ProfesorCarrera{" + "asignatura=" + 
                asignatura + ", grupo=" + grupo + '}';
    }

    @Override
    public void aprobarAlumnos() {
        System.out.println("Por poquito lo repruebo");
    }

    @Override
    public void explicar() {
        System.out.println("No me pagan lo suficiente para repetir esto tantas "
                + "veces");
    }

    @Override
    public void reprobarAlumnos() {
        System.out.println("Vive, vive, ¡MUERE!");
    }

    @Override
    
    public void aclararDudas() {
        System.out.println("Es la ultima vez que lo repito");
    }
    
}
