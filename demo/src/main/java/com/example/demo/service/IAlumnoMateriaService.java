package com.example.demo.service;

import com.example.demo.entity.AlumnoMateriaEntity;

import java.util.List;

public interface IAlumnoMateriaService {
    List<AlumnoMateriaEntity> findAll();

    // Promedios
    Double getPromedioGen(Integer idAlumno);

}
