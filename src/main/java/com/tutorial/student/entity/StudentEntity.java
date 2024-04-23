package com.tutorial.student.entity;


import javax.persistence.*;

@Entity
@Table(name = "mt_student")
public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "rayon")
    private String rayon;

    @Column(name = "rombel")
    private String rombel;

    public StudentEntity() {
    }

    public StudentEntity(Long id, String name, String rayon, String rombel) {
        this.id = id;
        this.name = name;
        this.rayon = rayon;
        this.rombel = rombel;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRayon() {
        return rayon;
    }

    public void setRayon(String rayon) {
        this.rayon = rayon;
    }

    public String getRombel() {
        return rombel;
    }

    public void setRombel(String rombel) {
        this.rombel = rombel;
    }
}
