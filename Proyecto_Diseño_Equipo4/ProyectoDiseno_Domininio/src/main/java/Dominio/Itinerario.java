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
    private int duracion;
    private int longitud;
    private List<ZonaDelParque> zonas;
    private List<Recorrido> recorridos;

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

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
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

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Itinerario() {
    }

    public Itinerario(ObjectId id, String nombre, int maximoVisitante, int especiesVisita, int duracion, int longitud, List<ZonaDelParque> zonas) {
        this.id = id;
        this.nombre = nombre;
        this.maximoVisitante = maximoVisitante;
        this.especiesVisita = especiesVisita;
        this.duracion = duracion;
        this.longitud = longitud;
        this.zonas = zonas;
    }

    public Itinerario(ObjectId id, String nombre, int maximoVisitante, int especiesVisita, int duracion, int longitud) {
        this.id = id;
        this.nombre = nombre;
        this.maximoVisitante = maximoVisitante;
        this.especiesVisita = especiesVisita;
        this.duracion = duracion;
        this.longitud = longitud;
        this.zonas = new ArrayList<>();
        this.recorridos = new ArrayList<>();
    }

    @Override
    public String toString() {
        return nombre;
    }

}
