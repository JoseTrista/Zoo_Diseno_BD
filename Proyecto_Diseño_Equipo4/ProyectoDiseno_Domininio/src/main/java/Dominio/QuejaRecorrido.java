/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

import java.util.Objects;
import org.bson.types.ObjectId;

/**
 *
 * @author IVAN
 */
public class QuejaRecorrido {
       private ObjectId id;
       private String descripcion;
       private String correo;
       private int telefonoVisitante;
       private String nombreCompletoVisitante;

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getTelefonoVisitante() {
        return telefonoVisitante;
    }

    public void setTelefonoVisitante(int telefonoVisitante) {
        this.telefonoVisitante = telefonoVisitante;
    }

    public String getNombreCompletoVisitante() {
        return nombreCompletoVisitante;
    }

    public void setNombreCompletoVisitante(String nombreCompletoVisitante) {
        this.nombreCompletoVisitante = nombreCompletoVisitante;
    }

    public QuejaRecorrido() {
    }

    
    public QuejaRecorrido(ObjectId id, String descripcion, String correo, int telefonoVisitante, String nombreCompletoVisitante) {
        this.id = id;
        this.descripcion = descripcion;
        this.correo = correo;
        this.telefonoVisitante = telefonoVisitante;
        this.nombreCompletoVisitante = nombreCompletoVisitante;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final QuejaRecorrido other = (QuejaRecorrido) obj;
        if (this.telefonoVisitante != other.telefonoVisitante) {
            return false;
        }
        if (!Objects.equals(this.descripcion, other.descripcion)) {
            return false;
        }
        if (!Objects.equals(this.correo, other.correo)) {
            return false;
        }
        if (!Objects.equals(this.nombreCompletoVisitante, other.nombreCompletoVisitante)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "QuejaRecorrido{" + "id=" + id + ", descripcion=" + descripcion + ", correo=" + correo + ", telefonoVisitante=" + telefonoVisitante + ", nombreCompletoVisitante=" + nombreCompletoVisitante + '}';
    }
       
    
}
