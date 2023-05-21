package com.bindebackend.bindebackend.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student-name", nullable = false)
    private String name;
    @Column(name = "student-address")
    private String address;
    @Column(name = "email")
    private String email;
    private Long id;
}
