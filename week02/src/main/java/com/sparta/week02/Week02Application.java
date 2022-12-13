package com.sparta.week02;

import com.sparta.week02.domain.Course;
import com.sparta.week02.domain.CourseRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.List;

@EnableJpaAuditing  // 이게 있어야 수정일자가 스프링을 통해 반영이 된다.
@SpringBootApplication
public class Week02Application {

    public static void main(String[] args) {
        SpringApplication.run(Week02Application.class, args);
    }

    // Week02Application.java 의 main 함수 아래에 붙여주세요.
    @Bean
    public CommandLineRunner demo(CourseRepository repository) {
        return (args) -> {
            Course course1 = new Course("웹개발의 봄 Spring", "남병관");
            repository.save(course1);

            List<Course> courseList = repository.findAll();
            for (int i = 0; i < courseList.size(); i++) {
                Course c = courseList.get(i);
                System.out.println(c.getTitle());
                System.out.println(c.getTutor());
            }
        };
    }

}
