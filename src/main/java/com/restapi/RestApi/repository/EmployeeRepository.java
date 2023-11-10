package com.restapi.RestApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restapi.RestApi.Entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
