package com.example.demo.service;

import com.example.demo.entity.AlumnoEntity;

import java.util.List;
import java.util.Optional;

public interface IAlumnoService {
    List<AlumnoEntity> findAll();

    Optional<AlumnoEntity> findById(Integer id);

    AlumnoEntity save(AlumnoEntity alumno);

//    // Actualizar
//    AlumnoEntity update(Integer id,AlumnoEntity alumno);

//    Boolean delete(Integer id);
}
