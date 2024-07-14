package com.example.proyectoufc.clases;

import java.io.Serializable;
import java.util.Date;

public class Citas implements Serializable {

    private int id;
    private String paciente,correo;
    private Date fecha;
    private int id_especialidad,id_doctor;

    public Citas() {
    }

    public Citas(int id, String paciente, String correo, Date fecha, int id_especialidad, int id_doctor) {
        this.id = id;
        this.paciente = paciente;
        this.correo = correo;
        this.fecha = fecha;
        this.id_especialidad = id_especialidad;
        this.id_doctor = id_doctor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getId_especialidad() {
        return id_especialidad;
    }

    public void setId_especialidad(int id_especialidad) {
        this.id_especialidad = id_especialidad;
    }

    public int getId_doctor() {
        return id_doctor;
    }

    public void setId_doctor(int id_doctor) {
        this.id_doctor = id_doctor;
    }
}


