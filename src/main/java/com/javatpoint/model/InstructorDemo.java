package com.javatpoint.model;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "InstructorDemo")
public class InstructorDemo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long adminId;
    private String adminName;
    @OneToMany(
            mappedBy = "instructorDemo",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<SubordinateDemo> subordinates = new ArrayList<>();

    public InstructorDemo(String adminName) {
        this.adminName = adminName;
    }

    public void setInstructor(List<SubordinateDemo> instructor) {
        this.subordinates = instructor;
    }

    public InstructorDemo() {
    }

    public Long getAdminId() {
        return adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public List<SubordinateDemo> getSubordinates() {
        return subordinates;
    }
}
