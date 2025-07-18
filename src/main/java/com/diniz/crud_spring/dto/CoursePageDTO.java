package com.diniz.crud_spring.dto;

import java.util.List;

public record CoursePageDTO (
    List<CourseDTO> courses,
    long totalElements,
    long totalPages
) {}
