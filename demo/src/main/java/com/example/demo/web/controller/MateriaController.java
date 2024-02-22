package com.example.demo.web.controller;

import com.example.demo.entity.MateriaEntity;
import com.example.demo.repository.MateriaRepository;
import com.example.demo.service.IMateriaService;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/gestion_escolar/materia")
public class MateriaController {
    // Inyeccion dependencias
    @Autowired
    private IMateriaService iMateriaService;

    @Autowired
    private MateriaRepository materiaRepository;

    @GetMapping
    public ResponseEntity<List<MateriaEntity>> getAllMaterias(){
        List<MateriaEntity> materias = iMateriaService.findAll();
        return ResponseEntity.ok(materias);
    }

    @GetMapping("/{id}")
    public ResponseEntity<MateriaEntity> getMateriaById(@PathVariable Integer id){
        Optional<MateriaEntity> optionalMateria = materiaRepository.findById(id);
        return optionalMateria.map(materia -> ResponseEntity.ok().body(materia))
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping("/crear")
    public ResponseEntity<MateriaEntity> createMateria(@RequestBody MateriaEntity materia) {
        MateriaEntity materiaEntity = iMateriaService.save(materia);
        return ResponseEntity.ok(materiaEntity);
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateMateria(@PathVariable Integer id, @RequestBody MateriaEntity materia) {
        Optional<MateriaEntity> optional = materiaRepository.findById(id);
        return optional.map(props -> {
            props.setNombreMateria(materia.getNombreMateria());
            materiaRepository.save(materia);
            return ResponseEntity.ok("Actualizado: Materia");
        }).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteMateria(@PathVariable Integer id) {
        Optional<MateriaEntity> optional = materiaRepository.findById(id);
        return optional.map(props -> {
            materiaRepository.delete(props);
            return ResponseEntity.ok("Eliminado: Materia");
        }).orElseGet(() -> ResponseEntity.notFound().build());
    }
}
