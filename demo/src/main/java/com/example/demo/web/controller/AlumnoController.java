package com.example.demo.web.controller;

import com.example.demo.entity.AlumnoEntity;
import com.example.demo.repository.AlumnoRepository;
import com.example.demo.service.IAlumnoService;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/gestion_escolar/alumno")
public class AlumnoController {


    @Autowired
    private IAlumnoService iAlumnoService;

    @Autowired
    private AlumnoRepository alumnoRepository;

    @GetMapping
    public ResponseEntity<List<AlumnoEntity>> getAlumnos(){
        List<AlumnoEntity> alumnos = iAlumnoService.findAll();
        return ResponseEntity.ok(alumnos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<AlumnoEntity>> getAlumnoById(@PathVariable Integer id){
        Optional<AlumnoEntity> alumno = iAlumnoService.findById(id);
        return ResponseEntity.ok(alumno);
    }

    @PostMapping("/crear")
    public ResponseEntity<AlumnoEntity> crearAlumno(@RequestBody AlumnoEntity alumno){
        AlumnoEntity nuevoAlumno = iAlumnoService.save(alumno);
        return ResponseEntity.ok(nuevoAlumno);
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateAlumno(@PathVariable Integer id, @RequestBody AlumnoEntity updatedAlumno) {
        Optional<AlumnoEntity> alumno = alumnoRepository.findById(id);
        return alumno.map(props -> {
            props.setNombre(updatedAlumno.getNombre());
            props.setApellidoPaterno(updatedAlumno.getApellidoPaterno());
            props.setApellidoMaterno(updatedAlumno.getApellidoMaterno());
            alumnoRepository.save(props);
            return ResponseEntity.ok("Actualizado: Alumno");
        }).orElseGet(() -> ResponseEntity.notFound().build());
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteAlumno(@PathVariable Integer id) {
        Optional<AlumnoEntity> alumnoDelete = iAlumnoService.findById(id);
        return alumnoDelete.map(alumno -> {
            alumnoRepository.delete(alumno);
            return ResponseEntity.ok("Eliminado:" + id);
        }).orElseGet(() -> ResponseEntity.notFound().build());
    }

}
