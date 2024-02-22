package com.example.demo.persistence;

import com.example.demo.entity.AlumnoMateriaEntity;

import java.util.List;

public interface IAlumnoMateriaDAO {
    // Creo metodos para acceso
    List<AlumnoMateriaEntity> findAll();

    // Promedio
    Double getPromedioGen(Integer idAlumno);
}
