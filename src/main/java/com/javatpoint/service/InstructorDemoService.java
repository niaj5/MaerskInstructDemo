package com.javatpoint.service;

import com.javatpoint.model.InstructorDemo;
import com.javatpoint.model.SubordinateDemo;
import com.javatpoint.repository.InstructorDemoRepository;
import com.javatpoint.repository.SubordinateDemoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InstructorDemoService {
    private final List<SubordinateDemo> list = new ArrayList<>();

    @Autowired
    InstructorDemoRepository instructorDemoRepository;

    public InstructorDemo getSubDetailsByid(Long adminId) {

        return instructorDemoRepository.findById(adminId).get();


    }
}
