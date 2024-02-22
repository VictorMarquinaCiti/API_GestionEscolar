package com.example.demo.web.controller;

import com.example.demo.repository.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/gestion_escolar/general")
public class GeneralAlumnoController {
    // Cargamos dependencias
    @Autowired
    private AlumnoRepository alumnoRepository;

}
