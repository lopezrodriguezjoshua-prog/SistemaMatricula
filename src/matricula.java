/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Joshua Lopez
 */
public class matricula {
  private int idMatricula;
  private String curso;
  private String fechaMatricula;
  private double costo;

    public matricula(int idMatricula, String curso, String fechaMatricula, double costo) {
        this.idMatricula = idMatricula;
        this.curso = curso;
        this.fechaMatricula = fechaMatricula;
        this.costo = costo;
    }

    public int getIdMatricula() {
        return idMatricula;
    }

    public void setIdMatricula(int idMatricula) {
        this.idMatricula = idMatricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getFechaMatricula() {
        return fechaMatricula;
    }

    public void setFechaMatricula(String fechaMatricula) {
        this.fechaMatricula = fechaMatricula;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
  
  
}
