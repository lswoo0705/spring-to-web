package com.sparta.week02.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@RequiredArgsConstructor
public class CourseRequestDto {
    private final String title; // private로 선언한 녀석에게 final을 붙이면 기본 생성자가 생성된다
    private final String tutor; // 근데 없을 수 있기 때문에 오류가 뜬다 -> @RequiredArgsConstructor
}
