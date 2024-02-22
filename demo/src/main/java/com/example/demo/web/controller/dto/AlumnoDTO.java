package com.example.demo.web.controller.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AlumnoDTO {
    private Integer idAlumno;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
}
