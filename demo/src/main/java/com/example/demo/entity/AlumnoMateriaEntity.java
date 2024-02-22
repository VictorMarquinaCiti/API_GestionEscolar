package com.example.demo.entity;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "alumno_materia")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AlumnoMateriaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(columnDefinition = "DECIMAL(5,2)")
    private Double calificacion;

    @ManyToOne
    @JoinColumn(name = "id_alumno")
    private AlumnoEntity alumno;

    @ManyToOne
    @JoinColumn(name = "id_materia")
    private MateriaEntity materia;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Double calificacion) {
        this.calificacion = calificacion;
    }

    public AlumnoEntity getAlumno() {
        return alumno;
    }

    public void setAlumno(AlumnoEntity alumno) {
        this.alumno = alumno;
    }

    public MateriaEntity getMateria() {
        return materia;
    }

    public void setMateria(MateriaEntity materia) {
        this.materia = materia;
    }
}
