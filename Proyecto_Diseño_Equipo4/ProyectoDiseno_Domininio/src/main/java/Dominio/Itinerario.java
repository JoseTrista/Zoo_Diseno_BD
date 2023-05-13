
package Dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.bson.types.ObjectId;

/**
 *
 * @author IVAN
 */
public class Itinerario {
    private ObjectId id;
    private int maximoVisitante;
    private int especiesVisita;
    private List<ZonaDelParque> zonas;

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public int getMaximoVisitante() {
        return maximoVisitante;
    }

    public void setMaximoVisitante(int maximoVisitante) {
        this.maximoVisitante = maximoVisitante;
    }

    public int getEspeciesVisita() {
        return especiesVisita;
    }

    public void setEspeciesVisita(int especiesVisita) {
        this.especiesVisita = especiesVisita;
    }

    public List<ZonaDelParque> getZonas() {
        return zonas;
    }

    public void setZonas(List<ZonaDelParque> zonas) {
        this.zonas = zonas;
    }

    public Itinerario() {
    }

    public Itinerario(ObjectId id, int maximoVisitante, int especiesVisita) {
        this.id = id;
        this.maximoVisitante = maximoVisitante;
        this.especiesVisita = especiesVisita;
       this.zonas = new ArrayList<>();
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
        final Itinerario other = (Itinerario) obj;
        if (this.maximoVisitante != other.maximoVisitante) {
            return false;
        }
        if (this.especiesVisita != other.especiesVisita) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.zonas, other.zonas)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Itinerario{" + "id=" + id + ", maximoVisitante=" + maximoVisitante + ", especiesVisita=" + especiesVisita + ", zonas=" + zonas + '}';
    }
    
    
}
