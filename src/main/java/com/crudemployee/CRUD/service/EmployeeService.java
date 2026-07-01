package com.crudemployee.CRUD.service;


import com.crudemployee.CRUD.Entidad.Employee;
import com.crudemployee.CRUD.repository.EmployeeRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class EmployeeService {
    private final EmployeeRepository repository;

    public EmployeeService(EmployeeRepository repository) {
        this.repository = repository;
    }

    public Flux<Employee> getAll() {
        return repository.findAll();
    }

    public Mono<Employee> getById(Long id) {
        return repository.findById(id);
    }

    public Mono<Employee> save(Employee employee) {
        return repository.save(employee);
    }

    public Mono<Void> delete(Long id) {
        return repository.deleteById(id);
    }
}