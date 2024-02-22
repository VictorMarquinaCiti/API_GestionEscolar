package com.example.demo.service.Impl;

import com.example.demo.entity.AlumnoEntity;
import com.example.demo.persistence.IAlumnoDAO;
import com.example.demo.service.IAlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlumnoServiceImpl implements IAlumnoService{

    @Autowired
    private IAlumnoDAO iAlumnoDAO;

    @Override
    public List<AlumnoEntity> findAll() {
        return iAlumnoDAO.findAll();
    }

    public Optional<AlumnoEntity> findById(Integer id) {
        return  iAlumnoDAO.findById(id);
    }

    public AlumnoEntity save(AlumnoEntity alumno){
        return iAlumnoDAO.save(alumno);
    }

//    @Override
//    public Boolean delete(Integer id) {
//        return findById(id).map(alumno -> {
//            iAlumnoDAO.delete(id);
//            return true;
//        }).orElse(false);
//    }

//    @Override
//    public AlumnoEntity update(Integer id, AlumnoEntity alumno) {
//        Optional<AlumnoEntity> alumnoActualizado = iAlumnoDAO.findById(id);
//        return iAlumnoDAO.update(id, alumno);
//    }



}
