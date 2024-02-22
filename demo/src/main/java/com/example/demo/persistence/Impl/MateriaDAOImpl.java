package com.example.demo.persistence.Impl;

import com.example.demo.entity.MateriaEntity;
import com.example.demo.persistence.IMateriaDAO;
import com.example.demo.repository.MateriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MateriaDAOImpl implements IMateriaDAO {
    @Autowired
    private MateriaRepository materiaRepository;

    @Override
    public List<MateriaEntity> findAll() {
        return (List<MateriaEntity>) materiaRepository.findAll();
    }

    @Override
    public MateriaEntity save(MateriaEntity materia) {
        return materiaRepository.save(materia);
    }
}
