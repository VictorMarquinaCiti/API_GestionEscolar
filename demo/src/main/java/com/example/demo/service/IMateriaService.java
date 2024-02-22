package com.example.demo.service;

import com.example.demo.entity.AlumnoEntity;
import com.example.demo.entity.MateriaEntity;

import java.util.List;

public interface IMateriaService {
    List<MateriaEntity> findAll();

    MateriaEntity save(MateriaEntity materia);
}
