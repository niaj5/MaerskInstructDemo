package com.javatpoint.service;

import com.javatpoint.model.SubordinateDemo;
import com.javatpoint.repository.SubordinateDemoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SubordinateDemoService {
    private final List<SubordinateDemo> listIn = new ArrayList<>();

    @Autowired
    SubordinateDemoRepository subordinateDemoRepository;

    public SubordinateDemo getDetailsByid(Long subId) {

        return subordinateDemoRepository.findById(subId).get();


    }


}
