/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad;

/**
 * Clase que muestra los datos de un Alumno
 * @author Barillas
 */
public class Alumno extends Persona{
    String carrera;
    int semestre;

    /**
     * Metodo vacio
     */
    public Alumno() {
    }
    
    /**
     * Metodo que muestra los datos de un Alumno
     * @param carrera Carrera de un Alumno
     * @param semestre Semestre de un Alumno
     * @param mascota Mascota de un Alumno
     * @param nombre Nombre de un Alumno
     * @param edad Edad de un Alumno
     */
    public Alumno(String carrera, int semestre, Mascota mascota, String nombre, 
            int edad) {
        super(mascota, nombre, edad);
        this.carrera = carrera;
        this.semestre = semestre;
    }
    
    /**
     * Metodo que muestra los datos de un Alumno
     * @param aprender Muestra el metodo aprender de un Alumno
     */   
    public void aprender(String aprender){
        System.out.println("Mira estoy aprendiendo");
    }
    
    /**
     * Metodo que muestra los datos de un Alumno
     * @param estudiar Muestra el metodo estudiar de un Alumno
     */   
    public void estudiar (String estudiar){
        System.out.println("Estoy estudiando");
    }
    
    /**
     * Metodo que muestra los datos de un Alumno
     * @param darseDeBaja Muestra el metodo darseDeBaja de un Alumno
     */   
    public void darseDeBaja(String darseDeBaja){
        System.out.println("Me voy a dar de baja");
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    @Override
    public String toString() {
        return super.toString() + "Alumno{" + "carrera=" + carrera + 
                ", semestre=" + semestre + '}';
    }
   
    @Override
    public void respirar() {
        System.out.println("Esta respirando");
    }
    
}
