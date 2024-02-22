package com.example.demo.repository;

import com.example.demo.entity.AlumnoMateriaEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

// Incluyo ListCrudRepository para metodos CRUD
// Esta interfaz tiene como param. recibe el Entity al que hace referencia y el tipo de dato de su pk
@Repository
public interface AlumnoMateriaRepository extends ListCrudRepository<AlumnoMateriaEntity, Integer> {
    // Querys para promedio general y por materia
    // General
    @Query(value = "SELECT AVG(am.calificacion) FROM alumno_materia am WHERE am.id_alumno = :idAlumno", nativeQuery = true)
    Double getPromedioGen(@Param("idAlumno") Integer idAlumno);
}
