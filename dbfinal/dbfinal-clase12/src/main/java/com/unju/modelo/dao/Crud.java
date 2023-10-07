
package com.unju.modelo.dao;

import java.util.List;

public interface Crud <T>{
    void crear(T t);
    List<T> listar();
    void borrar(int id);
    T obtener(int id); //no implementar
    boolean actualizar(T t); //no implementar
}
