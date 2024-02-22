package com.example.demo.service.Impl;

import com.example.demo.entity.AlumnoEntity;
import com.example.demo.entity.MateriaEntity;
import com.example.demo.persistence.IMateriaDAO;
import com.example.demo.service.IMateriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MateriaServiceImpl implements IMateriaService {
    @Autowired
    private IMateriaDAO iMateriaDao;

    @Override
    public List<MateriaEntity> findAll() {
        return iMateriaDao.findAll();
    }

    @Override
    public MateriaEntity save(MateriaEntity materia){
        return iMateriaDao.save(materia);
    }
}
