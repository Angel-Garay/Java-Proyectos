
package com.unju.modelo.persistencia;

import com.unju.modelo.Profesor;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.unju.modelo.persistencia.exceptions.NonexistentEntityException;

public class ControladoraPersistencia {
    ProfesorJpaController profesorJpaController = new ProfesorJpaController();
    
    public void crear(Profesor profesor){
        profesorJpaController.create(profesor);
    }

    public List<Profesor> listar(){
        return profesorJpaController.findProfesorEntities();
    }

    public void borrar(int idProfesor){
        try {
            profesorJpaController.destroy(idProfesor);
        } catch (NonexistentEntityException ex){
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
