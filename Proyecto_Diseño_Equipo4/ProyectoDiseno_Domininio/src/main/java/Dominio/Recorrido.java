
package Dominio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import org.bson.types.ObjectId;

/**
 *
 * @author IVAN
 */
public class Recorrido {
    private ObjectId id;
    private Horario horarios;
    private Guia guia;
    private List<QuejaRecorrido> quejas;

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public Horario getHorarios() {
        return horarios;
    }

    public void setHorarios(Horario horarios) {
        this.horarios = horarios;
    }

    public Guia getGuia() {
        return guia;
    }

    public void setGuia(Guia guia) {
        this.guia = guia;
    }

    public Recorrido() {
        quejas = new ArrayList<>();
    }

    public Recorrido(Horario horarios, Guia guia) {
        this.horarios = horarios;
        this.guia = guia;
        quejas = new ArrayList<>();
    }

    public List<QuejaRecorrido> getQuejas() {
        return quejas;
    }

    public void setQuejas(List<QuejaRecorrido> quejas) {
        this.quejas = quejas;
    }
    public void addQuejas(QuejaRecorrido queja){
        this.quejas.add(queja);
    }
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.id);
        hash = 83 * hash + Objects.hashCode(this.horarios);
        hash = 83 * hash + Objects.hashCode(this.guia);
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
        final Recorrido other = (Recorrido) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.horarios, other.horarios)) {
            return false;
        }
        return Objects.equals(this.guia, other.guia);
    }

    @Override
    public String toString() {
        return horarios.getDia().toString();
    }
    
}
