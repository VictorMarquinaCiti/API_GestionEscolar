package com.example.demo.web.controller.dto;

import com.example.demo.entity.AlumnoMateriaEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GeneralAlumnoDTO {
    private Integer idAlumno;
    private String nombre;

    private String apellidoPaterno;

    private String apellidoMaterno;
    private List<AlumnoMateriaDTO> calificaciones;
    private Double promedio;

    public Integer getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(Integer idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public List<AlumnoMateriaDTO> getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(List<AlumnoMateriaDTO> calificaciones) {
        this.calificaciones = calificaciones;
    }

    public Double getPromedio() {
        return promedio;
    }

    public void setPromedio(Double promedio) {
        this.promedio = promedio;
    }
}
