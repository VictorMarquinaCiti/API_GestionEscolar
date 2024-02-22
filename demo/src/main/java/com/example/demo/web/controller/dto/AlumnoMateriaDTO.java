package com.example.demo.web.controller.dto;

import com.example.demo.entity.AlumnoEntity;
import com.example.demo.entity.MateriaEntity;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class AlumnoMateriaDTO {
    private Integer id;
    private Double calificacion;

    private AlumnoEntity alumno;

    private MateriaEntity materia;
}
