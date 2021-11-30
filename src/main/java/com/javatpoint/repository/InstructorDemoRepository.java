package com.javatpoint.repository;

import com.javatpoint.model.InstructorDemo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstructorDemoRepository extends CrudRepository<InstructorDemo , Long> {

}
