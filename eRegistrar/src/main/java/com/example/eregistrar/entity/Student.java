package com.example.eregistrar.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Student {
    @Id
    @GeneratedValue
    private Long studentId;
    private String studentNumber;
    private String firstName;
    private String middleName;
    private String lastName;
    private double cgpa;
    private String enrollmentDate;
    private boolean isInternational;
}
