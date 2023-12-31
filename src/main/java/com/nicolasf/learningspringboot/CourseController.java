package com.nicolasf.learningspringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;
@RestController
public class CourseController {
    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses() {
        return Arrays.asList(
                new Course(1, "Learn AWS", "Udemy"),
                new Course(2, "Spring MVC", "Udemy"),
                new Course(3, "Spring Boot", "Udemy"),
                new Course(4, "Arquitecto", "Universidad ORT Uruguay"),
                new Course(5, "Analista Programador", "Universidad ORT Uruguay"),
                new Course(6, "Analista TI", "Universidad ORT Uruguay")
        );
    }
}
