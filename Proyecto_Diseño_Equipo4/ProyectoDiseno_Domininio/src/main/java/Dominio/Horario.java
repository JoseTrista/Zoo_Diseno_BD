/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

import java.util.Objects;


/**
 *
 * @author IVAN
 */
public class Horario {
   
     private String horaInicio;
     private Dias dia;

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Dias getDia() {
        return dia;
    }

    public void setDia(Dias dia) {
        this.dia = dia;
    }

    public Horario() {
    }

    public Horario(Dias dia, String horaInicio) {
        this.dia = dia;
        this.horaInicio = horaInicio;
    }
   

    @Override
    public int hashCode() {
        int hash = 7;
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
        final Horario other = (Horario) obj;
        if (!Objects.equals(this.horaInicio, other.horaInicio)) {
            return false;
        }
       
        if (this.dia != other.dia) {
            return false;
        }
        return true;
    }
     
     
}
