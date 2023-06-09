/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import Dominio.Clima;
import com.mongodb.client.MongoCollection;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author IVAN
 */
public abstract class DAOBase<T> {

    public abstract void guardar(T entidad);

    public abstract T buscarPorID(ObjectId id);

    public abstract List<T> buscarTodos();
    
    public abstract MongoCollection<T> obtenerColeccion();
}
