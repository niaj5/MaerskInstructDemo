package com.javatpoint.controller;

import com.javatpoint.model.InstructorDemo;
import com.javatpoint.model.SubordinateDemo;
import com.javatpoint.service.InstructorDemoService;
import com.javatpoint.service.SubordinateDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//mark class as Controller
@RestController
public class DemoController {
    //autowire the BooksService class

    @Autowired
    SubordinateDemoService subordinateDemoService;
    @Autowired
    InstructorDemoService instructorDemoService;

    //creating a get mapping that retrieves all the books detail from the database

    @GetMapping("/subs/{subordinateId}")
    private SubordinateDemo getInstructorDetails(@PathVariable("subordinateId") Long subordinateId) {
        return subordinateDemoService.getDetailsByid(subordinateId);
    }

    @GetMapping("/admin/instructor/{adminId}")
    private InstructorDemo getSubOrdinateDetails(@PathVariable("adminId") Long adminId) {
        return instructorDemoService.getSubDetailsByid(adminId);
    }


}
