package com.example.authedms.repositories;

import com.example.authedms.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    Optional<Employee> findEmployeeByIdAndDepartmentId(Long userId, Long orgId);
}
