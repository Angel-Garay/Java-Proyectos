
package com.unju.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table (name="profesores") //tiene en cuenta el nombre de la tabla
public class Profesor implements Serializable {
    
    @Id
    @GeneratedValue (strategy=GenerationType.AUTO)
    @Column (name = "id_profesor") //ojo con el nombre de la columna
  
    private int idProfesor;
    private String legajo;
    private String nombres;
    private String apellidos;
    private String telefono;
    
    public Profesor(){
    }
    
    public Profesor(int idProfesor, String legajo, String nombres, String apellidos, String telefono){
        this.idProfesor = idProfesor;
        this.legajo = legajo;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
    }

    public int getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(int idProfesor) {
        this.idProfesor = idProfesor;
    }

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
}
