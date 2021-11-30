package com.javatpoint.model;

import javax.persistence.*;

@Entity
@Table (name = "SubordinateDemo")
public class SubordinateDemo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long subordinateId;
    private String subordinateName ;
    @ManyToOne
    @JoinColumn (name = "adminId")
    private InstructorDemo instructorDemo;

    public SubordinateDemo(String subordinateName, InstructorDemo instructorDemo) {
        this.subordinateName = subordinateName;
        this.instructorDemo = instructorDemo;
    }

    public SubordinateDemo() {
    }

/*    public Long getSubordinateId() {
        return subordinateId;
    }*/

    public String getSubordinateName() {
        return subordinateName;
    }

}
