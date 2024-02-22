package com.example.demo.persistence.Impl;

import com.example.demo.entity.AlumnoMateriaEntity;
import com.example.demo.persistence.IAlumnoMateriaDAO;
import com.example.demo.repository.AlumnoMateriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AlumnoMateriaDAOImpl implements IAlumnoMateriaDAO {
    @Autowired
    private AlumnoMateriaRepository alumnoMateriaRepository;

    @Override
    public List<AlumnoMateriaEntity> findAll() {
        return (List<AlumnoMateriaEntity>) alumnoMateriaRepository.findAll();
    }

    // Promedio general
    public Double getPromedioGen(Integer idAlumno) { return (Double) alumnoMateriaRepository.getPromedioGen(idAlumno); }
}
