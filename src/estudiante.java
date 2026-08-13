/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ashle
 */
public class estudiante {
    

    private String carnet;
    private String nombre;
    private String carrera;
    private int edad;
    private double promedio;

    // Constructor vacío
    public estudiante() {
    }

    public estudiante(String carnet, String nombre, String carrera, int edad, double promedio) {
        this.carnet = carnet;
        this.nombre = nombre;
        this.carrera = carrera;
        this.edad = edad;
        this.promedio = promedio;
    }

    // Getters y Setters
    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

   
}
    
