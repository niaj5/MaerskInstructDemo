package com.javatpoint;

import com.javatpoint.model.InstructorDemo;
import com.javatpoint.model.SubordinateDemo;
import com.javatpoint.repository.InstructorDemoRepository;
import com.javatpoint.repository.SubordinateDemoRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class SpringBootCrudOperationApplication {
    public static void main(String[] args) {

        ConfigurableApplicationContext configurableApplicationContext =
                SpringApplication.run(SpringBootCrudOperationApplication.class, args);
        InstructorDemoRepository instructorDemoRepository =
                configurableApplicationContext.getBean(InstructorDemoRepository.class);
        SubordinateDemoRepository subordinateDemoRepository=
                configurableApplicationContext.getBean(SubordinateDemoRepository.class);


        InstructorDemo admin = new InstructorDemo("Admin");
        SubordinateDemo instructor1 = new SubordinateDemo("instructor1", admin);
        SubordinateDemo instructor2 = new SubordinateDemo("instructor2", admin);
        List<SubordinateDemo> subordinates = Arrays.asList(instructor1, instructor2);
        admin.setInstructor(subordinates);
        instructorDemoRepository.save(admin);

        InstructorDemo instructor = new InstructorDemo("Instructor1");
        SubordinateDemo instructor3 = new SubordinateDemo("instructor3", instructor);
        List<SubordinateDemo> subordinates1 = Arrays.asList(instructor3);
        instructor.setInstructor(subordinates1);
        instructorDemoRepository.save(instructor);



//  instructorDemoRepository.delete(admin);

    }
}
