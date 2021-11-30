package com.javatpoint.repository;

import com.javatpoint.model.SubordinateDemo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubordinateDemoRepository extends CrudRepository<SubordinateDemo ,Long> {


}
