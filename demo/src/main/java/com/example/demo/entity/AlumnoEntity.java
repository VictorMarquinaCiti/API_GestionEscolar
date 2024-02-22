package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "alumno")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AlumnoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Integer idAlumno;

    @Column(nullable = false, length = 50)
    private String nombre;

    @Column(nullable = false, length = 50)
    private String apellidoPaterno;
    @Column(nullable = false, length = 50)
    private String apellidoMaterno;

    @OneToMany(mappedBy = "alumno", cascade = CascadeType.ALL)
    private List<AlumnoMateriaEntity> calificaciones;



//    @OneToMany(mappedBy = "alumno")
//    List<AlumnoMateriaEntity> promedio;

//    @ManyToMany(cascade = CascadeType.ALL)
//    @JoinTable(
//            name = "alumno_materia",
//            joinColumns = @JoinColumn(name = "id_alumno"),
//            inverseJoinColumns = @JoinColumn( name = "id_materia")
//    )
//    private List<MateriaEntity> materias;


    public Integer getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(Integer idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }
}
