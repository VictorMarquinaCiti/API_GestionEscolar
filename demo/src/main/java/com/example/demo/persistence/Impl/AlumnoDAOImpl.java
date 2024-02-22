package com.example.demo.persistence.Impl;

import com.example.demo.entity.AlumnoEntity;
import com.example.demo.persistence.IAlumnoDAO;
import com.example.demo.repository.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class AlumnoDAOImpl implements IAlumnoDAO {
    @Autowired
    private AlumnoRepository alumnoRepository;

    @Override
    public List<AlumnoEntity> findAll() {
        return (List<AlumnoEntity>) alumnoRepository.findAll();
    }

    @Override
    public Optional<AlumnoEntity> findById(Integer id) {
        return alumnoRepository.findById(id);
    }

    @Override
    public AlumnoEntity save(AlumnoEntity alumno) {
        return alumnoRepository.save(alumno);
    }

//    @Override
//    public Boolean delete(Integer id) {
//        return alumnoRepository.delete(id);
//    }

//    @Override
//    public AlumnoEntity update(Integer id, AlumnoEntity alumno) {
//
//    }


}
