package com.nicolasf.learningspringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;
@RestController
public class CouurseController {
    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses() {
        return Arrays.asList(
                new Course(1, "Learn AWS", "Udemy"),
                new Course(2, "Spring MVC", "Udemy"),
                new Course(3, "Spring Boot", "Udemy")
        );
    }
}
