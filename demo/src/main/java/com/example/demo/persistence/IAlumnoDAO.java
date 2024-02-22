package com.example.demo.persistence;

import com.example.demo.entity.AlumnoEntity;

import java.util.List;
import java.util.Optional;

// Data Access Object
public interface IAlumnoDAO {
    // Creo metodos para acceso
    // CRUD
    List<AlumnoEntity> findAll();

    // Encontrar por ID
    Optional<AlumnoEntity> findById(Integer id);

    // Guardar
    AlumnoEntity save(AlumnoEntity alumno);

//    // Eliminar
//    Boolean delete(Integer id);

    // Actualizar
//    AlumnoEntity update(Integer id,AlumnoEntity alumno);

}
