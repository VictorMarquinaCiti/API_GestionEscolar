package com.example.demo.persistence;

import com.example.demo.entity.AlumnoEntity;
import com.example.demo.entity.MateriaEntity;

import java.util.List;

public interface IMateriaDAO {
    List<MateriaEntity> findAll();

    MateriaEntity save(MateriaEntity materia);
}
