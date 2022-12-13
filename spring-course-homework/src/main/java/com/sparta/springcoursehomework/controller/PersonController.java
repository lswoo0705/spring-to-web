package com.sparta.springcoursehomework.controller;

import com.sparta.springcoursehomework.entity.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    @GetMapping("/myinfo")
    public Person getCourses() {
        Person person = new Person();
        person.setName("민지");
        person.setAge(18);
        person.setGender("여자");
        person.setAddress("내마음속");
        person.setJob("가수");

        return person;
    }
}
