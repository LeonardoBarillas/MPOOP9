/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad;

/**
 * Clase que muestra los datos de un Trabajador
 * @author Barillas
 */
public abstract class Trabajador extends Persona{
    float salario;
    int horaEntrada;
    int horaSalida;    
    public abstract void aclararDudas();

    /**
     * Metodo vacio
     */
    public Trabajador() {
    }
    
    /**
     * Metodo que muestra los datos de un Trabajador
     * @param salario Salario de un Trabajador
     * @param horaEntrada Hora de Entrada de un Trabajador
     * @param horaSalida Hora de Salida de un Trabajador
     * @param mascota Mascota de un Trabajador
     * @param nombre Nombre de un Trabajador
     * @param edad Edad de un Trabajador
     */
    public Trabajador(float salario, int horaEntrada, int horaSalida,
            Mascota mascota, String nombre, int edad) {
        super(mascota, nombre, edad);
        this.salario = salario;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
    }
    
    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public int getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(int horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public int getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(int horaSalida) {
        this.horaSalida = horaSalida;
    }

    @Override
    public String toString() {
        return "Trabajador{" + '}';
    }

    @Override
    public void respirar() {
        System.out.println("Aun respira");
    }
}
