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
    private String nombre;
    private int maximoVisitante;
    private int especiesVisita;
    private List<ZonaDelParque> zonas;
    private List<Recorrido> recorridos;
    private List<Horario> horarios;

    public List<Horario> getHorarios() {
        return horarios;
    }

    public void setHorarios(List<Horario> horarios) {
        this.horarios = horarios;
    }

  
    
    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public List<Recorrido> getRecorridos() {
        return recorridos;
    }

    public void setRecorridos(List<Recorrido> recorridos) {
        this.recorridos = recorridos;
    }

    public Itinerario() {
        this.horarios=new ArrayList<>();
    }

    public Itinerario(ObjectId id, String nombre, int maximoVisitante, int especiesVisita, List<ZonaDelParque> zonas) {
        this.id = id;
        this.nombre = nombre;
        this.maximoVisitante = maximoVisitante;
        this.especiesVisita = especiesVisita;
        this.zonas = zonas;
    }

    public Itinerario(ObjectId id, String nombre, int maximoVisitante, int especiesVisita) {
        this.id = id;
        this.nombre = nombre;
        this.maximoVisitante = maximoVisitante;
        this.especiesVisita = especiesVisita;
        this.zonas = new ArrayList<>();
        this.recorridos = new ArrayList<>();
        this.horarios=new ArrayList<>();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.id);
        hash = 29 * hash + Objects.hashCode(this.nombre);
        hash = 29 * hash + this.maximoVisitante;
        hash = 29 * hash + this.especiesVisita;
        hash = 29 * hash + Objects.hashCode(this.zonas);
        hash = 29 * hash + Objects.hashCode(this.recorridos);
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
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.zonas, other.zonas)) {
            return false;
        }
        return Objects.equals(this.recorridos, other.recorridos);
    }

    @Override
    public String toString() {
        return "Itinerario{" + "id=" + id + ", nombre=" + nombre + ", maximoVisitante=" + maximoVisitante + ", especiesVisita=" + especiesVisita + ", zonas=" + zonas + ", recorridos=" + recorridos + '}';
    }


}
