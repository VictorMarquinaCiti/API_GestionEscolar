package com.example.demo.service.Impl;

import com.example.demo.entity.AlumnoMateriaEntity;
import com.example.demo.persistence.IAlumnoDAO;
import com.example.demo.persistence.IAlumnoMateriaDAO;
import com.example.demo.service.IAlumnoMateriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlumnoMateriaServiceImpl implements IAlumnoMateriaService {
    @Autowired
    private IAlumnoMateriaDAO iAlumnoMateriaDAO;

    @Override
    public List<AlumnoMateriaEntity> findAll() {
        return iAlumnoMateriaDAO.findAll();
    }

    @Override
    public Double getPromedioGen(Integer idAlumno) {
        return iAlumnoMateriaDAO.getPromedioGen(idAlumno);
    }
}
