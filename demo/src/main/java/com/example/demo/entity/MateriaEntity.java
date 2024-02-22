package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "materia")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MateriaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Integer idMateria;

    @Column(nullable = false, length = 100)
    private String nombreMateria;

//    @OneToMany(mappedBy = "materia")
//    List<AlumnoMateriaEntity> promedio;


    public Integer getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(Integer idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }
}
