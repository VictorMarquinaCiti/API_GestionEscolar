package com.example.demo.web.controller;

import com.example.demo.entity.AlumnoEntity;
import com.example.demo.entity.AlumnoMateriaEntity;
import com.example.demo.service.IAlumnoMateriaService;
import com.example.demo.service.IAlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/gestion_escolar/calificacion")
public class AlumnoMateriaController {
    @Autowired
    private IAlumnoMateriaService iAlumnoMateriaService;

    // Retorna la tabla de las calificaciones
    @GetMapping
    public ResponseEntity<List<AlumnoMateriaEntity>> getAllCalificaciones(){
        List<AlumnoMateriaEntity> calificaciones = iAlumnoMateriaService
                .findAll();
        return ResponseEntity.ok(calificaciones);
    }

    //Promedios
    @GetMapping("/{idAlumno}/promedio")
    public ResponseEntity<Double> getPromedioGen(@PathVariable Integer idAlumno){
        Double promedio = iAlumnoMateriaService.getPromedioGen(idAlumno);
        if(promedio == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(promedio);
    }
}
