package com.crudemployee.CRUD.controller;

import com.crudemployee.CRUD.Entidad.Employee;
import com.crudemployee.CRUD.dto.EmployeeDTO;
import com.crudemployee.CRUD.service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    private final EmployeeService service;

    public EmployeeController(EmployeeService service) {
        this.service = service;
    }

    @GetMapping
    public Flux<Employee> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Mono<Employee> getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping
    public Mono<Employee> create(@Valid @RequestBody EmployeeDTO dto) {
        Employee employee = new Employee(null, dto.getName(), dto.getRole());
        return service.save(employee);
    }

    @PutMapping("/{id}")
    public Mono<Employee> update(@PathVariable Long id, @Valid @RequestBody EmployeeDTO dto) {
        Employee employee = new Employee(id, dto.getName(), dto.getRole());
        return service.save(employee);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> delete(@PathVariable Long id) {
        return service.delete(id);
    }
}
