package com.example.authedms.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "role")
@Data
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String roleName;

    @ManyToMany(mappedBy = "roles", fetch = FetchType.LAZY)
    private List<Employee> employeeList;
}
