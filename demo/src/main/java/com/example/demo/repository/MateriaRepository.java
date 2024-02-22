package com.example.demo.repository;

import com.example.demo.entity.MateriaEntity;
import org.springframework.data.repository.ListCrudRepository;

public interface MateriaRepository extends ListCrudRepository<MateriaEntity, Integer> {
}
