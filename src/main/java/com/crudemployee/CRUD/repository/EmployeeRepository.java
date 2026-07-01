package com.crudemployee.CRUD.repository;

import com.crudemployee.CRUD.Entidad.Employee;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;


public interface EmployeeRepository extends ReactiveCrudRepository<Employee, Long> {
}
