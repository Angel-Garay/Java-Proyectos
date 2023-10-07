
package com.unju.modelo.dao;

import com.unju.modelo.Profesor;
import java.util.List;
import com.unju.modelo.persistencia.ControladoraPersistencia;

public class ProfesorDaoImpl implements ProfesorDao{
    ControladoraPersistencia controladoraPersistencia = new ControladoraPersistencia();
    
    @Override
    public void crear(Profesor profesor){
        controladoraPersistencia.crear(profesor);
    }
    
    @Override
    public List<Profesor> listar(){
        return controladoraPersistencia.listar();
    }
    
    @Override
    public void borrar(int idProfesor){
        controladoraPersistencia.borrar(idProfesor);
    }

    @Override
    public Profesor obtener(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public boolean actualizar(Profesor t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
